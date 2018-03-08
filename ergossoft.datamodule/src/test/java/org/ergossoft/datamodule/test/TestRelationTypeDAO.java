package org.ergossoft.datamodule.test;

import java.util.List;

import org.ergossoft.datamodule.configuration.JpaConfiguration;
import org.ergossoft.datamodule.entity.RelationTypeEntity;
import org.ergossoft.datamodule.idao.RelationTypeDAO;
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
 * Class Name: TestRelationTypeDAO Purpose: Testing DAO layer methods
 * 
 * @version
 * @author THILAK REDDY
 *
 */

@ContextConfiguration(classes = { JpaConfiguration.class })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestRelationTypeDAO {

	static final Logger logger = LoggerFactory
			.getLogger(TestRelationTypeDAO.class);

	/**
	 * instance variable: relationTypeDAO type: RelationTypeDAO
	 */

	@Autowired
	private RelationTypeDAO relationTypeDAO;

	/**
	 * method: testGetAllRelationTypes()
	 * 
	 */

	@Test
	@Transactional
	@Rollback(false)
	public void testGetAllRelationTypes() {

		List<RelationTypeEntity> relationTypes = relationTypeDAO
				.getAllRelationTypes();

		logger.info("Displaying RelationTypes Using Logger");
		logger.info(" " + relationTypes);
		Assert.assertTrue(relationTypes.size() > 0);
		Assert.assertTrue("Relations are available", relationTypes.size() > 0);
	}
}