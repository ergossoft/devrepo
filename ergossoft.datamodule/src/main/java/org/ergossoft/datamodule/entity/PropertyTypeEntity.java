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
 * @author Keerthi
 *
 */

/**
 * defining the entity object
 * 
 * defining the table
 * 
 * defining the named native query to display property types on drop down
 * 
 **/
@Entity
@NamedNativeQueries({
		@NamedNativeQuery(name = "callGetPropertyTypes", query = "CALL GetPropertyTypes()", resultClass = PropertyTypeEntity.class) })

public class PropertyTypeEntity implements Serializable {
	/**
	 * defining the columns
	 * 
	 **/

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * defining the variables id, property type
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "propertyid", nullable = false)
	private int id;

	@Column(name = "propertydescription", nullable = false)
	private String propertyType;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
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
	 * @param propertyType
	 *            the propertyType to set
	 */
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
}
