/**
 * 
 */
package com.ergossoft.core.model.beans;

import java.io.Serializable;

/**
 * @author vsnarayana
 *
 */
public class Relation implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 2712819665456863208L;
    
    private String type;

    
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
    
}
