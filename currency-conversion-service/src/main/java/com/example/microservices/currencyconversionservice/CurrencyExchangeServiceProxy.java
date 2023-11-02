package com.example.microservices.currencyconversionservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.microservices.currencyconversionservice.entity.CurrencyConversion;

@FeignClient(name = "currency-exchange-service", url = "localhost:8000")
public interface CurrencyExchangeServiceProxy {

	@GetMapping("/currency-exchange/{fromCurrency}/{toCurrency}")
	public CurrencyConversion retreiveExchangeValue(@PathVariable("fromCurrency") String fromCurrency,
			@PathVariable("toCurrency") String toCurrency);
}
