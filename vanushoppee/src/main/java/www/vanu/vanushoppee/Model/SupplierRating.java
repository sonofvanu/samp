package www.vanu.vanushoppee.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class SupplierRating {
	//// ----------------------variable declaration for the POJO
	//// class-----------------------------///////
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int srid;
	@Column
	@NotNull
	private int srrating;

	/// -----------------------Getter and Setter Methods for the the POJO
	/// class-------------------///
	public int getSrid() {
		return srid;
	}

	public void setSrid(int srid) {
		this.srid = srid;
	}

	public int getSrrating() {
		return srrating;
	}

	public void setSrrating(int srrating) {
		this.srrating = srrating;
	}

	//// ----------------------printing statement for the POJO
	//// class-----------------------------///////
	@Override
	public String toString() {
		return "SupplierRating [psrid=" + srid + ", srrating=" + srrating + "]";
	}
}
