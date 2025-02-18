package com.rays.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rays.dao.UserDAOHibImpl;
import com.rays.dao.UserDAOInt;
import com.rays.dao.UserDAOJDBCImpl;

@Configuration
public class DAOConfig {

	@Value(value = "JDBC")
	private String daoType;

	@Bean
	public UserDAOInt userDAO() {
		if ("JDBC".equalsIgnoreCase(daoType)) {
			return new UserDAOJDBCImpl();
		} else if ("Hibernate".equalsIgnoreCase(daoType)) {
			return new UserDAOHibImpl();
		} else {
			throw new IllegalArgumentException("Invalid dao.type value: " + daoType);
		}
	}
}