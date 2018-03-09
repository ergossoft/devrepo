/**
 * 
 */
package org.ergossoft.services.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author vsnarayana
 *
 */

@Configuration
@ComponentScan(basePackages = {"org.ergossoft.services"})
//@Import(value={JpaConfiguration.class})
public class ServicesConfiguration {
		
}
