package com.mfino.digilinq.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 * @author Krishna
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.mfino.digilinq"})
@EnableFeignClients(basePackages = {"com.mfino.digilinq"})
@EnableDiscoveryClient
public class DigilinqPaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigilinqPaymentServiceApplication.class, args);
	}

}

