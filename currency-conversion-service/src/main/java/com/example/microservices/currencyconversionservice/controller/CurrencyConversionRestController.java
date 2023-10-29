package com.example.microservices.currencyconversionservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservices.currencyconversionservice.entity.CurrencyConversion;

@RestController
public class CurrencyConversionRestController {

	@GetMapping("/currency-converter/{fromCurrency}/{toCurrency}/{quantity}")
	public CurrencyConversion convertCurrency(@PathVariable String fromCurrency, @PathVariable String toCurrency,
			@PathVariable Double quantity) {
		
		return new CurrencyConversion(1L, fromCurrency, toCurrency, quantity, null, null);
	}
}
