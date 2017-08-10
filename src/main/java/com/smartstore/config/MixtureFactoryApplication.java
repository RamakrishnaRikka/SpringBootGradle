package com.smartstore.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Ram
 *
 */
@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories("com.smartstore.repository")
@EnableCaching
@EntityScan("com.smartstore.entity")
@ComponentScan(basePackages = "com.smartstore")
public class MixtureFactoryApplication {
	public static void main(String[] args) {
		SpringApplication.run(MixtureFactoryApplication.class, args);
	}
}
