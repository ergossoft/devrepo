/**
 * 
 */
package org.ergossoft.core.beans.openserviceorder;

import java.io.Serializable;

/**
 * @author vsnarayana
 *
 */
public class PropertyType implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 711149660084267747L;
    private String name;
    private String code;
    
    /**
     * 
     */
    public PropertyType() {
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
    
    /**
     * @return the code
     */
    public String getCode() {
    
        return code;
    }
    
    /**
     * @param code the code to set
     */
    public void setCode(String code) {
    
        this.code = code;
    }
    
}
