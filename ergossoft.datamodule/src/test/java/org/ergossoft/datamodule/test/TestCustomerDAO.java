package org.ergossoft.datamodule.test;

import java.sql.Timestamp;
import java.util.List;

import org.ergossoft.datamodule.configuration.JpaConfiguration;
import org.ergossoft.datamodule.entity.CustomerEntity;
import org.ergossoft.datamodule.idao.CustomerDAO;
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
 * Class Name: TestCustomerDAO Purpose:Testing DAO layer methods
 * 
 * @version
 * @author THILAK REDDY
 *
 */

@ContextConfiguration(classes = { JpaConfiguration.class })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestCustomerDAO {

	static final Logger logger = LoggerFactory.getLogger(TestCustomerDAO.class);

	/**
	 * instance variable: customerDAO type: CustomerDAO
	 */

	@Autowired
	private CustomerDAO customerDAO;

	/**
	 * method: testGetAllCustomers()
	 * 
	 */

	@Test
	@Transactional
	@Rollback(false)
	public void testGetAllCustomers() {

		List<CustomerEntity> customers = customerDAO.getAllCustomersById(101);

		List<CustomerEntity> customers2 = customerDAO
				.getAllCustomersByName("thilak");

		Timestamp ts = Timestamp.valueOf(
				String.format("%04d-%02d-%02d 00:00:01", 2009, 01, 01));

		List<CustomerEntity> customers3 = customerDAO.getAllCustomersByDate(ts);

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
}