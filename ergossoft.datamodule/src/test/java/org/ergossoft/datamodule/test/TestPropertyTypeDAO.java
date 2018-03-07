package org.ergossoft.datamodule.test;

import java.util.List;

import org.ergossoft.datamodule.configuration.JpaConfiguration;
import org.ergossoft.datamodule.entity.PropertyTypeEntity;
import org.ergossoft.datamodule.idao.PropertyTypeDAO;
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
 * Class Name: TestPropertyTypeDAO Purpose: Testing DAO layer methods
 * 
 * @version
 * @author THILAK REDDY
 *
 */

@ContextConfiguration(classes = { JpaConfiguration.class })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestPropertyTypeDAO {

	static final Logger logger = LoggerFactory
			.getLogger(TestPropertyTypeDAO.class);

	/**
	 * instance variable: propertyTypeDAO type: PropertyTypeDAO
	 */

	@Autowired
	private PropertyTypeDAO propertyTypeDAO;

	/**
	 * method:testGetAllCompanies()
	 * 
	 */

	@Test
	@Transactional
	@Rollback(false)
	public void testGetAllPropertyTypes() {

		List<PropertyTypeEntity> propertyTypes = propertyTypeDAO
				.getPropertyTypes();

		logger.info("Displaying Property Types Using Logger");
		logger.info(" " + propertyTypes);
		Assert.assertTrue(propertyTypes.size() > 0);
		Assert.assertTrue("Companies are available", propertyTypes.size() > 0);
	}
}