/**
 * 
 */
package org.ergossoft.core.beans.openserviceorder;

import java.io.Serializable;

/**
 * @author vsnarayana
 *
 */
public class PhoneType implements Serializable{
    	
    	private static final long serialVersionUID = 7073153088274618984L;
    	
	private String type;
	private String description;
	
	/**
	 * 
	 */
	public PhoneType() {
	    super();
	}


	/**
	 * @return the type
	 */
	public String getType() {
	
	    return type;
	}

	
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
	
	    this.type = type;
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
