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
////----------------------variable declaration for the POJO class-----------------------------///////
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	@Size(min = 3, max = 20)
	@NotEmpty
	private String fname;
	@Size(min = 3, max = 20)
	@NotEmpty
	private String lname;
	@Email
	@NotEmpty
	private String email;
	@NotEmpty
	private String sex;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@NotEmpty
	private Date dob;
	@NotEmpty
	private String city;
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
	///-----------------------Getter and Setter Methods for the the POJO class-------------------///
	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
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
////----------------------printing statement for the POJO class-----------------------------///////
	@Override
	public String toString() {
		return "User [id=" + uid + ", fname=" + fname + ",lname" + lname + ", sex=" + sex + ", email=" + email + ",city"
				+ city + ",date of birth" + dob + ",pincode" + pincode + ", phno=" + phno + ", address line 1="
				+ addresslineone + ", addressl line 2=" + addresslinetwo + "]";
	}
}
