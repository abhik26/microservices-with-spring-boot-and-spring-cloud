package com.example.microservices.currencyexchangeservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;

@RestController
public class CircuitBreakerController {
	
	Logger log = LoggerFactory.getLogger(CircuitBreakerController.class);
	
	@GetMapping("/sample-api")
//	@Retry(name = "sample-api", fallbackMethod = "fallbackMethod")
//	@CircuitBreaker(name = "sample-api", fallbackMethod = "fallbackMethod")
//	@RateLimiter(name="sample-api", fallbackMethod = "rateLimiterFallbackMethod")
	@Bulkhead(name = "sample-api", fallbackMethod = "bulkheadFallbackMethod")
	public String sampleApi() {
		log.info("sample-api request received");
//		return new RestTemplate().getForEntity("http://localhost:8080/some-dummy-api", String.class).getBody();
		return "sample response";
	}
	
	// fallback method always need to have a parameter of type 'java.lang.Throwable'
	public String fallbackMethod(Exception exception) {
		return "hardcoded fallback response";
	}
	
	public String rateLimiterFallbackMethod(Exception e) {
		return "rate-limiter hardcoded response";
	}
	
	public String bulkheadFallbackMethod(Exception e) {
		return "bulkhead hardcoded response";
	}
}
