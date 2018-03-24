package com.ergossoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ergossoft.core.model.beans.Company;
import com.ergossoft.core.model.beans.MarketingCampaign;
import com.ergossoft.core.model.beans.PriorityDescription;
import com.ergossoft.core.model.beans.ProblemCategory;
import com.ergossoft.core.model.beans.ServiceOrder;
import com.ergossoft.services.serviceorder.manager.OpenServiceOrderManager;

@Service
public class OpenServiceOrderService {
	@Autowired
	 OpenServiceOrderManager openServiceOrderManager;

	/**
	 * 
	 */
	public OpenServiceOrderService() {}

	

	public List<Company> getCompanyNames() {
		return this.openServiceOrderManager.getListOfServiceCompanyNames();
	}

	public List<ProblemCategory> getProblemTypes() {
		return this.openServiceOrderManager.getListOfProblemTypes();
	}

	public List<ServiceOrder> getPreviousServiceOrders(String value) {
		return this.openServiceOrderManager.getPreviousServiceOrders(value);
	}

	public List<ServiceOrder> getPreviousServiceOrders(Long id) {
		return this.openServiceOrderManager.getPreviousServiceOrders(id);
	}

	public List<PriorityDescription> getAllPriorities() {
		return this.openServiceOrderManager.getPriorityDescription();
	}

	public List<MarketingCampaign> getMarketingCampaign() {
		return this.openServiceOrderManager.getMarketingCampaign();
	}



	public List<PriorityDescription> getAllPriorityDescription() {
		// TODO Auto-generated method stub
		return null;
	}
}
