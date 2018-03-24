/**
 * creating the org.ergossoft.datamodule.entity package for defining the
 * 
 * Marketing-Campaign entity class
 */
package com.ergossoft.datamodule.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

/*-
 * @author: Keerthi 
 * This class is used for Defining MarketingCampaign Details
 */

@Entity
@NamedNativeQueries({
		@NamedNativeQuery(name = "callGetMarketingCampaignList", query = "call GetMarketingCampaignList()", resultClass = MarketingCampaignEntity.class) })
public class MarketingCampaignEntity {
	/*-
	 *  id is used for identifying Location with unique Id
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MarketingCampaignId")

	private int id;

	/*-
	 *  description is used for describing the location
	 */

	@Column(name = "Description")
	private String description;

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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/*-
	 *  for Displaying MarketingCampaign details instead of hashcode
	 */

	@Override
	public String toString() {
		return "MarketingCampaignEntity [id=" + id + ", description="
				+ description + "]";
	}

}
