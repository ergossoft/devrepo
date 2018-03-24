/**
 * 
 */
package com.ergossoft.datamodule.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

/*-
 * @author: Thilak Reddy 
 * This class is used for Defining Location Details
 */

@Entity
@NamedNativeQueries({
		@NamedNativeQuery(name = "callGetCityandState", query = "call GetCityandState(?)", resultClass = LocationEntity.class)

})

public class LocationEntity {

	/*-
	 *  id is used for identifying Location with unique Id
	 */

	@Id
	@Column(name = "city", nullable = false)
	private String city;

	/*-
	 *  description is used for describing the location
	 */

	@Column(name = "stateDescription", nullable = false)
	private String description;

	/*-
	 * zero-argument constructor
	 */

	public LocationEntity() {
	}

	/*-
	 * Parameterized Constructor
	 */

	public LocationEntity(String description) {
		super();
		this.description = description;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
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
	 *  for Displaying Location details instead of hashcode
	 */

	@Override
	public String toString() {
		return "LocationEntity [city=" + city + ", description=" + description
				+ "]";
	}

}
