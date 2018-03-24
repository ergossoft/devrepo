package com.ergossoft.datamodule.data.repository.implementation;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ergossoft.datamodule.data.repository.OpenServiceOrderRepository;
import com.ergossoft.datamodule.entity.CompanyEntity;
import com.ergossoft.datamodule.entity.CustomerEntity;
import com.ergossoft.datamodule.entity.LocationEntity;
import com.ergossoft.datamodule.entity.MarketingCampaignEntity;
import com.ergossoft.datamodule.entity.PhoneTypeEntity;
import com.ergossoft.datamodule.entity.PriorityEntity;
import com.ergossoft.datamodule.entity.ProblemCodeEntity;
import com.ergossoft.datamodule.entity.PropertyTypeEntity;
import com.ergossoft.datamodule.entity.RelationTypeEntity;
import com.ergossoft.datamodule.entity.TimeSlotEntity;
import com.ergossoft.datamodule.entity.ZipCodeEntity;
import com.ergossoft.datamodule.persistence.AbstractPersistenceManager;

/*-
 * @author: Thilak Reddy 
 * This Class is used for retrieving
 * details of OpenServiceOrder
 */
@Repository
@Transactional
public class OpenServiceOrderRepositoryImpl extends AbstractPersistenceManager
		implements OpenServiceOrderRepository {

	/*-
	 * @return : list of Companies
	 */

	@SuppressWarnings("unchecked")
	@Override
	public List<CompanyEntity> getAllCompanies() {
		return getEntityManager().createNamedQuery("fetchCompanies")
				.getResultList();
	}

	/*-
	 * @return : list of Customers
	 * @param : customerId
	 */

	@SuppressWarnings("unchecked")
	@Override
	public List<CustomerEntity> getAllCustomersById(Integer customerId) {
		return getEntityManager().createNamedQuery("callGetCustomerSearchById")
				.setParameter(1, customerId).getResultList();
	}

	/*-
	 * @return : list of Customers
	 * @param : customerName
	 */

	@SuppressWarnings("unchecked")
	@Override
	public List<CustomerEntity> getAllCustomersByName(String customerName) {
		return getEntityManager()
				.createNamedQuery("callGetCustomerSearchByName")
				.setParameter(1, customerName).getResultList();
	}

	/*-
	 * @return : list of Customers
	 * @param : scheduleDate
	 */

	@SuppressWarnings("unchecked")
	@Override
	public List<CustomerEntity> getAllCustomersByDate(Date scheduleDate) {
		return getEntityManager()
				.createNamedQuery("callGetCustomerSearchByDate")
				.setParameter(1, scheduleDate).getResultList();
	}

	/*-
	 * @return : list of Locations
	 * @param: zipCode
	 */

	@SuppressWarnings("unchecked")
	@Override
	public List<LocationEntity> getAllLocationDetails(String zipCode) {
		return getEntityManager().createNamedQuery("callGetCityandState")
				.setParameter(1, zipCode).getResultList();
	}

	/*-
	 * @return : list of PhoneTypes
	 */

	@SuppressWarnings("unchecked")
	@Override
	public List<PhoneTypeEntity> getAllPhoneTypes() {
		return getEntityManager().createNamedQuery("callGetPhoneTypes")
				.getResultList();
	}

	/*-
	 * @return : list of Priorities
	 */

	@SuppressWarnings("unchecked")
	@Override
	public List<PriorityEntity> getAllPriorities() {
		return getEntityManager().createNamedQuery("callGetColors")
				.getResultList();
	}

	/*-
	 * @return : list of ProblemCodes
	 */

	@SuppressWarnings("unchecked")
	@Override
	public List<ProblemCodeEntity> getAllProblemCodes() {
		return getEntityManager().createNamedQuery("callGetProblemCodes()")
				.getResultList();
	}

	/*-
	 * @return : list of PropertyTypes
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<PropertyTypeEntity> getPropertyTypes() {
		return getEntityManager().createNamedQuery("callGetPropertyTypes")
				.getResultList();
	}

	/*-
	 * @return : list of RelationTypes
	 */

	@SuppressWarnings("unchecked")
	@Override
	public List<RelationTypeEntity> getAllRelationTypes() {
		return getEntityManager().createNamedQuery("callRelationTypes")
				.getResultList();
	}

	/*-
	 * @return : list of TimeSlots
	 */

	@SuppressWarnings("unchecked")
	@Override
	public List<TimeSlotEntity> getTimeSlots() {
		return getEntityManager().createNamedQuery("callGetTimeslot")
				.getResultList();
	}

	/*-
	 * @return : list of ZipCodes
	 */

	@SuppressWarnings("unchecked")
	@Override
	public List<ZipCodeEntity> getAllZipCodes() {
		return getEntityManager().createNamedQuery("fetchAllZipCodes")
				.getResultList();
	}

	/*-
	 * @return : list of MarketingCampaigns
	 */

	@SuppressWarnings("unchecked")
	@Override
	public List<MarketingCampaignEntity> getMarketingCampaignList() {
		return getEntityManager()
				.createNamedQuery("callGetMarketingCampaignList")
				.getResultList();
	}

}
