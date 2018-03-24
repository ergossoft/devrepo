/**
 * 
 */
package com.ergossoft.datamodule.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

/*-
 * @author: Keerthi 
 * This class is used for Defining
 *              Phone Type Details
 */

@Entity
@NamedNativeQueries({
		@NamedNativeQuery(name = "callGetPhoneTypes", query = "call GetPhoneTypes()", resultClass = PhoneTypeEntity.class) })

public class PhoneTypeEntity {

	/*-
	 *  id is used for identifying PhoneType with unique Id
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PhoneTypeId", nullable = false)
	private Integer id;

	/*-
	 *  type is used for identifying phone with type
	 */

	@Column(name = "type", nullable = false)
	private String type;

	/*-
	 *  description is used for describing the location
	 */

	@Column(name = "description", nullable = false)
	private String description;

	/*-
	 * zero-argument constructor
	 */

	public PhoneTypeEntity() {
	}

	/*-
	 * Parameterized Constructor
	 */

	public PhoneTypeEntity(String type, String description) {
		super();
		this.type = type;
		this.description = description;
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
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/*-
	 *  for Displaying Phone details instead of hashcode
	 */

	@Override
	public String toString() {
		return "PhoneTypeEntity [id=" + id + ", type=" + type + ", description="
				+ description + "]";
	}

}
