/**
 * 
 */
package com.ergossoft.datamodule.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

/*-
 * @author: Thilak Reddy 
 * This class is used for Defining ProblemCode
 *              Details
 */

@Entity
@NamedNativeQueries({
		@NamedNativeQuery(name = "callGetProblemCodes()", query = "call GetProblemCodes()", resultClass = ProblemCodeEntity.class) })
public class ProblemCodeEntity {

	/*-
	 *  id is used for identifying Problem code with unique Id
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "problemcategeoryid", nullable = false)
	private Integer id;

	/*-
	 *  name is used for identifying ProblemCategory with name
	 */

	@Column(name = "ProblemCategeoryName", nullable = false)
	private String name;

	/*-
	 *  description is used for describing the ProblemCategory
	 */

	@Column(name = "ProblemCategeoryDescription")
	private String description;

	/*-
	 *  problemTypeId is used for describing the problemTypeId
	 */

	@Column(name = "ProblemTypeId", nullable = false)
	private Integer problemTypeId;

	/*-
	 *  problemTypeName is used for describing the problemTypeName
	 */

	@Column(name = "ProblemTypeName", nullable = false)
	private String problemTypeName;

	/*-
	 * zero-argument constructor
	 */

	public ProblemCodeEntity() {
	}

	/*-
	 * Parameterized Constructor
	 */

	public ProblemCodeEntity(String name, String description,
			Integer problemTypeId, String problemTypeName) {
		super();
		this.name = name;
		this.description = description;
		this.problemTypeId = problemTypeId;
		this.problemTypeName = problemTypeName;
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

	/**
	 * @return the problemTypeId
	 */
	public Integer getProblemTypeId() {
		return problemTypeId;
	}

	/**
	 * @param problemTypeId the problemTypeId to set
	 */
	public void setProblemTypeId(Integer problemTypeId) {
		this.problemTypeId = problemTypeId;
	}

	/**
	 * @return the problemTypeName
	 */
	public String getProblemTypeName() {
		return problemTypeName;
	}

	/**
	 * @param problemTypeName the problemTypeName to set
	 */
	public void setProblemTypeName(String problemTypeName) {
		this.problemTypeName = problemTypeName;
	}

	/*-
	 *  for Displaying ProblemCode details instead of hashcode
	 */

	@Override
	public String toString() {
		return "ProblemCodeEntity [id=" + id + ", name=" + name
				+ ", description=" + description + ", problemTypeId="
				+ problemTypeId + ", problemTypeName=" + problemTypeName + "]";
	}

}
