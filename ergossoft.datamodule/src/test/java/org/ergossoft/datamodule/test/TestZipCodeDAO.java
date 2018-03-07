package org.ergossoft.datamodule.test;

import java.util.List;

import org.ergossoft.datamodule.configuration.JpaConfiguration;
import org.ergossoft.datamodule.entity.ZipCodeEntity;
import org.ergossoft.datamodule.idao.ZipCodeDAO;
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
 * Class Name: TestZipCodeDAO Purpose:Testing DAO layer methods
 * 
 * @version
 * @author THILAK REDDY
 *
 */

@ContextConfiguration(classes = { JpaConfiguration.class })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestZipCodeDAO {

	static final Logger logger = LoggerFactory.getLogger(TestZipCodeDAO.class);

	/**
	 * instance variable:zipCodeDAO type:ZipCodeDAO
	 */

	@Autowired
	private ZipCodeDAO zipCodeDAO;

	/**
	 * method:testGetAllZipCodes()
	 * 
	 */

	@Test
	@Transactional
	@Rollback(false)
	public void testGetAllZipCodes() {

		List<ZipCodeEntity> zipCodes = zipCodeDAO.getAllZipCodes();

		logger.info("Displaying  zipcodes Using Logger");
		logger.info(" " + zipCodes);
		Assert.assertTrue(zipCodes.size() > 0);
		Assert.assertTrue("ZipCodes are available", zipCodes.size() > 0);
	}
}