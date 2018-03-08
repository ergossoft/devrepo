package org.ergossoft.datamodule.dao;

import java.util.Date;
import java.util.List;

import org.ergossoft.datamodule.entity.CustomerEntity;

/**
 * Interface Name: CompanyDAO
 * 
 * @version
 * @author THILAK REDDY
 */

public interface CustomerDAO {
	
	/**
	 * method:getAllCompanies()
	 * purpose: for retrieving list of companies
	 */
	
	public List<CustomerEntity> getAllCustomersById(Integer customerid);
	
	public List<CustomerEntity> getAllCustomersByName(String name);
	
	public List<CustomerEntity> getAllCustomersByDate(Date date);

}
