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
 * This class is used for Defining PropertyType
 *              Details
 */

@Entity
@NamedNativeQueries({
		@NamedNativeQuery(name = "callGetPropertyTypes", query = "CALL GetPropertyTypes()", resultClass = PropertyTypeEntity.class) })

public class PropertyTypeEntity {
	/*-
	 *  id is used for identifying Property with unique Id
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "propertyid", nullable = false)
	private int id;

	/*-
	 *  propertyType is used for defining type of property
	 */

	@Column(name = "propertydescription", nullable = false)
	private String propertyType;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the propertyType
	 */
	public String getPropertyType() {
		return propertyType;
	}

	/**
	 * @param propertyType the propertyType to set
	 */
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
}
