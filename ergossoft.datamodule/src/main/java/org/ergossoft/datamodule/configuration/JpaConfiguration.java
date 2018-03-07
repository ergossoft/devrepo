/**
 * 
 */
package org.ergossoft.datamodule.configuration;

import java.util.Properties;

import javax.naming.NamingException;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

/**
 * Class Name: JpaConfiguration Purpose:Configurations for connecting to data
 * base
 * 
 * @version
 * @author THILAK REDDY
 *
 */

@Configuration
@ComponentScan(basePackages = { "org.ergossoft.datamodule.dao" })
@PropertySource("classpath:application.properties")
public class JpaConfiguration {

	/**
	 * Instance variable
	 * 
	 * type:Environment name:env purpose: accessing property file properties
	 */

	@Autowired
	private Environment env;

	/**
	 * Instance method name:dataSource()
	 * 
	 * @return:DataSource object
	 */

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(
				env.getRequiredProperty("spring.datasource.driver-class-name"));
		dataSource.setUrl(env.getRequiredProperty("spring.datasource.url"));
		dataSource.setUsername(
				env.getRequiredProperty("spring.datasource.username"));
		dataSource.setPassword(
				env.getRequiredProperty("spring.datasource.password"));
		return dataSource;
	}

	/**
	 * Instance method name:entityManagerFactory()
	 * 
	 * @return:EntityManager
	 * 
	 */

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory()
			throws NamingException {
		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
		factoryBean.setDataSource(dataSource());
		factoryBean.setPackagesToScan(
				new String[] { "org.ergossoft.datamodule.entity" });
		factoryBean.setJpaVendorAdapter(jpaVendorAdapter());
		factoryBean.setJpaProperties(jpaProperties());
		return factoryBean;
	}

	/**
	 * Provider specific adapter
	 */

	@Bean
	public JpaVendorAdapter jpaVendorAdapter() {
		HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
		return hibernateJpaVendorAdapter;
	}

	/**
	 * Here we provided provider specific properties.
	 **/

	private Properties jpaProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect", env.getRequiredProperty(
				"spring.jpa.properties.hibernate.dialect"));
		properties.put("hibernate.hbm2ddl.auto",
				env.getRequiredProperty("spring.jpa.hibernate.ddl-auto"));
		properties.put("hibernate.show_sql", env.getRequiredProperty(
				"spring.jpa.properties.hibernate.show_sql"));
		properties.put("hibernate.format_sql", env.getRequiredProperty(
				"spring.jpa.properties.hibernate.format_sql"));
		return properties;
	}

	/**
	 * method name:transactionManager()
	 * 
	 * @param: EntityManagerFactory
	 * @return:JpaTransactionManager
	 */

	@Bean
	@Autowired
	public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
		JpaTransactionManager txManager = new JpaTransactionManager();
		txManager.setEntityManagerFactory(emf);
		return txManager;
	}

}
