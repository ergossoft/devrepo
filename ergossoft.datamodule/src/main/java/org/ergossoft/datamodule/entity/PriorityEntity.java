/**
 * 
 */
package org.ergossoft.datamodule.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

/*-
 * @author: Thilak Reddy 
 * This class is used for Defining Priority Details
 */
@Entity
@NamedNativeQueries({
		@NamedNativeQuery(name = "callGetColors", query = "call GetColors()", resultClass = PriorityEntity.class) })

public class PriorityEntity {

	/*-
	 *  id is used for identifying Priority with unique Id
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "priorityid", nullable = false)
	private Integer id;

	/*-
	 *  colorcode is used for identifying priority with colorcode
	 */

	@Column(name = "colorcode", nullable = false)
	private String colorcode;

	/*-
	 * zero-argument constructor
	 */

	public PriorityEntity() {
	}

	/*-
	 * Parameterized Constructor
	 */

	public PriorityEntity(String colorcode) {
		super();
		this.colorcode = colorcode;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the colorcode
	 */
	public String getColorcode() {
		return colorcode;
	}

	/**
	 * @param colorcode the colorcode to set
	 */
	public void setColorcode(String colorcode) {
		this.colorcode = colorcode;
	}

	/*-
	 *  for Displaying Priority details instead of hashcode
	 */

	@Override
	public String toString() {
		return "PriorityEntity [id=" + id + ", colorcode=" + colorcode + "]";
	}

}
