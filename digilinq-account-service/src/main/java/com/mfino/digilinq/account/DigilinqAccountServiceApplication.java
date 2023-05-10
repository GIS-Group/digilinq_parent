package com.mfino.digilinq.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.mfino.digilinq.commons.security.GlobalResourceServerConfig;



/**
 * @author: Srikanth
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.mfino.digilinq",
		"com.mfino.digilinq.account",
		"com.mfino.digilinq.account.mapper",
		"com.mfino.digilinq.account.service",
		"com.mfino.digilinq.account.service.impl"
		}, excludeFilters = {
    @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = GlobalResourceServerConfig.class)})
@EnableFeignClients
@EnableDiscoveryClient
@EnableJpaRepositories
//@EntityScan("com.mfino.digilinq.account")
public class DigilinqAccountServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(DigilinqAccountServiceApplication.class, args);
  }

}
