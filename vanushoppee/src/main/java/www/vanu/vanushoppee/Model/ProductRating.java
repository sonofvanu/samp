package www.vanu.vanushoppee.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class ProductRating {
	//// ----------------------variable declaration for the POJO
	//// class-----------------------------///////
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int prid;
	@Column
	@NotNull
	private int prrating;

	/// -----------------------Getter and Setter Methods for the the POJO
	/// class-------------------///
	public int getPrid() {
		return prid;
	}

	public void setPrid(int prid) {
		this.prid = prid;
	}

	public int getPrrating() {
		return prrating;
	}

	public void setPrrating(int prrating) {
		this.prrating = prrating;
	}

	//// ----------------------printing statement for the POJO
	//// class-----------------------------///////
	@Override
	public String toString() {
		return "ProductRating [prid=" + prid + ", prrating=" + prrating + "]";
	}
}
