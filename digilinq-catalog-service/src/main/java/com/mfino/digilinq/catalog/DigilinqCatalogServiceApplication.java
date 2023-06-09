package com.mfino.digilinq.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import com.mfino.digilinq.commons.security.GlobalResourceServerConfig;

/**
 * @author: Srikanth
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.mfino.digilinq"}, excludeFilters = {
	    @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = GlobalResourceServerConfig.class)})
@EnableFeignClients
@EnableDiscoveryClient
@ComponentScan("com.mfino.digilinq")
@EntityScan("com.mfino.digilinq") 
public class DigilinqCatalogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigilinqCatalogServiceApplication.class, args);
	}

}
