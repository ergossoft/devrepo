/**
 * 
 */
package com.ergossoft.core.model.beans;

import java.io.Serializable;

/**
 * @author vsnarayana
 *
 */
public final class TimeSlot implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 756993586899644650L;
    
    private static String[] STANDARD_12_HOURS={"AM","PM"};
    private static String[] workHours={"morning","9-10","10-11","11-12","afternoon","1-2","2-3","3-4","4-5","5-6","6-7","7-8","8-9"};
    
    /**
     * @return the standard12Hours
     */
    public static String[] getStandard12Hours() {
    
        return STANDARD_12_HOURS;
    }
    
    /**
     * @param standard12Hours the standard12Hours to set
     */
    public static void setStandard12Hours(String[] standard12Hours) {
    
        STANDARD_12_HOURS = standard12Hours;
    }
    
    /**
     * @return the workhours
     */
    public static String[] getWorkhours() {
    
        return workHours;
    }
    
    /**
     * @param workhours the workhours to set
     */
    public static void setWorkhours(String[] workhours) {
    
        workHours = workhours;
    }
    
    
    
        
}
