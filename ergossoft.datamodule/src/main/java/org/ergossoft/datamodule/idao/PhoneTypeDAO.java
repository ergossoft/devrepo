package org.ergossoft.datamodule.idao;

import java.util.List;

import org.ergossoft.datamodule.entity.PhoneTypeEntity;

/**
 * Interface Name: PhoneTypeDAO
 * 
 * @version
 * @author Keerthi
 */

public interface PhoneTypeDAO {

	/**
	 * method: getAllPhoneTypes() purpose: for retrieving list of phone types
	 */

	public List<PhoneTypeEntity> getAllPhoneTypes();

}
