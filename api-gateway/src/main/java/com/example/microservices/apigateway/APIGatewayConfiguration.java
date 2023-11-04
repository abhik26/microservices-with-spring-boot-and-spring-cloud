package com.example.microservices.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class APIGatewayConfiguration {

	@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder routeLocatorBuilder) {
		return  routeLocatorBuilder.routes()
				.route(r -> r.path("/currency-exchange/**").uri("lb://currency-exchange-service"))
				.route(r -> r.path("/currency-converter/**").uri("lb://currency-conversion-service"))
				.route(r -> r.path("/currency-converter-feign/**").uri("lb://currency-conversion-service"))
				.route(r -> r.path("/currency-conversion/**")
						.filters(f -> f.rewritePath("/currency-conversion/(?<segment>.*)", "/currency-converter/${segment}"))
						.uri("lb://currency-conversion-service"))
					.build();
	}
}
