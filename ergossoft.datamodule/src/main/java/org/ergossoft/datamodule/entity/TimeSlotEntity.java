/**
 * creating the org.ergossoft.datamodule.entity package for defining the
 * phoneType entity class
 */

package org.ergossoft.datamodule.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

/*-
 * @author Keerthi
 * This class is used for Defining TimeSlot Details
 */

@Entity
@NamedNativeQueries({
		@NamedNativeQuery(name = "callGetTimeslot", query = "call GetTimeslot();", resultClass = TimeSlotEntity.class) })
public class TimeSlotEntity {

	/*-
	 *  id is used for identifying Time Slot with unique Id
	 */

	@Id
	@GeneratedValue
	@Column(name = "ScheduleTimeId")
	private int id;
	/*-
	 *  timeSlot is used for identifying Scheduled Time
	 */
	@Column(name = "Description")
	private String timeSlots;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the timeSlots
	 */
	public String getTimeSlots() {
		return timeSlots;
	}

	/**
	 * @param timeSlots the timeSlots to set
	 */
	public void setTimeSlots(String timeSlots) {
		this.timeSlots = timeSlots;
	}

}
