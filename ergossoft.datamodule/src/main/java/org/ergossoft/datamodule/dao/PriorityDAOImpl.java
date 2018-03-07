/**
 * 
 */
package org.ergossoft.datamodule.dao;

import java.util.List;

import org.ergossoft.datamodule.entity.PriorityEntity;
import org.ergossoft.datamodule.idao.PriorityDAO;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Class Name: CompanyDAOImpl Purpose:Implementing methods of AbstractDao and
 * CompanyDAO
 * 
 * @version
 * @author THILAK REDDY
 *
 */
@Repository
@Transactional
public class PriorityDAOImpl extends AbstractDao<Integer, PriorityEntity>
		implements PriorityDAO {

	/**
	 * method : getAllCompanies()
	 * 
	 * @return : list of Company Entities
	 */

	@SuppressWarnings("unchecked")
	public List<PriorityEntity> getAllPriorities() {
		return getEntityManager().createNamedQuery("callGetColors")
				.getResultList();
	}

}
