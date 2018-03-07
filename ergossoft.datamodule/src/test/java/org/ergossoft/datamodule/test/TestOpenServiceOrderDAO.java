package org.ergossoft.datamodule.test;

import java.sql.Timestamp;
import java.util.List;

import org.ergossoft.datamodule.configuration.JpaConfiguration;
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
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Class Name: TestOpenServiceOrderDAO Purpose: Test Class
 * 
 * @version
 * @author THILAK REDDY
 *
 */

@ContextConfiguration(classes = { JpaConfiguration.class })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestOpenServiceOrderDAO {
	static final Logger logger = LoggerFactory
			.getLogger(TestOpenServiceOrderDAO.class);

	/**
	 * instance variable: openServiceOrderDAO type: OpenServiceOrderDAO
	 */

	@Autowired
	private OpenServiceOrderDAO openServiceOrderDAO;
	
	/**
	 * method:testGetAllCompanies()
	 * 
	 */

	@Test
	@Transactional
	@Rollback(false)
	public void testGetAllCompanies() {

		List<CompanyEntity> companies = openServiceOrderDAO.getAllCompanies();

		logger.info("Displaying Companies Using Logger");
		logger.info(" " + companies);
		Assert.assertTrue(companies.size() > 0);
		Assert.assertTrue("Companies are available", companies.size() > 0);
	}
	
	/**
	 * method: testGetAllCustomers()
	 * 
	 */

	@Test
	@Transactional
	@Rollback(false)
	public void testGetAllCustomers() {

		List<CustomerEntity> customers = openServiceOrderDAO.getAllCustomersById(101);

		List<CustomerEntity> customers2 = openServiceOrderDAO
				.getAllCustomersByName("thilak");

		Timestamp ts = Timestamp.valueOf(
				String.format("%04d-%02d-%02d 00:00:01", 2009, 01, 01));

		List<CustomerEntity> customers3 = openServiceOrderDAO.getAllCustomersByDate(ts);

		logger.info("Displaying customers Using Logger");
		logger.info(" " + customers);
		logger.info(" " + customers2);
		logger.info(" " + customers3);
		Assert.assertTrue(customers.size() > 0);
		Assert.assertTrue("Customers are available", customers.size() > 0);
		Assert.assertTrue(customers2.size() > 0);
		Assert.assertTrue("Customers are available", customers2.size() > 0);
		Assert.assertTrue(customers3.size() > 0);
		Assert.assertTrue("Customers are available", customers3.size() > 0);
	}
	
	/**
	 * method: testGetAllLocationDetails()
	 * 
	 */

	@Test
	@Transactional
	@Rollback(false)
	public void testGetAllLocationDetails() {

		List<LocationEntity> address = openServiceOrderDAO
				.getAllLocationDetails("500098");

		logger.info("Displaying address Using Logger");
		logger.info(" " + address);

		Assert.assertTrue(address.size() > 0);
		Assert.assertTrue("Address is available", address.size() > 0);
	}
	
	/**
	 * method: testGetAllRelationTypes()
	 * 
	 */

	@Test
	@Transactional
	@Rollback(false)
	public void testGetAllPhoneTypes() {

		List<PhoneTypeEntity> phoneTypes = openServiceOrderDAO.getAllPhoneTypes();

		logger.info("Displaying PhoneTypes Using Logger");
		logger.info(" " + phoneTypes);
		Assert.assertTrue(phoneTypes.size() > 0);
		Assert.assertTrue("Relations are available", phoneTypes.size() > 0);
	}
	
	/**
	 * method:testGetAllPriorities()
	 * 
	 */

	@Test
	@Transactional
	@Rollback(false)
	public void testGetAllPriorities() {

		List<PriorityEntity> priorities = openServiceOrderDAO.getAllPriorities();

		logger.info("Displaying Priorities Using Logger");
		logger.info(" " + priorities);
		Assert.assertTrue(priorities.size() > 0);
		Assert.assertTrue("Companies are available", priorities.size() > 0);
	}
	
	/**
	 * method: testGetAllProblemCodes()
	 * 
	 */

	@Test
	@Transactional
	@Rollback(false)
	public void testGetAllProblemCodes() {

		List<ProblemCodeEntity> problems = openServiceOrderDAO.getAllProblemCodes();

		logger.info("Displaying Problems Using Logger");
		logger.info(" " + problems);
		Assert.assertTrue(problems.size() > 0);
		Assert.assertTrue("Companies are available", problems.size() > 0);
	}
	
	/**
	 * method:testGetAllCompanies()
	 * 
	 */

	@Test
	@Transactional
	@Rollback(false)
	public void testGetAllPropertyTypes() {

		List<PropertyTypeEntity> propertyTypes = openServiceOrderDAO
				.getPropertyTypes();

		logger.info("Displaying Property Types Using Logger");
		logger.info(" " + propertyTypes);
		Assert.assertTrue(propertyTypes.size() > 0);
		Assert.assertTrue("Companies are available", propertyTypes.size() > 0);
	}

	/**
	 * method: testGetAllRelationTypes()
	 * 
	 */

	@Test
	@Transactional
	@Rollback(false)
	public void testGetAllRelationTypes() {

		List<RelationTypeEntity> relationTypes = openServiceOrderDAO
				.getAllRelationTypes();

		logger.info("Displaying RelationTypes Using Logger");
		logger.info(" " + relationTypes);
		Assert.assertTrue(relationTypes.size() > 0);
		Assert.assertTrue("Relations are available", relationTypes.size() > 0);
	}
	
	/**
	 * method: testGetAllTimeSlots()
	 * 
	 */

	@Test
	@Transactional
	@Rollback(false)
	public void testGetAllTimeSlots() {

		List<TimeSlotEntity> timeSlots = openServiceOrderDAO.getTimeSlots();

		logger.info("Displaying Phone types Using Logger");
		logger.info(" " + timeSlots);
		Assert.assertTrue(timeSlots.size() > 0);
		Assert.assertTrue("timeSlots are available", timeSlots.size() > 0);
	}

	/**
	 * method:testGetAllZipCodes()
	 * 
	 */

	@Test
	@Transactional
	@Rollback(false)
	public void testGetAllZipCodes() {

		List<ZipCodeEntity> zipCodes = openServiceOrderDAO.getAllZipCodes();

		logger.info("Displaying  zipcodes Using Logger");
		logger.info(" " + zipCodes);
		Assert.assertTrue(zipCodes.size() > 0);
		Assert.assertTrue("ZipCodes are available", zipCodes.size() > 0);
	}

	
	/**
	 * method:testGetTestMarketingCampaignList()
	 * 
	 */

	@Test
	@Transactional
	@Rollback(false)
	public void testGetAllMarketCampains() {

		List<MarketingCampaignEntity> marketingCampaignList = openServiceOrderDAO.getMarketingCampaignList();

		logger.info("Displaying marketingCampaign List Using Logger");
		logger.info(" " + marketingCampaignList);
		 Assert.assertTrue(marketingCampaignList.size()>0);
		 Assert.assertTrue("marketing CampaignList are available", marketingCampaignList.size()>0);
	}



}
