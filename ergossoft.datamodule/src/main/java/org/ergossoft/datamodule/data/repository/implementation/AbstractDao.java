/**
 * 
 */
package org.ergossoft.datamodule.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Class Name:AbstractDao Purpose: for performing crud operations of entities
 * 
 * @version
 * @author THILAK REDDY
 *
 */
public abstract class AbstractDao<PK extends Serializable, T> {

	/**
	 * final Instance variable :persistentClass type: Class
	 */
	private final Class<T> persistentClass;

	/**
	 * constructor AbstractDao
	 */

	@SuppressWarnings("unchecked")
	public AbstractDao() {
		this.persistentClass = (Class<T>) ((ParameterizedType) this.getClass()
				.getGenericSuperclass()).getActualTypeArguments()[1];
	}

	/**
	 * variable name:entityManager type: EntityManager
	 */

	@PersistenceContext
	EntityManager entityManager;

	/**
	 * method : getEntityManager()
	 * 
	 * @return : EntityManager
	 */

	protected EntityManager getEntityManager() {
		return this.entityManager;
	}

	/**
	 * method : getByKey()
	 * 
	 * @Param: primary key
	 * @return : EntityClass Instance
	 */

	protected T getByKey(PK key) {
		return (T) entityManager.find(persistentClass, key);
	}

	/**
	 * method : persist() purpose: saving the entity object into related table
	 * 
	 * @Param: EntityClass Instance
	 * @return : void
	 */

	protected void persist(T entity) {
		entityManager.persist(entity);
	}

	/**
	 * method : update() purpose: updating the record in the database
	 * 
	 * @Param: EntityClass Instance
	 * @return : void
	 */

	protected void update(T entity) {
		entityManager.merge(entity);
	}

	/**
	 * method : delete() purpose: deleting the record from entity related table
	 * 
	 * @Param: EntityClass Instance
	 * @return : void
	 */

	protected void delete(T entity) {
		entityManager.remove(entity);
	}

}
