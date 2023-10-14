package company_internal_application.companycia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import company_internal_application.companycia.model.Leave;


@Controller
@SessionAttributes({"eid","cl","ml","el"})
public class LeaveHistoryController {
	
	@Autowired
	LeaveCiaRepository leaverepo;

	@RequestMapping(value="LeaveHistory", method = RequestMethod.GET)
	public String getLeaveHistory(ModelMap model) {
		List<Leave> listHistory = leaverepo.findByEid((long)model.get("eid"));
		model.put("History", listHistory);
		model.get("cl");
		model.get("ml");
		model.get("cl");
		return "LeaveHistory";
	}
	
}
