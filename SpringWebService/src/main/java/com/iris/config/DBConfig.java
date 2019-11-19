package com.iris.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@Component
@EnableTransactionManagement
@ComponentScan(basePackages={"com.iris"})
public class DBConfig {
	
	@Bean(name="dataSource")
	public DataSource getDataSource(){
		System.out.println("Hello 1");
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("iris2");
		dataSource.setPassword("iris2");
		System.out.println("Hello 2");
		return dataSource;
	}
	
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory(){
		System.out.println("Hello 3");
		Properties properties=new Properties();
		properties.setProperty("hibernate.dialect","org.hibernate.dialect.Oracle10gDialect");
		properties.setProperty("hibernate.hbm2ddl.auto","update");
		properties.setProperty("hibernate.show_sql","true");
		
		LocalSessionFactoryBuilder builder=new LocalSessionFactoryBuilder(getDataSource());
		builder.addProperties(properties);
		builder.scanPackages("com.iris.models");
		
		SessionFactory factory=builder.buildSessionFactory();
		System.out.println("Hello 4");
		return factory;
	}

	@Bean(name="hibernateTransactionManager")
	@Autowired
	public HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory){
		System.out.println("Hello 5");
		HibernateTransactionManager txManager=new HibernateTransactionManager(sessionFactory);
		System.out.println("Hello 6");
		return txManager;
	}

}
