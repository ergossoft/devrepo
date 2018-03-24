/**
 * 
 */
package com.ergossoft.core.model.beans;

import java.io.Serializable;

/**
 * @author vsnarayana
 *
 */
public class AddressDescription implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 3740769411454940459L;
    private String name;

    
    /**
     * 
     */
    public AddressDescription() {
	super();
    }


    /**
     * @return the name
     */
    public String getName() {
    
        return name;
    }

    
    /**
     * @param name the name to set
     */
    public void setName(String name) {
    
        this.name = name;
    }
    
}
