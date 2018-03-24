/**
 * 
 */
package com.ergossoft.datamodule.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

/*-
 * @author: Thilak Reddy 
 * This class is used for Defining Customer
 *              Details
 */
@Entity
@NamedNativeQueries({
        @NamedNativeQuery(name = "callGetCustomerSearchById",
                query = "call GetCustomerSearchById(?)",
                resultClass = CustomerEntity.class),
        @NamedNativeQuery(name = "callGetCustomerSearchByDate",
                query = "call GetCustomerSearchByDate(?)",
                resultClass = CustomerEntity.class),
        @NamedNativeQuery(name = "callGetCustomerSearchByName",
                query = "call GetCustomerSearchByName(?)",
                resultClass = CustomerEntity.class)

})
@Table(name = "")
public class CustomerEntity {

	/*-
	 * id is used for identifying customer with unique Id
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customerId", nullable = false)
	private Integer id;

	/*-
	 * name is used for identifying customer with a name
	 */

	@Column(name = "customername", nullable = false)
	private String name;

	/*-
	 * lastCall is used for knowing when customer called last time
	 */

	@Column(name = "LastCall", nullable = false)
	private Date lastCall;

	/*-
	 * update date is used for knowing when customer details updated
	 */

	@Column(name = "updatedate", nullable = false)
	private Date updatedate;

	/*-
	 * state id is used for knowing to which state customer belongs
	 */

	@Column(name = "stateid", nullable = false)
	private Integer stateid;

	/*-
	 * address is used for knowing customer address
	 */

	@Column(name = "CustomerServiceAddress", nullable = false)
	private String address;

	/*-
	 * zipcode is used for knowing customer zipcode
	 */

	@Column(name = "zipcode", nullable = false)
	private String zipcode;

	/*-
	 * zero-argument constructor
	 */

	public CustomerEntity () {
	}

	/*-
	 * Parameterized Constructor
	 */

	public CustomerEntity (String name, Date lastCall, Date updatedate,
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
	 * @return the id
	 */
	public Integer getId() {
		return id;

	}

	/**
	 * @param id
	 *            the id to set
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
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the lastCall
	 */
	public Date getLastCall() {
		return lastCall;
	}

	/**
	 * @param lastCall
	 *            the lastCall to set
	 */
	public void setLastCall(Date lastCall) {
		this.lastCall = lastCall;
	}

	/**
	 * @return the updatedate
	 */
	public Date getUpdatedate() {
		return updatedate;
	}

	/**
	 * @param updatedate
	 *            the updatedate to set
	 */
	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}

	/**
	 * @return the stateid
	 */
	public Integer getStateid() {
		return stateid;
	}

	/**
	 * @param stateid
	 *            the stateid to set
	 */
	public void setStateid(Integer stateid) {
		this.stateid = stateid;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the zipcode
	 */
	public String getZipcode() {
		return zipcode;
	}

	/**
	 * @param zipcode
	 *            the zipcode to set
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	/*-
	 * for Displaying Customer details instead of hashcode
	 */

	@Override
	public String toString() {
		return "CustomerEntity [id=" + id + ", name=" + name
		        + ", lastCall="
		        + lastCall + ", updatedate=" + updatedate + ", stateid="
		        + stateid + ", address=" + address + ", zipcode=" + zipcode
		        + "]";
	}

}
