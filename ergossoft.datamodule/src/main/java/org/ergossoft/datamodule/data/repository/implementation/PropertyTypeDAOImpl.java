/**
 * 
 */
package org.ergossoft.datamodule.dao;

import java.util.List;

import org.ergossoft.datamodule.entity.PropertyTypeEntity;
import org.ergossoft.datamodule.idao.PropertyTypeDAO;
import org.hibernate.validator.xml.PropertyType;
import org.springframework.stereotype.Repository;

/**
 * @author Keerthi
 *
 */
@Repository("propertyTypeDao")
public class PropertyTypeDAOImpl extends AbstractDao<Integer, PropertyType>
		implements PropertyTypeDAO {
	/**
	 * method : getPropertyTypes()
	 * 
	 * @return : list of Property Type Entities
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<PropertyTypeEntity> getPropertyTypes() {
		// TODO Auto-generated method stub

		return getEntityManager().createNamedQuery("callGetPropertyTypes")
				.getResultList();
	}

}
