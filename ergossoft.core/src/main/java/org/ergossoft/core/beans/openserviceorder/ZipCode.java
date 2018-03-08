/**
 * 
 */
package org.ergossoft.core.beans.openserviceorder;

import java.io.Serializable;

/**
 * @author vsnarayana
 *
 */
public class ZipCode implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -4841338177912604031L;
    
    private String city;
    private String state;
    
    /**
     * 
     */
    public ZipCode() {
	super();
    }

    /**
     * @return the city
     */
    public String getCity() {
    
        return city;
    }
    
    /**
     * @param city the city to set
     */
    public void setCity(String city) {
    
        this.city = city;
    }
    
    /**
     * @return the state
     */
    public String getState() {
    
        return state;
    }
    
    /**
     * @param state the state to set
     */
    public void setState(String state) {
    
        this.state = state;
    }
    
}
