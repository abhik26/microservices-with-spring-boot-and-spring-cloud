package com.example.microservices.currencyconversionservice.entity;

public class CurrencyConversion {

	private Long id;
	private String fromCurrency;
	private String toCurrency;
	private Double quantity;
	private Double conversionMultiple;
	private Double totalConvertedValue;
	private String port;
	
	public CurrencyConversion() {
	}

	public CurrencyConversion(Long id, String fromCurrency, String toCurrency, Double quantity,
			Double conversionMultiple, Double totalConvertedValue, String port) {
		super();
		this.id = id;
		this.fromCurrency = fromCurrency;
		this.toCurrency = toCurrency;
		this.quantity = quantity;
		this.conversionMultiple = conversionMultiple;
		this.totalConvertedValue = totalConvertedValue;
		this.port = port;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFromCurrency() {
		return fromCurrency;
	}

	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}

	public String getToCurrency() {
		return toCurrency;
	}

	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(Double conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public Double getTotalConvertedValue() {
		return totalConvertedValue;
	}

	public void setTotalConvertedValue(Double totalConvertedValue) {
		this.totalConvertedValue = totalConvertedValue;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

}
