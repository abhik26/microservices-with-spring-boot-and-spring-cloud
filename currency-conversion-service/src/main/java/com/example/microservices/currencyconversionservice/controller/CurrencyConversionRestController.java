package com.example.microservices.currencyconversionservice.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.microservices.currencyconversionservice.entity.CurrencyConversion;

@RestController
public class CurrencyConversionRestController {

	@GetMapping("/currency-converter/{fromCurrency}/{toCurrency}/{quantity}")
	public CurrencyConversion convertCurrency(@PathVariable String fromCurrency, @PathVariable String toCurrency,
			@PathVariable Double quantity) {

		Map<String, String> pathVariableMap = new HashMap<String, String>();
		pathVariableMap.put("fromCurrency", fromCurrency);
		pathVariableMap.put("toCurrency", toCurrency);

		ResponseEntity<CurrencyConversion> responseEntity = new RestTemplate().getForEntity(
				"http://localhost:8000/currency-exchange/{fromCurrency}/{toCurrency}", CurrencyConversion.class,
				pathVariableMap);
		CurrencyConversion response = responseEntity.getBody();

		return new CurrencyConversion(1L, fromCurrency, toCurrency, quantity, response.getConversionMultiple(),
				(quantity * response.getConversionMultiple()), response.getPort());
	}
}
