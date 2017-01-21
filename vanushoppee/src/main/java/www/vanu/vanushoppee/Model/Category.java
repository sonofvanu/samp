package www.vanu.vanushoppee.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Category {
////----------------------variable declaration for the POJO class-----------------------------///////
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	@NotEmpty
	@Size(min = 5, max = 15) @Column
	private int cname;
	///-----------------------Getter and Setter Methods for the the POJO class-------------------///
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getCname() {
		return cname;
	}
	public void setCname(int cname) {
		this.cname = cname;
	}
////----------------------printing statement for the POJO class-----------------------------///////
	@Override
	public String toString() {
		return "Category [id=" + cid + ", cname=" + cname + "]";
	}
}
