package company_internal_application.companycia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import company_internal_application.companycia.model.Credentials;
import company_internal_application.companycia.model.Employee;
import company_internal_application.companycia.service.CiaService;

@Controller
@SessionAttributes("eid")
public class LoginController {
	
	@Autowired
	CiaService service;
	
	// http://localhost:8080/login
		@RequestMapping(value = "login",method = RequestMethod.GET)
		public String getIndex() {
			return "Login";
		}
		
		// http://localhost:8080/login
		@RequestMapping(value = "login",method = RequestMethod.POST)
		public String postIndex(@RequestParam long eid , @RequestParam String password, ModelMap model) {
			Credentials ctest = service.findCredentialByEid(eid);
			Employee etest = service.findEmployeeByEid(eid);
			model.put("name", etest.getName());
			model.put("mail", etest.getEmail());
			model.put("number", etest.getPhoneNumber());
			model.put("address", etest.getAddress());
			model.put("city", etest.getCity());
			model.put("eid", eid);
			model.put("pwd", password);
			
			if (ctest.getEid() == eid && ctest.getPassword().equals(password)) {
				return "Userpage";
			}
			else {
				return "loginfailed";
			}
		}
}
