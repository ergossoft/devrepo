/**
 * 
 */
package com.ergossoft.services.serviceorder.manager;

import java.util.List;

import com.ergossoft.core.model.beans.Address;
import com.ergossoft.core.model.beans.Company;
import com.ergossoft.core.model.beans.ContactLine;
import com.ergossoft.core.model.beans.MarketingCampaign;
import com.ergossoft.core.model.beans.PriorityDescription;
import com.ergossoft.core.model.beans.ProblemCategory;
import com.ergossoft.core.model.beans.ServiceOrder;

/**
 * @author vsnarayana
 * 
 */
public interface OpenServiceOrderManager {
    public List<Company> getListOfServiceCompanyNames();
    public List<ProblemCategory> getListOfProblemTypes();
    //public List<Technicians> getListofTechnicians();
    public List<PriorityDescription> getServicePriorityList();
    public List<ContactLine> getContactLines();
    public List<Address> getAddressList();
    public List<PriorityDescription> getPriorityDescription();
    public List<ServiceOrder> getPreviousServiceOrders(String value);
    public List<ServiceOrder> getPreviousServiceOrders(Long RegisterId);
    public List<MarketingCampaign> getMarketingCampaign();
}
