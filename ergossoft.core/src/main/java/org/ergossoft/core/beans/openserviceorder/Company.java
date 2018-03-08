/**
 * 
 */
package org.ergossoft.core.beans.openserviceorder;

import java.io.Serializable;

/**
 * @author vsnarayana
 *
 */
public class Company implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = 1958410387216009278L;
    private String name;
    
    
    
    /**
     * default constructor
     */
    public Company() {
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
