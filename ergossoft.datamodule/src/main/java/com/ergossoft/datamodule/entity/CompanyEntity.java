/**
 * 
 */
package com.ergossoft.datamodule.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/*-
 * @author: Thilak Reddy 
 * This class is used for Defining Company
 *              Details
 */
@Entity
@NamedNativeQueries({
        @NamedNativeQuery(name = "fetchCompanies",
                query = "call GetCompanyNames()",
                resultClass = CompanyEntity.class) })

@Table(name = "Company")
public class CompanyEntity extends CommonEntity {

	/*-
	 * id is used for identifying company with unique Id
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CompanyId", nullable = false)
	private Integer id;

	/*-
	 * name is used for identifying company with a name
	 */

	@Column(name = "CompanyName", nullable = false)
	private String name;

	/*-
	 * address field is to hold company address location string value 
	 */
	@Column(name = "CompanyAddress")
	private String address;
	/*-
	 * city
	 */
	@Column(name = "City")
	private String city;
	/*-
	 * stateEntityReferences
	 */
	@OneToMany(mappedBy = "State", cascade = CascadeType.ALL,
	        fetch = FetchType.LAZY)
	@JoinColumn(name = "StateId")
	private List<StateEntity>	stateEntityReferences;
	/*-
	 * zipCodeEntityReferneces
	 */
	@OneToMany(mappedBy = "ZipCode", cascade = CascadeType.ALL,
	        fetch = FetchType.LAZY)
	@JoinColumn(name = "ZipCodeId")
	private List<ZipCodeEntity>	zipCodeEntityReferneces;
	@ManyToMany(mappedBy="Customer",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	//@JoinTable()
	private List<CustomerEntity> customerEntityReferences;
	/*
	 * 
	 * 
	 * City
	 * StateId
	 * ZipCodeId
	 * CustomerId
	 * CompanyStatus
	 * Country
	 * FederalId
	 * ContactId
	 */

}
