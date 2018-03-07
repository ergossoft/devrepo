package org.ergossoft.datamodule.dao;

import java.util.List;

import org.ergossoft.datamodule.entity.CompanyEntity;

/**
 * Interface Name: CompanyDAO
 * 
 * @version
 * @author THILAK REDDY
 */

public interface CompanyDAO {
	
	/**
	 * method:getAllCompanies()
	 * purpose: for retrieving list of companies
	 */
	
	public List<CompanyEntity> getAllCompanies();

}
