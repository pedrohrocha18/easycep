package com.easycep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class EasycepApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasycepApplication.class, args);
	}

}
