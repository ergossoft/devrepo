package org.ergossoft.datamodule.test;

import java.util.List;

import org.ergossoft.datamodule.configuration.JpaConfiguration;
import org.ergossoft.datamodule.entity.PhoneTypeEntity;
import org.ergossoft.datamodule.idao.PhoneTypeDAO;
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
 * Class Name: TestPhoneTypeDAO Purpose: Testing DAO layer methods
 * 
 * @version
 * @author THILAK REDDY
 *
 */

@ContextConfiguration(classes = { JpaConfiguration.class })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestPhoneTypeDAO {

	static final Logger logger = LoggerFactory
			.getLogger(TestPhoneTypeDAO.class);

	/**
	 * instance variable: phoneTypeDAO type: PhoneTypeDAO
	 */

	@Autowired
	private PhoneTypeDAO phoneTypeDAO;

	/**
	 * method: testGetAllRelationTypes()
	 * 
	 */

	@Test
	@Transactional
	@Rollback(false)
	public void testGetAllRelationTypes() {

		List<PhoneTypeEntity> phoneTypes = phoneTypeDAO.getAllPhoneTypes();

		logger.info("Displaying PhoneTypes Using Logger");
		logger.info(" " + phoneTypes);
		Assert.assertTrue(phoneTypes.size() > 0);
		Assert.assertTrue("Relations are available", phoneTypes.size() > 0);
	}
}