/**
 * 
 */
package org.ergossoft.datamodule.dao;

import java.util.List;

import org.ergossoft.datamodule.entity.TimeSlotEntity;
import org.ergossoft.datamodule.idao.TimeSlotDAO;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Keerthi
 *
 */

@Repository
@Transactional
public class TimeSlotDAOImpl extends AbstractDao<Integer, TimeSlotEntity>
		implements TimeSlotDAO {

	@SuppressWarnings("unchecked")
	@Override
	public List<TimeSlotEntity> getTimeSlots() {
		// TODO Auto-generated method stub
		return getEntityManager().createNamedQuery("callGetTimeslot")
				.getResultList();
	}

}
