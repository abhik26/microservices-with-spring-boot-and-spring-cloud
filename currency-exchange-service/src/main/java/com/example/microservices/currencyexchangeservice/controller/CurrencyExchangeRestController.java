package com.example.microservices.currencyexchangeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservices.currencyexchangeservice.entity.ExchangeValue;
import com.example.microservices.currencyexchangeservice.repository.ExchangeValueRepository;

@RestController
public class CurrencyExchangeRestController {
	
	private final Environment environment;
	private final ExchangeValueRepository exchangeValueRepository;
	
	@Autowired
	public CurrencyExchangeRestController(Environment environment, ExchangeValueRepository exchangeValueRepository) {
		this.environment = environment;
		this.exchangeValueRepository = exchangeValueRepository;
	}

	@GetMapping("/currency-exchange/{fromCurrency}/{toCurrency}")
	public ExchangeValue getExchangeValue(@PathVariable("fromCurrency") String fromCurrency, 
			@PathVariable("toCurrency") String toCurrency) {
		ExchangeValue value = exchangeValueRepository.findByFromCurrencyAndToCurrency(fromCurrency, toCurrency);
		value.setFromCurrency(fromCurrency);
		value.setToCurrency(toCurrency);
		value.setPort(environment.getProperty("local.server.port"));
		
		return value;
	}
}
