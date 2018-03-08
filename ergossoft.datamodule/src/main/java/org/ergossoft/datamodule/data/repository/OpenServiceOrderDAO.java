package org.ergossoft.datamodule.data.repository;

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

/*-
 * @author: Thilak Reddy 
 * This interface is used for retrieving
 * details of OpenServiceOrder
 */

public interface OpenServiceOrderDAO {

	/*-
	 * for retrieving list of companies
	 */

	public List<CompanyEntity> getAllCompanies();

	/*-
	 * for retrieving list of customers
	 * @param customerId
	 */

	public List<CustomerEntity> getAllCustomersById(Integer customerid);

	/*-
	 * for retrieving list of customers
	 * 
	 * @param customerName
	 */

	public List<CustomerEntity> getAllCustomersByName(String customername);

	/*-
	 * for retrieving list of customers
	 * 
	 * @param scheduleDate
	 */

	public List<CustomerEntity> getAllCustomersByDate(Date scheduleDate);

	/*-
	 * for retrieving list of locations
	 * 
	 * @param zipCode
	 */

	public List<LocationEntity> getAllLocationDetails(String zipCode);

	/*-
	 * for retrieving list of phone types
	 */

	public List<PhoneTypeEntity> getAllPhoneTypes();

	/*-
	 * for retrieving list of priorities
	 */

	public List<PriorityEntity> getAllPriorities();

	/*-
	 * for retrieving list of problemCodes
	 */

	public List<ProblemCodeEntity> getAllProblemCodes();

	/*-
	 * for retrieving list of property types
	 */
	List<PropertyTypeEntity> getPropertyTypes();

	/*-
	 * for retrieving list of relations with property
	 */

	public List<RelationTypeEntity> getAllRelationTypes();

	/*-
	 * for retrieving list of Time slots
	 */

	List<TimeSlotEntity> getTimeSlots();

	/*-
	 * for retrieving list of zip codes
	 */

	public List<ZipCodeEntity> getAllZipCodes();

	/*-
	 * for retrieving list of Marketing codes
	 */

	public List<MarketingCampaignEntity> getMarketingCampaignList();

}
