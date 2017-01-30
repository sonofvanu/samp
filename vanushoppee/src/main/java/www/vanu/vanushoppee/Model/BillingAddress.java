package www.vanu.vanushoppee.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class BillingAddress {
	//// ----------------------variable declaration for the POJO
	//// class-----------------------------///////
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int baid;
	@NotEmpty
	@Size(min = 5, max = 30)
	@Column
	private String baname;
	@NotEmpty
	@Size(min = 5, max = 30)
	@Column
	private String baaddressone;
	@NotEmpty
	@Size(min = 5, max = 30)
	@Column
	private String baaddresstwo;
	@NotNull
	@Size(min = 5)
	@Column
	private String bapincode;
	@NotNull
	@Size(min = 5)
	@Column
	private String bacontact;
	@NotEmpty
	@Size(min = 5, max = 30)
	@Column
	private String bacity;

	/// -----------------------Getter and Setter Methods for the the POJO
	/// class-------------------///
	public int getBaid() {
		return baid;
	}

	public void setBaid(int baid) {
		this.baid = baid;
	}

	public String getBaname() {
		return baname;
	}

	public void setBaname(String baname) {
		this.baname = baname;
	}

	public String getBaaddressone() {
		return baaddressone;
	}

	public void setBaaddressone(String baaddressone) {
		this.baaddressone = baaddressone;
	}

	public String getBaaddresstwo() {
		return baaddresstwo;
	}

	public void setBaaddresstwo(String baaddresstwo) {
		this.baaddresstwo = baaddresstwo;
	}

	public String getBapincode() {
		return bapincode;
	}

	public void setBapincode(String bapincode) {
		this.bapincode = bapincode;
	}

	public String getBacontact() {
		return bacontact;
	}

	public void setBacontact(String bacontact) {
		this.bacontact = bacontact;
	}

	public String getBacity() {
		return bacity;
	}

	public void setBacity(String bacity) {
		this.bacity = bacity;
	}

	//// ----------------------printing statement for the POJO
	//// class-----------------------------///////
	@Override
	public String toString() {
		return "BillingAddress [baid=" + baid + ", baname=" + baname + ", bacontact=" + bacontact + ", baaddressone="
				+ baaddressone + ", baaddresstwo=" + baaddresstwo + ", bacity=" + bacity + ", bapincode=" + bapincode
				+ "]";
	}
}
