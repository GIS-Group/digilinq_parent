package com.mfino.digilinq.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: Srikanth
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("com.mfino.digilinq")
public class DigilinqCatalogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigilinqCatalogServiceApplication.class, args);
	}

}
