/**
 * 
 */
package org.ergossoft.datamodule.dao;

import java.util.List;

import org.ergossoft.datamodule.entity.CompanyEntity;
import org.ergossoft.datamodule.idao.CompanyDAO;
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
public class CompanyDAOImpl extends AbstractDao<Integer, CompanyEntity>
		implements CompanyDAO {

	/**
	 * method : getAllCompanies()
	 * 
	 * @return : list of Company Entities
	 */

	@SuppressWarnings("unchecked")
	public List<CompanyEntity> getAllCompanies() {
		return getEntityManager().createNamedQuery("fetchCompanies")
				.getResultList();
	}

}
