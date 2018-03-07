package org.ergossoft.datamodule.test;

import java.util.List;

import org.ergossoft.datamodule.configuration.JpaConfiguration;
import org.ergossoft.datamodule.entity.PriorityEntity;
import org.ergossoft.datamodule.idao.PriorityDAO;
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
 * Class Name: TestPriorityDAO Purpose:Testing DAO layer methods
 * 
 * @version
 * @author THILAK REDDY
 *
 */

@ContextConfiguration(classes = { JpaConfiguration.class })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestPriorityDAO {

	static final Logger logger = LoggerFactory.getLogger(TestPriorityDAO.class);

	/**
	 * instance variable: priorityDAO type: PriorityDAO
	 */

	@Autowired
	private PriorityDAO priorityDAO;

	/**
	 * method:testGetAllPriorities()
	 * 
	 */

	@Test
	@Transactional
	@Rollback(false)
	public void testGetAllPriorities() {

		List<PriorityEntity> priorities = priorityDAO.getAllPriorities();

		logger.info("Displaying Priorities Using Logger");
		logger.info(" " + priorities);
		Assert.assertTrue(priorities.size() > 0);
		Assert.assertTrue("Companies are available", priorities.size() > 0);
	}
}