/**
 * 
 */
package org.ergossoft.datamodule.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

/**
 * Class Name: PriorityEntity Purpose: Entity Class
 * 
 * @version
 * @author THILAK REDDY
 *
 */
@Entity
@NamedNativeQueries({
		@NamedNativeQuery(name = "callGetColors", query = "call GetColors()", resultClass = PriorityEntity.class) })

public class PriorityEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * variable:id type: Integer
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "priorityid", nullable = false)
	private Integer id;

	/**
	 * variable: colorcode type: String
	 */

	@Column(name = "colorcode", nullable = false)
	private String colorcode;

	/**
	 * zero-argument constructor
	 */

	public PriorityEntity() {
	}

	/**
	 * Parameterized Constructor
	 */

	public PriorityEntity(String colorcode) {
		super();
		this.colorcode = colorcode;
	}

	/**
	 * Getters and Setters
	 */

	public Integer getId() {
		return id;
	}

	public String getColorcode() {
		return colorcode;
	}

	public void setColorcode(String colorcode) {
		this.colorcode = colorcode;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * method:toString()
	 */

	@Override
	public String toString() {
		return "PriorityEntity [id=" + id + ", colorcode=" + colorcode + "]";
	}

}
