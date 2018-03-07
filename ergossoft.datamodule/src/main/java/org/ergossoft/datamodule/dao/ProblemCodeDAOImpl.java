/**
 * 
 */
package org.ergossoft.datamodule.dao;

import java.util.List;

import org.ergossoft.datamodule.entity.ProblemCodeEntity;
import org.ergossoft.datamodule.idao.ProblemCodeDAO;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Class Name: ProblemCodeDAOImpl Purpose:Implementing methods of AbstractDao
 * and ProblemCodeDAO
 * 
 * @version
 * @author THILAK REDDY
 *
 */
@Repository
@Transactional
public class ProblemCodeDAOImpl extends AbstractDao<Integer, ProblemCodeEntity>
		implements ProblemCodeDAO {

	/**
	 * method : getAllCompanies()
	 * 
	 * @return : list of Company Entities
	 */

	@SuppressWarnings("unchecked")
	public List<ProblemCodeEntity> getAllProblemCodes() {
		return getEntityManager().createNamedQuery("callGetProblemCodes()")
				.getResultList();
	}

}
