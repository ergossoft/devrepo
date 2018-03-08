package org.ergossoft.datamodule.test;

import java.util.List;

import org.ergossoft.datamodule.configuration.JpaConfiguration;
import org.ergossoft.datamodule.entity.LocationEntity;
import org.ergossoft.datamodule.idao.LocationDAO;
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
 * Class Name: TestLocationDAO Purpose:Testing DAO layer methods
 * 
 * @version
 * @author THILAK REDDY
 *
 */

@ContextConfiguration(classes = { JpaConfiguration.class })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestLocationDAO {

	static final Logger logger = LoggerFactory.getLogger(TestLocationDAO.class);

	/**
	 * instance variable: locationDAO type: LocationDAO
	 */

	@Autowired
	private LocationDAO locationDAO;

	/**
	 * method: testGetAllLocationDetails()
	 * 
	 */

	@Test
	@Transactional
	@Rollback(false)
	public void testGetAllLocationDetails() {

		List<LocationEntity> address = locationDAO
				.getAllLocationDetails("500098");

		logger.info("Displaying address Using Logger");
		logger.info(" " + address);

		Assert.assertTrue(address.size() > 0);
		Assert.assertTrue("Address is available", address.size() > 0);
	}
}