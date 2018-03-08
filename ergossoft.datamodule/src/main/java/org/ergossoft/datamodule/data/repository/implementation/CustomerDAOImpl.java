/**
 * 
 */
package org.ergossoft.datamodule.dao;

import java.util.Date;
import java.util.List;

import org.ergossoft.datamodule.entity.CustomerEntity;
import org.ergossoft.datamodule.idao.CustomerDAO;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Class Name: CustomerDAOImpl Purpose:Implementing methods of AbstractDao and
 * CustomerDAO
 * 
 * @version
 * @author THILAK REDDY
 *
 */
@Repository
@Transactional
public class CustomerDAOImpl extends AbstractDao<Integer, CustomerEntity>
		implements CustomerDAO {

	/**
	 * method : getAllCompanies()
	 * 
	 * @return : list of Company Entities
	 */

	@SuppressWarnings("unchecked")
	public List<CustomerEntity> getAllCustomersById(Integer id) {
		return getEntityManager().createNamedQuery("callGetCustomerSearchById")
				.setParameter(1, id).getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<CustomerEntity> getAllCustomersByName(String name) {
		return getEntityManager()
				.createNamedQuery("callGetCustomerSearchByName")
				.setParameter(1, name).getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<CustomerEntity> getAllCustomersByDate(Date date) {
		return getEntityManager()
				.createNamedQuery("callGetCustomerSearchByDate")
				.setParameter(1, date).getResultList();
	}

}
