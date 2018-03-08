/**
 * 
 */
package org.ergossoft.datamodule.dao;

import java.util.List;

import org.ergossoft.datamodule.entity.LocationEntity;
import org.ergossoft.datamodule.idao.LocationDAO;
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
public class LocationDAOImpl extends AbstractDao<Integer, LocationEntity>
		implements LocationDAO {

	/**
	 * method : getAllCompanies()
	 * 
	 * @return : list of Company Entities
	 */

	@SuppressWarnings("unchecked")
	public List<LocationEntity> getAllLocationDetails(String zipCode) {
		return getEntityManager().createNamedQuery("callGetCityandState")
				.setParameter(1, zipCode).getResultList();
	}

}
