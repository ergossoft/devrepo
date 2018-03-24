/**
 * 
 */

package com.ergossoft.web.api.openserviceorder;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ergossoft.core.model.beans.Company;
import com.ergossoft.core.model.beans.MarketingCampaign;
import com.ergossoft.core.model.beans.PriorityDescription;
import com.ergossoft.core.model.beans.ProblemCategory;
import com.ergossoft.core.model.beans.PropertyDescription;
import com.ergossoft.core.model.beans.ServiceOrder;
import com.ergossoft.services.OpenServiceOrderService;

/**
 * @author vsnarayana web REST API for open service order.
 */
@RestController
@RequestMapping("/serviceorder")
public class OpenServiceOrderWebApi {
	
    @Autowired
    OpenServiceOrderService openServiceOrderService; 
    /* logger */
    private static Logger log=Logger.getLogger(OpenServiceOrderWebApi.class);
    
    /*
     * returns previous service orders booked by customer
     * @baseURL {www.ergossfot.com}
     * @url /openserviceorder/search/client/{id}
     * @parameter id is client booked service order identification number
     * 
     */
    @ResponseBody
    @RequestMapping (value="/search/client/{id}", method=RequestMethod.POST)
    public List<ServiceOrder> getPreviousServiceOrders(
	    @RequestParam ("id") Long id) {    	
    	log.info("api call:"+":"+"/search/client/{id}");
	return openServiceOrderService.getPreviousServiceOrders(id);
    }

    /*-
     * returns previous service orders booked by client 
     * @parameter is client's name or address for booked service order 
     */
    @ResponseBody
    @RequestMapping (value={"/search/client/name=?","/search/client/address=?"}, method=RequestMethod.POST)
    
    public List<ServiceOrder> getPreviousServiceOrders(
	    @RequestParam ("addres") String value) {
    	log.info("api call:"+":"+"/search/client/name=?");
	return openServiceOrderService.getPreviousServiceOrders(value);
    }

    /*-
     * returns registered servicing company names 
     *  */
    @ResponseBody
    @RequestMapping(value="/allcompanynames")
    public List<Company> getAllCompanyNames(){
    	log.info("api call:"+":"+"/allcompanynames");
	return openServiceOrderService.getCompanyNames();
    }

    /*-
     * returns all problem category information   
     *  */
    @ResponseBody
    @RequestMapping(value="/allproblemCategory")
    public List<ProblemCategory> getAllProblemTypes(){
    	log.info("api call:"+":"+"/allproblemCategory");
	return openServiceOrderService.getProblemTypes();
    }

    /*-
     * returns property information id and description
     *  */
    /*@ResponseBody
    @RequestMapping(value="/property")
    
	public List<PropertyDescription> getPropertyDescriptions(){
    	log.info("api call:"+":"+"/property");
	return null;
    }*/

    /*-
     * returns all color codes
     * or priorities 
     *  */
    /*@ResponseBody
    @RequestMapping(value="/colorcodes")
    public List<PriorityDescription> getColorCodes(){
    	log.info("api call:"+":"+"/property");
	return this.openServiceOrderService.getAllPriorityDescription();
    }*/
    /*-
     * returns all color codes
     * or priorities 
     *  */
    @ResponseBody
    @RequestMapping(value="/MarketingCampaign")
    public List<MarketingCampaign> getMarketingCampaignDescriptions(){
    	log.info("api call:"+":"+"/MarketingCampaign");
	return null;
    }
  
    @ResponseBody
    @RequestMapping("/open")
    public ModelAndView callToOpenServiceOrderPage() {
    	log.info("api call:"+":"+"/open");
		ModelAndView view=new ModelAndView();
		view.addObject(openServiceOrderService.getCompanyNames());
		view.addObject(openServiceOrderService.getProblemTypes());
		//view.addObject(getColorCodes());
		//view.addObject();
	return view;
    }
}
