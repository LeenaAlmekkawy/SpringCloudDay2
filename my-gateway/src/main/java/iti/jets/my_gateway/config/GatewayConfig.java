package iti.jets.my_gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// @Configuration
public class GatewayConfig {
    
    @Bean
    public RouteLocator myRouteLocator(RouteLocatorBuilder builder){
        return builder.routes()
        .route("user-app", r->r.path("/users/**").uri("lb://user-app"))
        .route("order-app", r->r.path("/orders/**").uri("lb://order-app"))
        .route("product-app", r->r.path("/products/**").uri("lb://product-app"))
        .build();
        
    }
}
