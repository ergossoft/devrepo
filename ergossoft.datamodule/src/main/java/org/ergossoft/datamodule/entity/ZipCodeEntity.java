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
 * This class is used for Defining ZipCode
 *              Details
 */

@Entity
@NamedNativeQueries({
		@NamedNativeQuery(name = "fetchAllZipCodes", query = "call GetZipCodes()", resultClass = ZipCodeEntity.class) })
public class ZipCodeEntity {

	/*-
	 *  id is used for identifying Zip Code with unique Id
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "zipcodeid", nullable = false)
	private Integer id;

	/*-
	 *  zipcode is used for identifying Zip Code
	 */

	@Column(name = "zipcode", nullable = false)
	private String zipcode;

	/*-
	 * zero-argument constructor
	 */

	public ZipCodeEntity() {
	}

	/*-
	 * Parameterized Constructor
	 */

	public ZipCodeEntity(String zipcode) {
		super();
		this.zipcode = zipcode;
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
	 * @return the zipcode
	 */
	public String getZipcode() {
		return zipcode;
	}

	/**
	 * 
	 * @param zipcode the zipcode to set
	 */

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	/*-
	 *  for Displaying Zip Code details instead of hashcode
	 */

	@Override
	public String toString() {
		return "ZipCodeEntity [id=" + id + ", zipcode=" + zipcode + "]";
	}

}
