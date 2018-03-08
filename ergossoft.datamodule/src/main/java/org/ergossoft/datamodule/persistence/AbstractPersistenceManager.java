/**
 * 
 */
package org.ergossoft.datamodule.persistence;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/*-
 * @author  Thilak Reddy
 *
 * This class is used for returning entity Manager
 */
public abstract class AbstractPersistenceManager {
	
	/*-
	 * entityManager is used for calling stored procedures
	 */
	@PersistenceContext
	EntityManager entityManager;

	/**
	 * @return the entityManager
	 */
	protected EntityManager getEntityManager() {
		return this.entityManager;
	}

}
