package org.ergossoft.datamodule.test;

import java.util.List;

import org.ergossoft.datamodule.configuration.JpaConfiguration;
import org.ergossoft.datamodule.entity.CompanyEntity;
import org.ergossoft.datamodule.idao.CompanyDAO;
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
 * Class Name: TestCompanyDAo Purpose:Testing DAO layer methods
 * 
 * @version
 * @author THILAK REDDY
 *
 */

@ContextConfiguration(classes = { JpaConfiguration.class })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestCompanyDAO {

	static final Logger logger = LoggerFactory.getLogger(TestCompanyDAO.class);

	/**
	 * instance variable:companyDAO type:CompanyDAO
	 */

	@Autowired
	private CompanyDAO companyDAO;

	/**
	 * method:testGetAllCompanies()
	 * 
	 */

	@Test
	@Transactional
	@Rollback(false)
	public void testGetAllCompanies() {

		List<CompanyEntity> companies = companyDAO.getAllCompanies();

		logger.info("Displaying Companies Using Logger");
		logger.info(" " + companies);
		Assert.assertTrue(companies.size() > 0);
		Assert.assertTrue("Companies are available", companies.size() > 0);
	}
}