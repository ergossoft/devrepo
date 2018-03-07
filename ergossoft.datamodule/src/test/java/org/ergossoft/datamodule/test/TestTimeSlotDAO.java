/**
 * defining the org.ergossoft.datamodule.test package to test the dao layer
 */

package org.ergossoft.datamodule.test;

import java.util.List;

import org.ergossoft.datamodule.configuration.JpaConfiguration;
import org.ergossoft.datamodule.entity.TimeSlotEntity;
import org.ergossoft.datamodule.idao.TimeSlotDAO;
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
 * @author Keerthi
 *
 */
/**
 * Class Name: TestTimeSlotDAO Purpose:Testing DAO layer methods of Time Slots
 * 
 **/
@ContextConfiguration(classes = { JpaConfiguration.class })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestTimeSlotDAO {
	static final Logger logger = LoggerFactory.getLogger(TestTimeSlotDAO.class);

	/**
	 * instance variable:TestTimeSlotDAO type:TestTimeSlotDAO
	 */

	@Autowired
	private TimeSlotDAO timeSlotDAO;

	/**
	 * method:testGetAllPhoneTypes()
	 * 
	 */

	@Test
	@Transactional
	@Rollback(false)
	public void testGetAllTimeSlots() {

		List<TimeSlotEntity> timeSlots = timeSlotDAO.getTimeSlots();

		logger.info("Displaying Phone types Using Logger");
		logger.info(" " + timeSlots);
		Assert.assertTrue(timeSlots.size() > 0);
		Assert.assertTrue("timeSlots are available", timeSlots.size() > 0);
	}

}
