package com.gateway.apigatewayservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@EnableHystrix
@Configuration
public class GatewayConfig {

    @Autowired
    AuthenticationFilter filter;
    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes()

                .route(p -> p
                        .path("/analyze")
                        .filters(f -> f.filter(filter))
                        .uri("http://localhost:8003")
                )
                .route(p -> p
                        .path("/user/**")
                        .uri("http://localhost:8080"))

                .build();

    }
}