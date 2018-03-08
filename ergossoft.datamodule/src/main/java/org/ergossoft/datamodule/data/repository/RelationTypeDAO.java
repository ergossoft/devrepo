package org.ergossoft.datamodule.idao;

import java.util.List;

import org.ergossoft.datamodule.entity.CompanyEntity;
import org.ergossoft.datamodule.entity.RelationTypeEntity;

/**
 * Interface Name: CompanyDAO
 * 
 * @version
 * @author THILAK REDDY
 */

public interface RelationTypeDAO {

	/**
	 * method: getAllRelationTypes() purpose: for retrieving list of relation
	 * types
	 */

	public List<RelationTypeEntity> getAllRelationTypes();

}
