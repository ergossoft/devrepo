/**
 * defining this package for dao layer
 */
package org.ergossoft.datamodule.dao;

import java.util.List;

import org.ergossoft.datamodule.entity.PropertyTypeEntity;
/**
 * @author Keerthi
 *
 */
public interface PropertyTypeDAO 
{
	List<PropertyTypeEntity> getPropertyTypes();

}
