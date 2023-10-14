package company_internal_application.companycia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="credentials")
public class Credentials {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "employee_id")
	private long eid;
	@Column(name = "password")
	private String password;
	
	public Credentials() {}

	public Credentials(int id, long eid, String password) {
		super();
		this.id = id;
		this.eid = eid;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Credentials [id=" + id + ", eid=" + eid + ", password=" + password + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getEid() {
		return eid;
	}

	public void setEid(long eid) {
		this.eid = eid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	};
	
	
}