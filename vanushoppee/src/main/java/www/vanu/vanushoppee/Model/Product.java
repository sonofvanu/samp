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
public class Product {
////----------------------variable declaration for the POJO class-----------------------------///////
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pid;
	@Column @NotEmpty @Size(min=5,max=60)
	private String pname;
	@Column @NotEmpty @Size(min=10,max=60)
	private String pdescription;
	@Column @NotNull @Size(min=5,max=60)
	private int pquantity;
	@Column @NotEmpty @Size(min=5,max=60)
	private String pbrand;
	@Column @NotNull 
	private String pamount;
	@Column @NotNull 
	private int pprice;
	///-----------------------Getter and Setter Methods for the the POJO class-------------------///
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdescription() {
		return pdescription;
	}
	public void setPdescription(String pdescription) {
		this.pdescription = pdescription;
	}
	public int getPquantity() {
		return pquantity;
	}
	public void setPquantity(int pquantity) {
		this.pquantity = pquantity;
	}
	public String getPbrand() {
		return pbrand;
	}
	public void setPbrand(String pbrand) {
		this.pbrand = pbrand;
	}
	public String getPamount() {
		return pamount;
	}
	public void setPamount(String pamount) {
		this.pamount = pamount;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
////----------------------printing statement for the POJO class-----------------------------///////
	@Override
	public String toString() {
		return "Product [id=" + pid + ", pname=" + pname + ",pbrand" + pbrand + ", pamount=" + pamount + ", pprice=" + pprice + ",pquantity"
				+ pquantity + ",pdescription" + pdescription + "]";
	}

}
