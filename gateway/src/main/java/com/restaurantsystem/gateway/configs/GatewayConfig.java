package com.restaurantsystem.gateway.configs;


import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/users/**")
                        .uri("http://localhost:8079/"))
                        //.id("employeeModule"))

                .route(r -> r.path("/orders/**")
                        .uri("http://localhost:8101/"))
                        //.id("consumerModule"))
                .route(r -> r.path("/payments/**")
                        .uri("http://localhost:8080/"))
                .route(r -> r.path("/products/**")
                        .uri("http://localhost:8082/"))

                .build();
    }

}

