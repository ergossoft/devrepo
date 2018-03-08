package org.ergossoft.datamodule.idao;

import java.util.List;

import org.ergossoft.datamodule.entity.PriorityEntity;

/**
 * Interface Name: PriorityDAO
 * 
 * @version
 * @author THILAK REDDY
 */

public interface PriorityDAO {

	/**
	 * method: getAllPriorities() purpose: for retrieving list of priorities
	 */

	public List<PriorityEntity> getAllPriorities();

}
