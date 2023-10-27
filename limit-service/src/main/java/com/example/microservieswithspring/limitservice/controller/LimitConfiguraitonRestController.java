package com.example.microservieswithspring.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservieswithspring.limitservice.component.LimitConfiguration;
import com.example.microservieswithspring.limitservice.dto.LimitConfigurationDTO;

@RestController
public class LimitConfiguraitonRestController {
	
	private LimitConfiguration limitConfiguration;
	
	@Autowired
	public LimitConfiguraitonRestController(LimitConfiguration limitConfiguration) {
		this.limitConfiguration = limitConfiguration;
	}

	@GetMapping("/limits")
	public LimitConfigurationDTO getLimitConfiguration() {
		return new LimitConfigurationDTO(limitConfiguration.getMin(), limitConfiguration.getMax());
	}
}
