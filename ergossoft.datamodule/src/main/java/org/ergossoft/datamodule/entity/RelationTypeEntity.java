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
 * This class is used for Defining RelationType Details
 */

@Entity
@NamedNativeQueries({
		@NamedNativeQuery(name = "callRelationTypes", query = "call GetRelationshipTypes()", resultClass = RelationTypeEntity.class) })
public class RelationTypeEntity {

	/*-
	 *  id is used for identifying Relation Type with unique Id
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RelationshipTypeId", nullable = false)
	private Integer id;

	/*-
	 *  type is used for identifying Relation Type
	 */

	@Column(name = "type", nullable = false)
	private String type;

	/*-
	 *  description is used for describing the Relation
	 */

	@Column(name = "description", nullable = false)
	private String description;

	/*-
	 * zero-argument constructor
	 */

	public RelationTypeEntity() {
	}

	/*-
	 * Parameterized Constructor
	 */

	public RelationTypeEntity(String type, String description) {
		super();
		this.type = type;
		this.description = description;
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
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/*-
	 *  for Displaying Relation details instead of hashcode
	 */

	@Override
	public String toString() {
		return "RelationTypeEntity [id=" + id + ", type=" + type
				+ ", description=" + description + "]";
	}

}
