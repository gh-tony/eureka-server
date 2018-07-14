package com.jsc.eureka_server_jsc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerJscApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerJscApplication.class, args);
	}
}
