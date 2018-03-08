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

/*-
 * @author: Thilak Reddy 
 * This class is used for Defining Company
 *              Details
 */
@Entity
@NamedNativeQueries({
		@NamedNativeQuery(name = "fetchCompanies", query = "call GetCompanyNames()", resultClass = CompanyEntity.class) })
public class CompanyEntity {

	/*-
	 * id is used for identifying company with unique Id
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "companyid", nullable = false)
	private Integer id;

	/*-
	 * name is used for identifying company with a name
	 */

	@Column(name = "companyname", nullable = false)
	private String name;

	/*-
	 * zero-argument constructor
	 */

	public CompanyEntity() {
	}

	/*-
	 * Parameterized Constructor
	 */

	public CompanyEntity(String name) {
		super();
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*-
	 * for Displaying ComPany details instead of hashcode
	 */

	@Override
	public String toString() {
		return "CompanyEntity [id=" + id + ", name=" + name + "]";
	}

}
