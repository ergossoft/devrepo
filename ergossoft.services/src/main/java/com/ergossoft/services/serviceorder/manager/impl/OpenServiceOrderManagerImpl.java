/**
 * 
 */
package com.ergossoft.services.serviceorder.manager.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ergossoft.core.model.beans.Address;
import com.ergossoft.core.model.beans.Company;
import com.ergossoft.core.model.beans.ContactLine;
import com.ergossoft.core.model.beans.MarketingCampaign;
import com.ergossoft.core.model.beans.PriorityDescription;
import com.ergossoft.core.model.beans.ProblemCategory;
import com.ergossoft.core.model.beans.ServiceOrder;
import com.ergossoft.services.serviceorder.manager.OpenServiceOrderManager;

/**
 * OpenServiceOrder is a supporting service class for open service order web API
 * 
 * @author satya
 *
 */
@Component
public class OpenServiceOrderManagerImpl implements OpenServiceOrderManager {
	@Autowired
	//OpenServiceOrderRepositoryImpl openServiceOrderRepository;
	private static final Logger log = Logger.getLogger(OpenServiceOrderManager.class);
	
	public List<Company> getListOfServiceCompanyNames() {
		log.info("method : getListOfServiceCompanyNames"+"::"+"getting company data");
		// TODO Auto-generated method stub
		List<Company> companyBeans = new ArrayList<Company>();
		//List<CompanyEntity> entities = this.openServiceOrderRepository.getAllCompanies();
		
		//for (CompanyEntity ce : entities) {
		//	Company companybean = new Company();
		//	companyBeans.add(Converter.convertEntityToCompanyBean(companybean, ce));
		//}
		Company c1=new Company();
		c1.setName("abs-tv-reparer");
		companyBeans.add(c1);
		Company c2=new Company();
		c2.setName("absz-tv-reparer");
		companyBeans.add(c2);
		log.info("method : getListOfServiceCompanyNames"+"::"+"company data"+c1.getName());
		return companyBeans;
	}

	public List<ProblemCategory> getListOfProblemTypes() {

		// TODO Auto-generated method stubC
		List<ProblemCategory> problemCategoryBeans=new ArrayList<ProblemCategory>();
		/*List<ProblemCodeEntity> problemEntities=this.openServiceOrderRepository.getAllProblemCodes();
		for(ProblemCodeEntity pce: problemEntities){
			ProblemCategory problemCategory=new ProblemCategory();
			problemCategoryBeans.add(Converter.convertEntityToProblemCategoryBean(problemCategory,pce));
					
		}*/
		ProblemCategory pc1=new ProblemCategory();
		pc1.setName("Electrical");
		ProblemCategory pc2=new ProblemCategory();
		pc2.setName("Mechanical");
		problemCategoryBeans.add(pc1);
		problemCategoryBeans.add(pc2);
		return problemCategoryBeans;
	}

	public List<PriorityDescription> getServicePriorityList() {

		// TODO Auto-generated method stub
		return null;
	}

	public List<ContactLine> getContactLines() {

		// TODO Auto-generated method stub
		return null;
	}

	public List<Address> getAddressList() {

		// TODO Auto-generated method stub
		return null;
	}

	public List<PriorityDescription> getPriorityDescription() {

		// TODO Auto-generated method stub
		return null;
	}

	public List<ServiceOrder> getPreviousServiceOrders(String value) {

		// TODO Auto-generated method stub
		List<ServiceOrder> serviceOrderBeans=new ArrayList<ServiceOrder>();
		/*List<CustomerEntity> csoe = this.openServiceOrderRepository.getAllCustomersByName(value);
		for (CustomerEntity e: csoe){
			ServiceOrder serviceOrder=new ServiceOrder();
			serviceOrderBeans.add(Converter.convertEntityToServiceOrderBean(serviceOrder,e));
		}*/
		ServiceOrder so=new ServiceOrder();
		Company c1=new Company();
		c1.setName("abs-tv-reparer");
		so.setCompany(c1);
		so.setDate(new Date("12-08-2019"));
		so.setEmail("nara@suiwn.com");
		ServiceOrder so1=new ServiceOrder();
		Company c2=new Company();
		c1.setName("absz-tv-reparer");
		so1.setCompany(c2);
		so1.setDate(new Date("12-08-2019"));
		so1.setEmail("nara@suiwn.com");
		serviceOrderBeans.add(so1);
		return null;
	}

	@Override
	public List<ServiceOrder> getPreviousServiceOrders(Long RegisterId) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ergossoft.services.serviceorder.manager.OpenserviceOrderManager#
	 * getMarketingCampaign()
	 */
	@Override
	public List<MarketingCampaign> getMarketingCampaign() {
		// TODO Auto-generated method stub
		return null;
	}

}
