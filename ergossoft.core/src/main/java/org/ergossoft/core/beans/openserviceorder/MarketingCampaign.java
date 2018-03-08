/**
 * 
 */
package org.ergossoft.core.beans.openserviceorder;

import java.io.Serializable;

/**
 * @author vsnarayana
 *
 */
public class MarketingCampaign implements Serializable{
    	
    	/**
    	 * 
    	 */
    	private static final long serialVersionUID = 3648678421378116104L;
    	
	private String description;

	
	

	/**
	 * default constructor 
	 */
	public MarketingCampaign() {
	    super();
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
