package fr.erasmus.socialNetwork;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SocialNetworkApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SocialNetworkApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SocialNetworkApplication.class, args);
		LOGGER.info("Application started");
	}

}
