package org.ergossoft.datamodule.idao;

import java.util.List;

import org.ergossoft.datamodule.entity.ProblemCodeEntity;

/**
 * Interface Name: ProblemCodeDAO
 * 
 * @version
 * @author THILAK REDDY
 */

public interface ProblemCodeDAO {

	/**
	 * method: getAllProblemCodes() purpose: for retrieving list of problemCodes
	 */

	public List<ProblemCodeEntity> getAllProblemCodes();

}
