package com.mfino.digilinq.apigateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import com.mfino.digilinq.apigateway.filters.CorsResponseFilter;
import com.mfino.digilinq.apigateway.filters.PostFilter;
import com.mfino.digilinq.apigateway.filters.PreFilter;
import com.mfino.digilinq.apigateway.filters.RouteFilter;

import brave.sampler.Sampler;


/**
 * @author: Srikanth
 */
@Configuration
public class ApiGatewayConfig {

    @Bean
    public Sampler sampler() {
        return Sampler.ALWAYS_SAMPLE;
    }

    @Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }

    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }

    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }

    //@Bean
   // public CorsResponseFilter corsFilter() {
  //      return new CorsResponseFilter();
  //  }
    @Bean
    public CorsFilter corsFilter() {
        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        final CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("*");
        config.addAllowedHeader("*");
        config.addAllowedMethod("OPTIONS");
        config.addAllowedMethod("HEAD");
        config.addAllowedMethod("GET");
        config.addAllowedMethod("PUT");
        config.addAllowedMethod("POST");
        config.addAllowedMethod("DELETE");
        config.addAllowedMethod("PATCH");
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
    
	/*
	 * @Bean public OptionsFilter optionsFilter() { return new OptionsFilter(); }
	 */

    
}
