/**
 * 
 */
package org.ergossoft.core.beans.openserviceorder;

import java.io.Serializable;

/**
 * @author vsnarayana
 *
 */
public class Address implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -5575309094738366263L;
    private AddressDescription addressType;
    private ZipCode zipCode;
    private String location;
    
    /**
     * @return the addressType
     */
    public AddressDescription getAddressType() {
    
        return addressType;
    }
    
    /**
     * @param addressType the addressType to set
     */
    public void setAddressType(AddressDescription addressType) {
    
        this.addressType = addressType;
    }
    
    /**
     * @return the zipCode
     */
    public ZipCode getZipCode() {
    
        return zipCode;
    }
    
    /**
     * @param zipCode the zipCode to set
     */
    public void setZipCode(ZipCode zipCode) {
    
        this.zipCode = zipCode;
    }
    
    /**
     * @return the location
     */
    public String getLocation() {
    
        return location;
    }
    
    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
    
        this.location = location;
    }
    
}
