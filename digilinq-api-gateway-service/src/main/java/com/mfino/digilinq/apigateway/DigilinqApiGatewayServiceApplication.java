package com.mfino.digilinq.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


/**
 * @author: Srikanth
 */
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class DigilinqApiGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigilinqApiGatewayServiceApplication.class, args);
	}

}
