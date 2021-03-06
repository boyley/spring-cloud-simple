package com.example.didispace;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ApplicationConfig {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ApplicationConfig.class).web(true).run(args);
	}

}
