package org.ergossoft.datamodule.idao;

import java.util.Date;
import java.util.List;

import org.ergossoft.datamodule.entity.CompanyEntity;
import org.ergossoft.datamodule.entity.CustomerEntity;
import org.ergossoft.datamodule.entity.LocationEntity;
import org.ergossoft.datamodule.entity.MarketingCampaignEntity;
import org.ergossoft.datamodule.entity.PhoneTypeEntity;
import org.ergossoft.datamodule.entity.PriorityEntity;
import org.ergossoft.datamodule.entity.ProblemCodeEntity;
import org.ergossoft.datamodule.entity.PropertyTypeEntity;
import org.ergossoft.datamodule.entity.RelationTypeEntity;
import org.ergossoft.datamodule.entity.TimeSlotEntity;
import org.ergossoft.datamodule.entity.ZipCodeEntity;

/**
 * Interface Name: OpenServiceOrderDAO
 * 
 * @version
 * @author THILAK REDDY
 */



public interface OpenServiceOrderDAO {
	
	/**
	 * method:getAllCompanies() purpose: for retrieving list of companies
	 */

	public List<CompanyEntity> getAllCompanies();
	
	
	/**
	 * method:getAllCompanies() purpose: for retrieving list of companies
	 */

	public List<CustomerEntity> getAllCustomersById(Integer customerid);

	public List<CustomerEntity> getAllCustomersByName(String name);

	public List<CustomerEntity> getAllCustomersByDate(Date date);
	
	
	/**
	 * method: getAllLocationDetails() purpose: for retrieving list of locations
	 */

	public List<LocationEntity> getAllLocationDetails(String zipCode);

	/**
	 * method: getAllPhoneTypes() purpose: for retrieving list of phone types
	 */

	public List<PhoneTypeEntity> getAllPhoneTypes();
	
	/**
	 * method: getAllPriorities() purpose: for retrieving list of priorities
	 */

	public List<PriorityEntity> getAllPriorities();

	/**
	 * method: getAllProblemCodes() purpose: for retrieving list of problemCodes
	 */

	public List<ProblemCodeEntity> getAllProblemCodes();

	/**
	 * method: getPropertyTypes() purpose: for retrieving list of property types
	 */
	List<PropertyTypeEntity> getPropertyTypes();
	
	/**
	 * method: getAllRelationTypes() purpose: for retrieving list of relation
	 * types
	 */

	public List<RelationTypeEntity> getAllRelationTypes();
	
	/**
	 * method: getAllTimeSlots() purpose: for retrieving list of slots
	 * types
	 */

	List<TimeSlotEntity> getTimeSlots();
	
	/**
	 * method:getAllZipCodes() purpose: for retrieving list of zip codes
	 */

	public List<ZipCodeEntity> getAllZipCodes();

	/**
	 * method: getMarketingCampaignList() purpose: for retrieving list of Marketing codes
	 */

	
	public List<MarketingCampaignEntity> getMarketingCampaignList();

	

}
