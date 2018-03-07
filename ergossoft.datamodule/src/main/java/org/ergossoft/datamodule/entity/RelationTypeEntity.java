/**
 * 
 */
package org.ergossoft.datamodule.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

/**
 * Class Name: RelationTypeEntity Purpose: Entity Class
 * 
 * @version
 * @author THILAK REDDY
 *
 */
@Entity
@NamedNativeQueries({
		@NamedNativeQuery(name = "callRelationTypes", query = "call GetRelationshipTypes()", resultClass = RelationTypeEntity.class) })
public class RelationTypeEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * variable:id type: integer
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RelationshipTypeId", nullable = false)
	private Integer id;

	/**
	 * variable:name type: String
	 */

	@Column(name = "type", nullable = false)
	private String type;

	/**
	 * variable:description type: String
	 */

	@Column(name = "description", nullable = false)
	private String description;

	/**
	 * zero-argument constructor
	 */

	public RelationTypeEntity() {
	}

	/**
	 * Parameterized Constructor
	 */

	public RelationTypeEntity(String type, String description) {
		super();
		this.type = type;
		this.description = description;
	}

	/**
	 * Getters and Setters
	 */

	public Integer getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * method:toString()
	 */

	@Override
	public String toString() {
		return "CompanyEntity [id=" + id + ", type=" + type + ", description="
				+ description + "]";
	}

}
