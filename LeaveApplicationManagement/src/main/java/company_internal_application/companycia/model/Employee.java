package company_internal_application.companycia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="employee_details")
public class Employee {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "employee_id")
	private long eid;
	
	@Column(name = "employee_name")
	private String name;
	
	@Column(name = "employee_mail_id")
	private String email;
	
	@Column(name = "employee_phone_number")
	private String phoneNumber;
	
	@Column(name = "employee_address")
	private String address;
	
	@Column(name = "employee_city")
	private String city;
	
	@Column(name = "employee_state")
	private String state;
	
	@Column(name = "employee_pincode")
	private String pincode;
	
	
	
	public Employee() {
	}

	public Employee(int id, long eid, String name, String email, String phoneNumber, String address, String city,
			String state, String pincode) {
		super();
		this.id = id;
		this.eid = eid;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", eid=" + eid + ", name=" + name + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", address=" + address + ", city=" + city + ", state=" + state + ", pincode=" + pincode
				+ "]";
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
	
}
	