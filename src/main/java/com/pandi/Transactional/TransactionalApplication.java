package com.pandi.Transactional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@SpringBootApplication
@EnableTransactionManagement
@EnableAspectJAutoProxy

public class TransactionalApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionalApplication.class, args);
	}



//	@Bean
//	public DataSource getDatasource(){
//
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		Properties properties = new Properties();
//		properties.setProperty("hibernate.hbm2ddl.auto", "create-drop");
//		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
//		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//		dataSource.setUsername("root");
//		dataSource.setPassword("pandi123");
//
//		dataSource.setConnectionProperties(properties);
//		dataSource.setUrl("jdbc:mysql://localhost:3306/demo");
//
//		 return dataSource;
//	}

}
