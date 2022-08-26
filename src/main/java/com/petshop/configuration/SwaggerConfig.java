package com.petshop.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@Configuration
public class SwaggerConfig {
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.petshop.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(metaInfo());
    }

    private ApiInfo metaInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "Systema para gerência de petshop",
                "API REST PARA GERÊNCIA PETSHOP",
                "1.0",
                "Terms of Service",
                new Contact("Rodrigo Gambarra da Silva", "",
                        "rodrigo@gambarra.com.br"),
                "Apache License Version 2.0",
                "https://www.apache.org/licesen.html", Collections.emptyList()
        );
        return apiInfo;
    }
}