/**
 * 
 */
package org.ergossoft.datamodule.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

/**
 * Class Name: LocationEntity Purpose: Entity Class
 * 
 * @version
 * @author THILAK REDDY
 *
 */
@Entity
@NamedNativeQueries({
		@NamedNativeQuery(name = "callGetCityandState", query = "call GetCityandState(?)", resultClass = LocationEntity.class)

})

public class LocationEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * variable:id type: integer
	 */

	@Id
	@Column(name = "city", nullable = false)
	private String city;

	/**
	 * variable:name type: String
	 */

	@Column(name = "stateDescription", nullable = false)
	private String description;

	/**
	 * zero-argument constructor
	 */

	public LocationEntity() {
	}

	/**
	 * Parameterized Constructor
	 */

	public LocationEntity(String description) {
		super();
		this.description = description;
	}

	/**
	 * Getters and Setters
	 */

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * method:toString()
	 */

	@Override
	public String toString() {
		return "LocationEntity [city=" + city + ", description=" + description
				+ "]";
	}

}
