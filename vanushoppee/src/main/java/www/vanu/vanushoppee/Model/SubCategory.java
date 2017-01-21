package www.vanu.vanushoppee.Model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class SubCategory {
////----------------------variable declaration for the POJO class-----------------------------///////
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int scid;
	@NotEmpty @Size(min=3,max=12) @Column
	private String scname;
	///-----------------------Getter and Setter Methods for the the POJO class-------------------///
	public int getScid() {
		return scid;
	}
	public void setScid(int scid) {
		this.scid = scid;
	}
	public String getScname() {
		return scname;
	}
	public void setScname(String scname) {
		this.scname = scname;
	}
////----------------------printing statement for the POJO class-----------------------------///////
	@Override
	public String toString() {
		return "SubCategory [scid=" + scid + ", scname=" + scname + "]";
	}
}
