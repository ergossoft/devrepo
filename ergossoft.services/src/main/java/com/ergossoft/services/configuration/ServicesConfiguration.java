/**
 * 
 */
package com.ergossoft.services.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author vsnarayana
 *
 */

@Configuration
@ComponentScan(basePackages = {"org.ergossoft.services","org.ergossoft.services.serviceorder.manager.impl"})
//@Import(value={JpaConfiguration.class})

public class ServicesConfiguration {
		
	/*@Autowired
	private Environment env;*/
	
	/*@Bean
	public Properties logProperties(){
		Properties p= new Properties();
		p.setProperty("log4j.rootLogger", env.getRequiredProperty("log4j.rootLogger"));
		p.setProperty("log4j.appender.file", env.getRequiredProperty("log4j.appender.file"));
		p.setProperty("log4j.appender.file.File", env.getRequiredProperty("log4j.appender.file.File"));
		p.setProperty("log4j.appender.file.DatePattern", env.getRequiredProperty("log4j.appender.file.DatePattern"));
		p.setProperty("log4j.appender.file.Append", env.getRequiredProperty("log4j.appender.file.Append"));
		p.setProperty("log4j.appender.file.layout", env.getRequiredProperty("log4j.appender.file.layout"));
		p.setProperty("log4j.appender.file.layout.ConversionPattern", env.getRequiredProperty("log4j.appender.file.layout.ConversionPattern"));
		p.setProperty("log4j.appender.file.Threshold", env.getRequiredProperty("log4j.appender.file.Threshold"));
		p.setProperty("log4j.logger.com.swp", env.getRequiredProperty("log4j.logger.com.swp"));
		return p;
	}*/
	/*@Bean
	public AutowiredAnnotationBeanPostProcessor autowiredAnnotationBeanPostProcessor(){
		return new AutowiredAnnotationBeanPostProcessor();
	}*/
	/*@Bean
	public OpenServiceOrderManager OpenServiceOrderManager(){
		return new OpenServiceOrderManager();
	}
	@Bean
	public OpenServiceOrderService OpenServiceOrderService(){
		return new OpenServiceOrderService();
	}*/
}
