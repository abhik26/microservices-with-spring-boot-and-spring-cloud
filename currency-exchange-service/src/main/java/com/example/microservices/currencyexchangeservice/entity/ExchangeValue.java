package com.example.microservices.currencyexchangeservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "exchange_value",
	uniqueConstraints = {
			@UniqueConstraint(columnNames = {"from_currency", "to_currency"})
	}
)
public class ExchangeValue {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "from_currency")
	private String fromCurrency;
	
	@Column(name = "to_currency")
	private String toCurrency;
	
	@Column(name = "conversion_multiple")
	private Double conversionMultiple;
	
	@Column(name = "port")
	private String port;
	
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
	public Double getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(Double conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	
}
