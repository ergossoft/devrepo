package org.ergossoft.services;

import java.util.List;

import org.ergossoft.core.beans.openserviceorder.Company;
import org.ergossoft.core.beans.openserviceorder.ProblemCategory;
import org.ergossoft.core.beans.openserviceorder.ServiceOrder;
import org.ergossoft.services.serviceorder.manager.impl.OpenServiceOrderManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OpenServiceOrder {
    @Autowired
    protected OpenServiceOrderManager openServiceOrderManager;
    
    /**
     * 
     */
    public OpenServiceOrder() {
	this.openServiceOrderManager=new OpenServiceOrderManager();
    }
    
    /**
     * @param openServiceOrderManager
     */
    protected OpenServiceOrder(
	    OpenServiceOrderManager openServiceOrderManager) {
	this.openServiceOrderManager = openServiceOrderManager;
    }

    public List<Company> getAllConpanyNames(){	
	return this.openServiceOrderManager.getListOfServiceCompanyNames();
    }
    public List<ProblemCategory> getAllProblemTypes(){
	return this.openServiceOrderManager.getListOfProblemTypes();
    }
    public List<ServiceOrder> getPreviousServiceOrders(String value){
    	return this.openServiceOrderManager.getPreviousServiceOrders(value); 
    }
    public List<ServiceOrder> getPreviousServiceOrders(Long id){
    	return this.openServiceOrderManager.getPreviousServiceOrders(id); 
    }
}
