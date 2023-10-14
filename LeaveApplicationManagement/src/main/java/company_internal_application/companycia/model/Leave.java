package company_internal_application.companycia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="leave_table")
public class Leave {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "leaveType")
	private String leaveType;
	
	@Column(name = "employee_id")
	private long eid;
	
	@Column(name = "no_of_leave")
	private int noOfLeave;
	
	@Column(name = "reason")
	private String Reason;
	
	@Column(name = "balance_leave")
	private int balanceLeave;
	
	public Leave() {}

	public Leave(int id, String leaveType, long eid, int noOfLeave, String reason, int balanceLeave) {
		super();
		this.id = id;
		this.leaveType = leaveType;
		this.eid = eid;
		this.noOfLeave = noOfLeave;
		Reason = reason;
		this.balanceLeave = balanceLeave;
	}

	@Override
	public String toString() {
		return "Leave [id=" + id + ", leaveType=" + leaveType + ", eid=" + eid + ", noOfLeave=" + noOfLeave
				+ ", Reason=" + Reason + ", balanceLeave=" + balanceLeave + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public long getEid() {
		return eid;
	}

	public void setEid(long eid) {
		this.eid = eid;
	}

	public int getNoOfLeave() {
		return noOfLeave;
	}

	public void setNoOfLeave(int noOfLeave) {
		this.noOfLeave = noOfLeave;
	}

	public String getReason() {
		return Reason;
	}

	public void setReason(String reason) {
		Reason = reason;
	}

	public int getBalanceLeave() {
		return balanceLeave;
	}

	public void setBalanceLeave(int balanceLeave) {
		this.balanceLeave = balanceLeave;
	}

	

	
}
