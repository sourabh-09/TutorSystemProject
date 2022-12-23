package com.cjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.cjc.ParentProxy")
public class TutorMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorMicroserviceApplication.class, args);
	}

}
