/**
 * creating the org.ergossoft.datamodule.entity package for defining the 
 * 
 * Marketing-Campaign entity class
 */
package org.ergossoft.datamodule.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

/**
 * @author Keerthi
 *
 */
/**
 * defining the entity object
 * 
 * defining the table
 * 
 * defining the named native query to display Phone types on drop down
 * 
 * **/

@Entity
@NamedNativeQueries({ 
	  @NamedNativeQuery(
			  name = "callGetMarketingCampaignList", 
			    query = "call GetMarketingCampaignList()", 
			    resultClass = MarketingCampaignEntity.class) 
			})
public class MarketingCampaignEntity 
{
	/**
	 * defining the column MarketingCampaign-Id
	 * 
	 * **/
	@Id
	@GeneratedValue
	@Column(name="MarketingCampaignId")
	
	private int id;
	
	/**
	 * defining the column Description
	 * 
	 * **/
	
	@Column(name="Description")
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
	

}
