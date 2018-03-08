package org.ergossoft.datamodule.dao;

import java.util.List;

import org.ergossoft.datamodule.entity.LocationEntity;

/**
 * Interface Name: LocationDAO
 * 
 * @version
 * @author THILAK REDDY
 */

public interface LocationDAO {
	
	/**
	 * method: getAllLocationDetails()
	 * purpose: for retrieving list of locations
	 */
	
	public List<LocationEntity> getAllLocationDetails(String zipCode);

}
