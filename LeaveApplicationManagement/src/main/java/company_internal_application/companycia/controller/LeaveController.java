package company_internal_application.companycia.controller;

import java.security.Provider.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import company_internal_application.companycia.model.Credentials;
import company_internal_application.companycia.model.Leave;
import company_internal_application.companycia.model.LeavePolicy;
import company_internal_application.companycia.service.CiaService;
import jakarta.servlet.http.HttpSession;

@Controller
@SessionAttributes({"eid","cl","ml","el"})
public class LeaveController {

	@Autowired
	private LeaveCiaRepository leaveRepository;
	
	@Autowired
	private LeavePolicyCiaRepositor leavepolicyrepositor;
	
	@Autowired
	private CiaService service;

	
//	http://localhost:8080/Leaveform	
	@RequestMapping(value="Leaveform",method = RequestMethod.GET)
	public String getLeave(Leave leave,ModelMap model) {
		int arr[] = service.availableBalanceLeave((long)model.get("eid"));
		model.put("cl", arr[0]);
		model.put("ml", arr[1]);
		model.put("el", arr[2]);
		return "Leaveform";
	}
	
//	http://localhost:8080/Leaveform
	@RequestMapping(value="Leaveform",method = RequestMethod.POST)
	public String postLeave(Leave leave,ModelMap model) {
		model.get("eid");
		leave.setEid((long)model.get("eid"));
		int balance = service.remainingBalanceLeave(leave);
		leave.setBalanceLeave(balance);
		model.put("leaveType", leave.getLeaveType());
		model.put("leave", leave);
		model.put("balance", leave.getBalanceLeave());
		leaveRepository.save(leave);
		return "Leaveok";
	}
	
}
