/**
 * 
 */
package org.ergossoft.datamodule.dao;

import java.util.List;

import org.ergossoft.datamodule.entity.RelationTypeEntity;
import org.ergossoft.datamodule.idao.RelationTypeDAO;
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
public class RelationTypeDAOImpl extends
		AbstractDao<Integer, RelationTypeEntity> implements RelationTypeDAO {

	/**
	 * method : getAllRelationTypes()
	 * 
	 * @return : list of RelationType Entities
	 */

	@SuppressWarnings("unchecked")
	public List<RelationTypeEntity> getAllRelationTypes() {
		return getEntityManager().createNamedQuery("callRelationTypes")
				.getResultList();
	}

}
