package com.mitocode.springboot;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootJarApplication implements CommandLineRunner{
	
	
	private static final Logger logger = LoggerFactory.getLogger(SpringbootJarApplication.class);

	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootJarApplication.class, args);
	}
	
	@Bean
	public void metodo1() {
		 logger.info("metodo1");
	}
	
	@Bean
	public void metodo2() {
		 logger.info("metodo2");
	}
	@Bean
	public Persona getPersona() {
		logger.info("getPersona");
		return new Persona();
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		logger.info("hello spring");
		
	}

}
