package com.webapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
public class SpringBootCrudApplication implements CommandLineRunner{
	
	private static Logger log = LoggerFactory.getLogger(SpringBootCrudApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudApplication.class, args);

		log.info("-- APPLICATION RUNNING START !!! --");
	}

	@Override
	public void run(String... args) throws Exception {


	}

}
