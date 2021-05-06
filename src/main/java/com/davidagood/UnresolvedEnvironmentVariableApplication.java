package com.davidagood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(Config.class)
public class UnresolvedEnvironmentVariableApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnresolvedEnvironmentVariableApplication.class, args);
	}

}
