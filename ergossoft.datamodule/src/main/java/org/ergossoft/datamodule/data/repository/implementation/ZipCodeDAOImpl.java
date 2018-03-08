/**
 * 
 */
package org.ergossoft.datamodule.dao;

import java.util.List;

import org.ergossoft.datamodule.entity.ZipCodeEntity;
import org.ergossoft.datamodule.idao.ZipCodeDAO;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Class Name: ZipCodeDAOImpl Purpose:Implementing methods of AbstractDao and
 * ZipCodeDAO
 * 
 * @version
 * @author THILAK REDDY
 *
 */
@Repository
@Transactional
public class ZipCodeDAOImpl extends AbstractDao<Integer, ZipCodeEntity>
		implements ZipCodeDAO {

	/**
	 * method : getAllZipCodes()
	 * 
	 * @return : list of ZipCode Entities
	 */

	@SuppressWarnings("unchecked")
	public List<ZipCodeEntity> getAllZipCodes() {
		return getEntityManager().createNamedQuery("fetchAllZipCodes")
				.getResultList();
	}

}
