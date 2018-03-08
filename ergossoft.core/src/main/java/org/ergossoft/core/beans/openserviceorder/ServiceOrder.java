/**
 * 
 */
package org.ergossoft.core.beans.openserviceorder;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author vsnarayana
 *   
 */
public class ServiceOrder implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -1150196355741033316L;
    
    private Company company; /* */
    private ProblemCategory problemCategory;
    private PropertyType property;
    private Priority priority;
    private ContactLine contactLine;
    private String description;
    private MarketingCampaign marketingCampaign;
    private String email;
    private Date date;
    private TimeSlot timeSlot;
    private short days;
    private Address address;
    private List<CustomerBillingAddress> customerBillingAddress;
    private List<CustomerSiteAddress> customerSiteAddress;
    
    /**
     * 
     */
    public ServiceOrder() {
	super();
    }

    /**
     * @return the company
     */
    public Company getCompany() {
    
        return company;
    }
    
    /**
     * @param company the company to set
     */
    public void setCompany(Company company) {
    
        this.company = company;
    }
    
    /**
     * @return the problemCategory
     */
    public ProblemCategory getProblemCategory() {
    
        return problemCategory;
    }
    
    /**
     * @param problemCategory the problemCategory to set
     */
    public void setProblemCategory(ProblemCategory problemCategory) {
    
        this.problemCategory = problemCategory;
    }
    
    /**
     * @return the property
     */
    public PropertyType getProperty() {
    
        return property;
    }
    
    /**
     * @param property the property to set
     */
    public void setProperty(PropertyType property) {
    
        this.property = property;
    }
    
    /**
     * @return the priority
     */
    public Priority getPriority() {
    
        return priority;
    }
    
    /**
     * @param priority the priority to set
     */
    public void setPriority(Priority priority) {
    
        this.priority = priority;
    }
    
    /**
     * @return the contactLine
     */
    public ContactLine getContactLine() {
    
        return contactLine;
    }
    
    /**
     * @param contactLine the contactLine to set
     */
    public void setContactLine(ContactLine contactLine) {
    
        this.contactLine = contactLine;
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
    
    /**
     * @return the marketingCampaign
     */
    public MarketingCampaign getMarketingCampaign() {
    
        return marketingCampaign;
    }
    
    /**
     * @param marketingCampaign the marketingCampaign to set
     */
    public void setMarketingCampaign(MarketingCampaign marketingCampaign) {
    
        this.marketingCampaign = marketingCampaign;
    }
    
    /**
     * @return the email
     */
    public String getEmail() {
    
        return email;
    }
    
    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
    
        this.email = email;
    }
    
    /**
     * @return the date
     */
    public Date getDate() {
    
        return date;
    }
    
    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
    
        this.date = date;
    }
    
    /**
     * @return the timeSlot
     */
    public TimeSlot getTimeSlot() {
    
        return timeSlot;
    }
    
    /**
     * @param timeSlot the timeSlot to set
     */
    public void setTimeSlot(TimeSlot timeSlot) {
    
        this.timeSlot = timeSlot;
    }
    
    /**
     * @return the days
     */
    public short getDays() {
    
        return days;
    }
    
    /**
     * @param days the days to set
     */
    public void setDays(short days) {
    
        this.days = days;
    }
    
    /**
     * @return the address
     */
    public Address getAddress() {
    
        return address;
    }
    
    /**
     * @param address the address to set
     */
    public void setAddress(Address address) {
    
        this.address = address;
    }
    
}
