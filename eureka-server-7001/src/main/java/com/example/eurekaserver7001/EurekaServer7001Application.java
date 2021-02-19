package com.example.eurekaserver7001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author leejalen
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer7001Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServer7001Application.class, args);
	}

}
