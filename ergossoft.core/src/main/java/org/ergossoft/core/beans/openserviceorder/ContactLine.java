/**
 * 
 */
package org.ergossoft.core.beans.openserviceorder;

import java.io.Serializable;

/**
 * @author vsnarayana 
 *
 */
public class ContactLine implements Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = -6211369582316038580L;
    
    private PhoneType phoneType;
    private Relation relation;
    private String firstName;
    private String lastName;
    private String lineNumber;
    
    /**
     * default constructor 
     */
    public ContactLine() {
	super();
    }

    /**
     * @return the phoneType
     */
    public PhoneType getPhoneType() {
    
        return phoneType;
    }
    
    /**
     * @param phoneType the phoneType to set
     */
    public void setPhoneType(PhoneType phoneType) {
    
        this.phoneType = phoneType;
    }
    
    /**
     * @return the relation
     */
    public Relation getRelation() {
    
        return relation;
    }
    
    /**
     * @param relation the relation to set
     */
    public void setRelation(Relation relation) {
    
        this.relation = relation;
    }
    
    /**
     * @return the firstName
     */
    public String getFirstName() {
    
        return firstName;
    }
    
    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
    
        this.firstName = firstName;
    }
    
    /**
     * @return the lastName
     */
    public String getLastName() {
    
        return lastName;
    }
    
    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
    
        this.lastName = lastName;
    }
    
    /**
     * @return the lineNumber
     */
    public String getLineNumber() {
    
        return lineNumber;
    }
    
    /**
     * @param lineNumber the lineNumber to set
     */
    public void setLineNumber(String lineNumber) {
    
        this.lineNumber = lineNumber;
    }
    
}
