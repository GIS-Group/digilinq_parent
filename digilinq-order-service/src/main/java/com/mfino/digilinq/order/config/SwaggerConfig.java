package com.mfino.digilinq.order.config;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.Contact;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * @author Krishna
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    
    @Autowired
    ApiInfo apiInfo;
    
    @Bean
    ApiInfo apiInfo() {
        return new ApiInfo(
                "Order Service REST Api's",
                "",
                "v1",
                "",
                new Contact("Krishna Reddy", "https://github.com/krishnacores", "krishna.n@gmail.com"),
                "License of API", "API license URL", Collections.emptyList());
    }
    
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                       .securitySchemes(Arrays.asList(apiKey()))
                       .securityContexts(Collections.singletonList(securityContext()))
                       .select()
                       .apis(RequestHandlerSelectors.basePackage("com.mfino.digilinq"))
                       .paths(PathSelectors.any())
                       .build()
                       .apiInfo(apiInfo);
    }
    
    private SecurityContext securityContext() {
        return SecurityContext.builder().securityReferences(defaultAuth()).forPaths(PathSelectors.regex("/.*")).build();
    }
    
    private List<SecurityReference> defaultAuth() {
        final AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
        final AuthorizationScope[] authorizationScopes = new AuthorizationScope[]{authorizationScope};
        return Collections.singletonList(new SecurityReference("Bearer", authorizationScopes));
    }
    
    private ApiKey apiKey() {
        return new ApiKey("Bearer", "Authorization", "header");
    }
    
}
