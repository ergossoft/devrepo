package org.ergossoft.datamodule.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
import org.ergossoft.datamodule.idao.OpenServiceOrderDAO;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Class Name: OpenServiceOrderDAOImpl Purpose: DAO Class
 * 
 * @version
 * @author THILAK REDDY
 *
 */

@Repository
@Transactional
public class OpenServiceOrderDAOImpl implements OpenServiceOrderDAO{
	
	@PersistenceContext
	EntityManager entityManager;
	
	protected EntityManager getEntityManager() {
		return this.entityManager;
	}
	
	/**
	 * method : getAllCompanies()
	 * 
	 * @return : list of Company Entities
	 */


	@SuppressWarnings("unchecked")
	@Override
	public List<CompanyEntity> getAllCompanies() {
		// TODO Auto-generated method stub
		return entityManager.createNamedQuery("fetchCompanies")
				.getResultList();
	}
	
	/**
	 * method : getAllCustomersById()
	 * 
	 * @return : list of Customer Entities
	 */

	@SuppressWarnings("unchecked")
	@Override
	public List<CustomerEntity> getAllCustomersById(Integer id) {
		return entityManager.createNamedQuery("callGetCustomerSearchById")
				.setParameter(1, id).getResultList();
	}
	
	/**
	 * method : getAllCustomersByName()
	 * 
	 * @return : list of Customer Entities
	 */

	@SuppressWarnings("unchecked")
	@Override
	public List<CustomerEntity> getAllCustomersByName(String name) {
		// TODO Auto-generated method stub
		return entityManager
				.createNamedQuery("callGetCustomerSearchByName")
				.setParameter(1, name).getResultList();	
		}
	
	/**
	 * method : getAllCustomersByDate()
	 * 
	 * @return : list of Customer Entities
	 */


	@SuppressWarnings("unchecked")
	@Override
	public List<CustomerEntity> getAllCustomersByDate(Date date) {
		return entityManager
				.createNamedQuery("callGetCustomerSearchByDate")
				.setParameter(1, date).getResultList();
	}
	
	/**
	 * method : getAllLocationDetails()
	 * 
	 * @return : list of LocationType Entities
	 */
	
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<LocationEntity> getAllLocationDetails(String zipCode) {
		return entityManager.createNamedQuery("callGetCityandState")
				.setParameter(1, zipCode).getResultList();
	}

	/**
	 * method : getAllPhoneTypes()
	 * 
	 * @return : list of PhoneTypes Entities
	 */

	@SuppressWarnings("unchecked")
    @Override
	public List<PhoneTypeEntity> getAllPhoneTypes() {
		return entityManager.createNamedQuery("callGetPhoneTypes")
				.getResultList();
	}
	
	
	/**
	 * method : getAllPrioritis()
	 * 
	 * @return : list of Priority Entities
	 */

	@SuppressWarnings("unchecked")
	@Override
	public List<PriorityEntity> getAllPriorities() {
		return entityManager.createNamedQuery("callGetColors")
				.getResultList();
	}

	/**
	 * method : getAllProblemCodes()
	 * 
	 * @return : list of Problem Entities
	 */

	@SuppressWarnings("unchecked")
	@Override
	public List<ProblemCodeEntity> getAllProblemCodes() {
		return entityManager.createNamedQuery("callGetProblemCodes()")
				.getResultList();
	}

	/**
	 * method : getPropertyTypes()
	 * 
	 * @return : list of Property Type Entities
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<PropertyTypeEntity> getPropertyTypes() {
		// TODO Auto-generated method stub

		return entityManager.createNamedQuery("callGetPropertyTypes")
				.getResultList();
	}

	/**
	 * method : getAllRelationTypes()
	 * 
	 * @return : list of RelationType Entities
	 */

	@SuppressWarnings("unchecked")
	@Override
	public List<RelationTypeEntity> getAllRelationTypes() {
		return entityManager.createNamedQuery("callRelationTypes")
				.getResultList();
	}
	
	/**
	 * method : getTimeSlots()
	 * 
	 * @return : list of TimeSlot Entities
	 */

	@SuppressWarnings("unchecked")
	@Override
	public List<TimeSlotEntity> getTimeSlots() {
		// TODO Auto-generated method stub
		return entityManager.createNamedQuery("callGetTimeslot")
				.getResultList();
	}


	/**
	 * method : getAllZipCodes()
	 * 
	 * @return : list of ZipCode Entities
	 */

	@SuppressWarnings("unchecked")
	@Override
	public List<ZipCodeEntity> getAllZipCodes() {
		return entityManager.createNamedQuery("fetchAllZipCodes")
				.getResultList();
	}

	/**
	 * method : getAllZipCodes()
	 * 
	 * @return : list of ZipCode Entities
	 */
	
	@SuppressWarnings("unchecked")
	@Override
	public List<MarketingCampaignEntity> getMarketingCampaignList() 
	{
		// TODO Auto-generated method stub
		return entityManager.createNamedQuery("callGetMarketingCampaignList").getResultList();
	}

	

}
