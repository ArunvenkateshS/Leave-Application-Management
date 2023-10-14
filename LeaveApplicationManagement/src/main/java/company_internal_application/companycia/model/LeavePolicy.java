package company_internal_application.companycia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="Leave_Policy_Table")
public class LeavePolicy {

	@Id
	private String leaveType;
	
	@Column(name = "leave_Count")
	private int leaveCount;
	
	public LeavePolicy() {}

	public LeavePolicy(String leaveType, int leaveCount) {
		super();
		this.leaveType = leaveType;
		this.leaveCount = leaveCount;
	}

	@Override
	public String toString() {
		return "LeavePolicy [leaveType=" + leaveType + ", leaveCount=" + leaveCount + "]";
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public int getLeaveCount() {
		return leaveCount;
	}

	public void setLeaveCount(int leaveCount) {
		this.leaveCount = leaveCount;
	}
	
	
	
}
