package com.app.mfi.master.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableEurekaClient
@EntityScan
@EnableJpaRepositories
@SpringBootApplication
public class MicrofinanceMasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrofinanceMasterApplication.class, args);
	}

}
