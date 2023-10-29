package com.example.microservices.currencyconversionservice.entity;

public class CurrencyConversion {

	private Long id;
	private String fromCurrency;
	private String toCurrency;
	private Double quantity;
	private Double conversionMultiplier;
	private Double totalConvertedValue;
	
	public CurrencyConversion(Long id, String fromCurrency, String toCurrency, Double quantity,
			Double conversionMultiplier, Double totalConvertedValue) {
		super();
		this.id = id;
		this.fromCurrency = fromCurrency;
		this.toCurrency = toCurrency;
		this.quantity = quantity;
		this.conversionMultiplier = conversionMultiplier;
		this.totalConvertedValue = totalConvertedValue;
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

	public Double getConversionMultiplier() {
		return conversionMultiplier;
	}

	public void setConversionMultiplier(Double conversionMultiplier) {
		this.conversionMultiplier = conversionMultiplier;
	}

	public Double getTotalConvertedValue() {
		return totalConvertedValue;
	}

	public void setTotalConvertedValue(Double totalConvertedValue) {
		this.totalConvertedValue = totalConvertedValue;
	}

}
