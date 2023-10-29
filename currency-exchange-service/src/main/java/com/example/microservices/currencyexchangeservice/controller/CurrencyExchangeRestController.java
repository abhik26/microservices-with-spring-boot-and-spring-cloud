package com.example.microservices.currencyexchangeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservices.currencyexchangeservice.controller.dto.ExchangeValue;

@RestController
public class CurrencyExchangeRestController {
	
	@Autowired
	private Environment environment;

	@GetMapping("/currency-exchange/{fromCurrency}/{toCurrency}")
	public ExchangeValue getExchangeValue(@PathVariable("fromCurrency") String fromCurrency, 
			@PathVariable("toCurrency") String toCurrency) {
		ExchangeValue value = new ExchangeValue();
		value.setFromCurrency(fromCurrency);
		value.setToCurrency(toCurrency);
		value.setPort(environment.getProperty("local.server.port"));
		
		return value;
	}
}
