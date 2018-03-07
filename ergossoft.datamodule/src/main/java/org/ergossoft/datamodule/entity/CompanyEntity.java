/**
 * 
 */
package org.ergossoft.datamodule.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

/**
 * Class Name: CompanyEntity Purpose: Entity Class
 * 
 * @version
 * @author THILAK REDDY
 *
 */
@Entity
@NamedNativeQueries({
		@NamedNativeQuery(name = "fetchCompanies", query = "call GetCompanyNames()", resultClass = CompanyEntity.class) })
public class CompanyEntity {

	/**
	 * variable:id type: integer
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "companyid", nullable = false)
	private Integer id;

	/**
	 * variable:name type: String
	 */

	@Column(name = "companyname", nullable = false)
	private String name;

	/**
	 * zero-argument constructor
	 */

	public CompanyEntity() {
	}

	/**
	 * Parameterized Constructor
	 */

	public CompanyEntity(String name) {
		super();
		this.name = name;
	}

	/**
	 * Getters and Setters
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * method:toString()
	 */

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "CompanyEntity [id=" + id + ", name=" + name + "]";
	}

}
