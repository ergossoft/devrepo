/**
 * 
 */

package ergossoft.web.api.openserviceorder;

import java.util.List;

import org.ergossoft.core.beans.openserviceorder.Company;
import org.ergossoft.core.beans.openserviceorder.Priority;
import org.ergossoft.core.beans.openserviceorder.ProblemCategory;
import org.ergossoft.core.beans.openserviceorder.PropertyType;
import org.ergossoft.core.beans.openserviceorder.ServiceOrder;
import org.ergossoft.services.OpenServiceOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author vsnarayana web REST API for open service order.
 */
@RestController ("/openserviceorder")
public class OpenServiceOrderWebApi {
	
    @Autowired
    OpenServiceOrder openServiceOrder; 
    /*
     * returns previous service orders booked by customer
     * @baseURL {www.ergossfot.com}
     * @url /openserviceorder/search/client/{id}
     * @parameter id is client booked service order identification number
     * 
     */
    @ResponseBody
    @RequestMapping (path = "/search/client/{id}", method=RequestMethod.POST)
    public List<ServiceOrder> getPreviousServiceOrders(
	    @RequestParam ("id") Long id) {    	
	return openServiceOrder.getPreviousServiceOrders(id);
    }

    /*-
     * returns previous service orders booked by client 
     * @parameter is client's name or address for booked service order 
     */
    @ResponseBody
    @RequestMapping (path={"/search/client/name=?","/search/client/address=?"}, method=RequestMethod.POST)
    public List<ServiceOrder> getPreviousServiceOrders(
	    @RequestParam ("addres") String value) {

	return openServiceOrder.getPreviousServiceOrders(value);
    }

    /*-
     * returns registered servicing company names 
     *  */
    @ResponseBody
    @RequestMapping(name="/allcompanynames")
    public List<Company> getAllConpanyNames(){
	return openServiceOrder.getAllConpanyNames();
    }

    /*-
     * returns all problem category information   
     *  */
    @ResponseBody
    @RequestMapping(name="/allproblemCategory")
    public List<ProblemCategory> getAllProblemTypes(){
	return openServiceOrder.getAllProblemTypes();
    }

    /*-
     * returns property information id and description
     *  */
    @ResponseBody
    @RequestMapping(name="/property")
    public List<PropertyType> getPropertyDescription(){
	return null;
    }

    /*-
     * returns all color codes 
     *  */
    @ResponseBody
    @RequestMapping(name="/colorcodes")
    public List<Priority> getColorCodes(){
	return null;
    }
    
    @ResponseBody
    @RequestMapping("/")
    public ModelAndView callToOpenServiceOrderPage() {
		ModelAndView view=new ModelAndView();
		view.addObject(getAllConpanyNames());
		view.addObject(getAllProblemTypes());
		//view.addObject();
	return view;
    }
}
