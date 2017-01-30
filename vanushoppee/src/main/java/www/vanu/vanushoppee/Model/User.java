package www.vanu.vanushoppee.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class User {
	//// ----------------------variable declaration for the POJO
	//// class-----------------------------///////
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long uid;
	@Size(min = 3, max = 20)
	@NotEmpty
	private String fname;
	@Size(min = 3, max = 20)
	@NotEmpty
	private String lname;
	@Email
	@NotEmpty @Id
	private String email;
	@NotEmpty
	private String sex;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@NotEmpty
	private Date dob;
	@NotEmpty
	private String city;
	@NotEmpty
	private String state;
	@Size(min = 6, max = 6)
	@NotEmpty
	private double pincode;
	@NotEmpty
	@Size(min = 10, max = 50)
	private String addresslineone;
	@NotEmpty
	@Size(min = 10, max = 50)
	private String addresslinetwo;
	@Column
	@NotNull
	@Size(min = 10)
	private String phno;
	@Column
	private String userrole="ROLE_USER";
	@Column
	@NotEmpty
	@Size(min = 7, max = 15)
	private String username;
	@Column
	private boolean status = true;
	@Column
	@NotEmpty
	@Size(min = 7, max = 15)
	private String password;

	/// -----------------------Getter and Setter Methods for the the POJO
	/// class-------------------///
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
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

	public double getPincode() {
		return pincode;
	}

	public void setPincode(double pincode) {
		this.pincode = pincode;
	}

	public String getAddresslineone() {
		return addresslineone;
	}

	public void setAddresslineone(String addresslineone) {
		this.addresslineone = addresslineone;
	}

	public String getAddresslinetwo() {
		return addresslinetwo;
	}

	public void setAddresslinetwo(String addresslinetwo) {
		this.addresslinetwo = addresslinetwo;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public String getUserrole() {
		return userrole;
	}

	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	//// ----------------------printing statement for the POJO
	//// class-----------------------------///////
	@Override
	public String toString() {
		return "User [id=" + uid + ", fname=" + fname + ",lname" + lname + ", sex=" + sex + ", email=" + email + ",city"
				+ city + ",date of birth" + dob + ",pincode" + pincode + ", phno=" + phno + ", address line 1="
				+ addresslineone + ", addressl line 2=" + addresslinetwo + ",userrole=" + userrole + ",state=" + state
				+ "]";
	}

}
