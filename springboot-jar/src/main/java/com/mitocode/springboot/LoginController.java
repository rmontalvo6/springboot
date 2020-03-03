package com.mitocode.springboot;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(SpringbootJarApplication.class);
	@PostConstruct
	public void init() {
		logger.info("Entro a login..");
	}
}
