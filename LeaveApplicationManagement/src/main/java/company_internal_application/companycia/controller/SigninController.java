package company_internal_application.companycia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import company_internal_application.companycia.model.Credentials;
import company_internal_application.companycia.model.Employee;

@Controller
public class SigninController {

	@Autowired
	private EmployeeCiaRepository employeeRepository;
	
	@Autowired
	private CredentialCiaRepository credentialRepository;
	
	
	// http://localhost:8080/signin
		@RequestMapping(value = "signin",method = RequestMethod.GET)
		public String getSignup() {
			return "Signin";
		}
		
		// http://localhost:8080/signin
		@RequestMapping(value = "signin",method = RequestMethod.POST)
		public String postSignup(Employee emp,Credentials cre ,ModelMap model) {
			model.put("emp",emp);
			credentialRepository.save(cre);
			employeeRepository.save(emp);
			return "signinok";
		}
	
}
