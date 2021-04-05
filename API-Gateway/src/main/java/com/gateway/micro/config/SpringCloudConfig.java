package com.gateway.micro.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/admin/**")
                        .uri("lb://ADMIN-SERVICE")
                        )//.id("admin-service"))
                .route(r -> r.path("/user/**")
                		.uri("lb://USER-SERVICE")
                		 )//.id("user-service"))
                .build();
    }

}