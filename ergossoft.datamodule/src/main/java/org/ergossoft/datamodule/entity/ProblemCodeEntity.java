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
 * Class Name: ProblemCodeEntity Purpose: Entity Class
 * 
 * @version
 * @author THILAK REDDY
 *
 */
@Entity
@NamedNativeQueries({
		@NamedNativeQuery(name = "callGetProblemCodes()", query = "call GetProblemCodes()", resultClass = ProblemCodeEntity.class) })
public class ProblemCodeEntity {

	/**
	 * variable:id type: integer
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "problemcategeoryid", nullable = false)
	private Integer id;

	/**
	 * variable:name type: String
	 */

	@Column(name = "ProblemCategeoryName", nullable = false)
	private String name;

	@Column(name = "ProblemCategeoryDescription")
	private String description;

	@Column(name = "ProblemTypeId", nullable = false)
	private Integer problemTypeId;

	@Column(name = "ProblemTypeName", nullable = false)
	private String problemTypeName;

	/**
	 * zero-argument constructor
	 */

	public ProblemCodeEntity() {
	}

	/**
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getProblemTypeId() {
		return problemTypeId;
	}

	public void setProblemTypeId(Integer problemTypeId) {
		this.problemTypeId = problemTypeId;
	}

	public String getProblemTypeName() {
		return problemTypeName;
	}

	public void setProblemTypeName(String problemTypeName) {
		this.problemTypeName = problemTypeName;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * method:toString()
	 */

	@Override
	public String toString() {
		return "ProblemCodeEntity [id=" + id + ", name=" + name
				+ ", description=" + description + ", problemTypeId="
				+ problemTypeId + ", problemTypeName=" + problemTypeName + "]";
	}

}
