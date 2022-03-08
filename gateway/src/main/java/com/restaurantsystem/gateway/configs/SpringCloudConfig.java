package com.restaurantsystem.gateway.configs;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {
    
    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
            .route(r -> r.path("/products/**")
                .uri("http://localhost:8082")
                //.id("productsModule")
                )

            .route(r -> r.path("/payments/**")
                .uri("http://localhost:8080")
                //.id("paymentsModule")
                )
            
            .route(r -> r.path("/orders/**")
                .uri("http://localhost:8101")
                //.id("ordersModule")
                )
            
            .route(r -> r.path("/users/**")
                .uri("http://localhost:8079")
                //.id("usersModule")
                )
            .build();
    }
}
