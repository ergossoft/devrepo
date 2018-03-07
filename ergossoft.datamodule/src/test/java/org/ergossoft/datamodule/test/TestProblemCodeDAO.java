package org.ergossoft.datamodule.test;

import java.util.List;

import org.ergossoft.datamodule.configuration.JpaConfiguration;
import org.ergossoft.datamodule.entity.ProblemCodeEntity;
import org.ergossoft.datamodule.idao.ProblemCodeDAO;
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
 * Class Name: TestProblemCodeDAO Purpose:Testing DAO layer methods
 * 
 * @version
 * @author THILAK REDDY
 *
 */

@ContextConfiguration(classes = { JpaConfiguration.class })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestProblemCodeDAO {

	static final Logger logger = LoggerFactory
			.getLogger(TestProblemCodeDAO.class);

	/**
	 * instance variable: problemCodeDAO type: ProblemCodeDAO
	 */

	@Autowired
	private ProblemCodeDAO problemCodeDAO;

	/**
	 * method: testGetAllProblemCodes()
	 * 
	 */

	@Test
	@Transactional
	@Rollback(false)
	public void testGetAllProblemCodes() {

		List<ProblemCodeEntity> problems = problemCodeDAO.getAllProblemCodes();

		logger.info("Displaying Problems Using Logger");
		logger.info(" " + problems);
		Assert.assertTrue(problems.size() > 0);
		Assert.assertTrue("Companies are available", problems.size() > 0);
	}
}