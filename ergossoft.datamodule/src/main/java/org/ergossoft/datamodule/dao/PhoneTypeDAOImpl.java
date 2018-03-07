/**
 * 
 */
package org.ergossoft.datamodule.dao;

import java.util.List;

import org.ergossoft.datamodule.entity.PhoneTypeEntity;
import org.ergossoft.datamodule.idao.PhoneTypeDAO;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Class Name: PhoneTypeDAOImpl Purpose:Implementing methods of AbstractDao and
 * PhoneTypeDAO
 * 
 * @version
 * @author Keerthi
 *
 */
@Repository
@Transactional
public class PhoneTypeDAOImpl extends AbstractDao<Integer, PhoneTypeEntity>
		implements PhoneTypeDAO {

	/**
	 * method : getAllRelationTypes()
	 * 
	 * @return : list of RelationType Entities
	 */

	@SuppressWarnings("unchecked")
	public List<PhoneTypeEntity> getAllPhoneTypes() {
		return getEntityManager().createNamedQuery("callGetPhoneTypes")
				.getResultList();
	}

}
