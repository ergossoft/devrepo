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
 * Class Name: ZipCodeEntity Purpose: Entity Class
 * 
 * @version
 * @author THILAK REDDY
 *
 */
@Entity
@NamedNativeQueries({
		@NamedNativeQuery(name = "fetchAllZipCodes", query = "call GetZipCodes()", resultClass = ZipCodeEntity.class) })
public class ZipCodeEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * variable:id type: Integer
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "zipcodeid", nullable = false)
	private Integer id;

	/**
	 * variable:zipcode type: String
	 */

	@Column(name = "zipcode", nullable = false)
	private String zipcode;

	/**
	 * zero-argument constructor
	 */

	public ZipCodeEntity() {
	}

	/**
	 * Parameterized Constructor
	 */

	public ZipCodeEntity(String zipcode) {
		super();
		this.zipcode = zipcode;
	}

	/**
	 * Getters and Setters
	 */

	public Integer getId() {
		return id;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * method:toString()
	 */

	@Override
	public String toString() {
		return "ZipCodeEntity [id=" + id + ", zipcode=" + zipcode + "]";
	}

}
