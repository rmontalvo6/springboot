package com.mitocode.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class FabricaBeans {
	
	private static final Logger logger = LoggerFactory.getLogger(SpringbootJarApplication.class);

	
	@Bean
	public Persona obtenerPersona() {
		logger.info("Creando Persona");
		return new Persona();
	}
	
}
