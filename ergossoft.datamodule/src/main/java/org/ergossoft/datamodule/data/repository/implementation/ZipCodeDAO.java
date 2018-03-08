package org.ergossoft.datamodule.dao;

import java.util.List;

import org.ergossoft.datamodule.entity.ZipCodeEntity;

/**
 * Interface Name: ZipCodeDAO
 * 
 * @version
 * @author THILAK REDDY
 */

public interface ZipCodeDAO {
	
	/**
	 * method:getAllZipCodes()
	 * purpose: for retrieving list of zip codes
	 */
	
	public List<ZipCodeEntity> getAllZipCodes();

}
