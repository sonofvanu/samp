package www.vanu.vanushoppee.Model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class Supplier {
////----------------------variable declaration for the POJO class-----------------------------///////
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	@Column
	@NotEmpty
	@Size(min = 5, max = 20)
	private String sname;
	@Column
	@NotNull
	@Size(min = 10)
	private String scontact;
	@Email
	@NotEmpty
	@Column
	private String semail;
	@Column
	@NotEmpty
	@Size(min = 10, max = 50)
	private String shaddress;
	@Column
	@NotEmpty
	@Size(min = 10, max = 50)
	private String sbaddress;
	@Column
	@NotNull
	private double spincode;
	///-----------------------Getter and Setter Methods for the the POJO class-------------------///
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getScontact() {
		return scontact;
	}

	public void setScontact(String scontact) {
		this.scontact = scontact;
	}

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	public String getShaddress() {
		return shaddress;
	}

	public void setShaddress(String shaddress) {
		this.shaddress = shaddress;
	}

	public String getSbaddress() {
		return sbaddress;
	}

	public void setSbaddress(String sbaddress) {
		this.sbaddress = sbaddress;
	}

	public double getSpincode() {
		return spincode;
	}

	public void setSpincode(double spincode) {
		this.spincode = spincode;
	}
////----------------------printing statement for the POJO class-----------------------------///////
	@Override
	public String toString() {
		return "Supplier [sid=" + sid + ", sname=" + sname + ", scontact=" + scontact + ", semail=" + semail
				+ ", shaddress=" + shaddress + ", sbaddress=" + sbaddress + ", spincode=" + spincode + "]";
	}
}
