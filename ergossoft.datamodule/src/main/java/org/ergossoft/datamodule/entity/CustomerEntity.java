/**
 * 
 */
package org.ergossoft.datamodule.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

/**
 * Class Name: CustomerEntity Purpose: Entity Class
 * 
 * @version
 * @author THILAK REDDY
 *
 */
@Entity
@NamedNativeQueries({
		@NamedNativeQuery(name = "callGetCustomerSearchById", query = "call GetCustomerSearchById(?)", resultClass = CustomerEntity.class),
		@NamedNativeQuery(name = "callGetCustomerSearchByDate", query = "call GetCustomerSearchByDate(?)", resultClass = CustomerEntity.class),
		@NamedNativeQuery(name = "callGetCustomerSearchByName", query = "call GetCustomerSearchByName(?)", resultClass = CustomerEntity.class)

})

public class CustomerEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * variable:id type: integer
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customerId", nullable = false)
	private Integer id;

	/**
	 * variable:name type: String
	 */

	@Column(name = "customername", nullable = false)
	private String name;

	@Column(name = "LastCall", nullable = false)
	private Date lastCall;

	@Column(name = "updatedate", nullable = false)
	private Date updatedate;

	@Column(name = "stateid", nullable = false)
	private Integer stateid;

	@Column(name = "CustomerServiceAddress", nullable = false)
	private String address;

	@Column(name = "zipcode", nullable = false)
	private String zipcode;

	public Date getLastCall() {
		return lastCall;
	}

	public void setLastCall(Date lastCall) {
		this.lastCall = lastCall;
	}

	public Date getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}

	public Integer getStateid() {
		return stateid;
	}

	public void setStateid(Integer stateid) {
		this.stateid = stateid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	/**
	 * zero-argument constructor
	 */

	public CustomerEntity() {
	}

	/**
	 * Parameterized Constructor
	 */

	public CustomerEntity(String name, Date lastCall, Date updatedate,
			Integer stateid, String address, String zipcode) {
		super();
		this.name = name;
		this.lastCall = lastCall;
		this.updatedate = updatedate;
		this.stateid = stateid;
		this.address = address;
		this.zipcode = zipcode;
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * method:toString()
	 */

	@Override
	public String toString() {
		return "CustomerEntity [id=" + id + ", name=" + name + ", lastCall="
				+ lastCall + ", updatedate=" + updatedate + ", stateid="
				+ stateid + ", address=" + address + ", zipcode=" + zipcode
				+ "]";
	}

}
