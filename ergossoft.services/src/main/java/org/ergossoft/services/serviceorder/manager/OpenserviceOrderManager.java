/**
 * 
 */
package org.ergossoft.services.serviceorder.manager;

import java.util.List;

import org.ergossoft.core.beans.openserviceorder.Address;
import org.ergossoft.core.beans.openserviceorder.Company;
import org.ergossoft.core.beans.openserviceorder.ContactLine;
import org.ergossoft.core.beans.openserviceorder.Priority;
import org.ergossoft.core.beans.openserviceorder.ProblemCategory;
import org.ergossoft.core.beans.openserviceorder.ServiceOrder;

/**
 * @author vsnarayana
 * 
 */
public interface OpenserviceOrderManager {
    public List<Company> getListOfServiceCompanyNames();
    public List<ProblemCategory> getListOfProblemTypes();
    //public List<Technicians> getListofTechnicians();
    public List<Priority> getServicePriorityList();
    public List<ContactLine> getContactLines();
    public List<Address> getAddressList();
    public List<Priority> getPriorities();
    public List<ServiceOrder> getPreviousServiceOrders(String value);
    public List<ServiceOrder> getPreviousServiceOrders(Long RegisterId);
}
