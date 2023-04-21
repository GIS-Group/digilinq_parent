package com.mfino.digilinq.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 * @author Krishna
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.mfino.digilinq"})
//, excludeFilters={
//		@ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE, value=GlobalSecurityConfig.class)})
@EnableFeignClients(basePackages = {"com.mfino.digilinq"})
@EnableEurekaClient
public class DigilinqOrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DigilinqOrderServiceApplication.class, args);
    }

}
