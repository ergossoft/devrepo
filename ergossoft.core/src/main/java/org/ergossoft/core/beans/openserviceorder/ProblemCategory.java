/**
 * 
 */
package org.ergossoft.core.beans.openserviceorder;

import java.io.Serializable;

/**
 * @author vsnarayana
 *
 */
public class ProblemCategory implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -614964432907697042L;
    
    private ProblemType problemType;
    private String code;
    private String name;
    
    /**
     * 
     */
    public ProblemCategory() {
	super();
    }

    /**
     * @return the problemType
     */
    public ProblemType getProblemType() {
    
        return problemType;
    }
    
    /**
     * @param problemType the problemType to set
     */
    public void setProblemType(ProblemType problemType) {
    
        this.problemType = problemType;
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
