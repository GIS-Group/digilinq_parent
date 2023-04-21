package com.mfino.digilinq.eurekadiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: Devaraj Reddy,
 * Date : 2019-05-14
 */
@SpringBootApplication
@EnableEurekaServer
public class DigilinqEurekaDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigilinqEurekaDiscoveryServiceApplication.class, args);
	}

}
