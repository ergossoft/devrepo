/*
 *creating the org.ergossoft.datamodule.dao for defining the dao layer of TimeSlot
 * 
 */
package org.ergossoft.datamodule.dao;

import java.util.List;

import org.ergossoft.datamodule.entity.TimeSlotEntity;

/**
 * @author Keerthi
 *
 */
/**
 * defining theTime Slot dao interface
 *
 * **/
public interface TimeSlotDAO 
{
	List<TimeSlotEntity> getTimeSlots();


}
