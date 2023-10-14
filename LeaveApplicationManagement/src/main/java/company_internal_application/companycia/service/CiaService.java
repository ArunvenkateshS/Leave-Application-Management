package company_internal_application.companycia.service;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import company_internal_application.companycia.controller.CredentialCiaRepository;
import company_internal_application.companycia.controller.EmployeeCiaRepository;
import company_internal_application.companycia.controller.LeaveCiaRepository;
import company_internal_application.companycia.controller.LeavePolicyCiaRepositor;
import company_internal_application.companycia.model.Credentials;
import company_internal_application.companycia.model.Employee;
import company_internal_application.companycia.model.Leave;
import company_internal_application.companycia.model.LeavePolicy;

@Component
public class CiaService {

	@Autowired
	private CredentialCiaRepository credentialRepository;
	
	@Autowired
	private EmployeeCiaRepository employeeRepository;
	
	@Autowired
	private LeavePolicyCiaRepositor leavepolicyrepositor;
	
	@Autowired
	private LeaveCiaRepository leaverepository;
	
	
	// To get Credential by eid
	public Credentials findCredentialByEid(long eid) {
		for (Credentials c:credentialRepository.findByEid(eid)) {
			if (c.getEid() == eid) {
				return c;
			}	
		}
		return null;
	}
	
	// To get Employee by eid
	public Employee findEmployeeByEid(long eid) {
		for (Employee c:employeeRepository.findByEid(eid)) {
			if (c.getEid() == eid) {
				return c;
			}	
		}
		return null;
	}
	
	// To get Leavepolicy by LeaveType
	public LeavePolicy findAvailableLeaveByLeavetype(String leaveType) {
		LeavePolicy lp = leavepolicyrepositor.findById(leaveType).get();
		return lp;
	}
	
	// to get leave by id 
	public Leave findLeaveByEid(long eid) {
		for (Leave l:leaverepository.findByEid(eid)) {
			if (l.getEid() == eid) {
				return l;
			}	
		}
		return null;
	}
	
	public int[] availableBalanceLeave(long eid) {
		List<Leave> list = leaverepository.findByEid(eid);
		ArrayList<Leave> cllist = new ArrayList<>();
		ArrayList<Leave> mllist = new ArrayList<>();
		ArrayList<Leave> ellist = new ArrayList<>();
		int arr[] = new int[5];
		
		
		if (list.isEmpty()) {
			arr[0] = findAvailableLeaveByLeavetype("Casual Leave").getLeaveCount();
			arr[1] = findAvailableLeaveByLeavetype("Sick Leave").getLeaveCount();
			arr[2] = findAvailableLeaveByLeavetype("Earned Leave").getLeaveCount();
			return arr;
			}
		
		
		for (Leave l: list) {
			if (l.getLeaveType().toLowerCase().equals("casual leave")) {
				cllist.add(l);
			}
			else if (l.getLeaveType().toLowerCase().equals("sick leave")) {
				mllist.add(l);
			}
			else if (l.getLeaveType().toLowerCase().equals("earned leave")) {
				ellist.add(l);
			}
		}
		
		
		if (cllist.isEmpty()) {
			arr[0] = findAvailableLeaveByLeavetype("Casual Leave").getLeaveCount();
		}
		else {
			int clen = cllist.size();
			
			Leave ctemp = cllist.get(clen-1);
			arr[0] = ctemp.getBalanceLeave();
			
		}
		
		if (mllist.isEmpty()) {
			arr[1] = findAvailableLeaveByLeavetype("Sick Leave").getLeaveCount();
			
		}
		else {
			int mlen = mllist.size();
			Leave mtemp = mllist.get(mlen-1);
			arr[1] = mtemp.getBalanceLeave();
		}
		
		if (ellist.isEmpty()) {
			arr[2] = findAvailableLeaveByLeavetype("Earned Leave").getLeaveCount();
			
		}
		else {
			int elen = ellist.size();
			Leave etemp = ellist.get(elen-1);
			arr[2] = etemp.getBalanceLeave();
		}
		return arr;
	}
	
public int remainingBalanceLeave(Leave leave) {
		
	int[] arr = availableBalanceLeave(leave.getEid());
	if (leave.getLeaveType().toLowerCase().equals("casual leave")) {
		return arr[0] -= leave.getNoOfLeave();
	}
	else if (leave.getLeaveType().toLowerCase().equals("sick leave")) {
		return arr[1] -= leave.getNoOfLeave();
	}
	else if (leave.getLeaveType().toLowerCase().equals("earned leave")) {
		return arr[2] -= leave.getNoOfLeave();
	}
	return 0;
}
	
}
	