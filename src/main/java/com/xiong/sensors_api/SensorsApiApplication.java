package com.xiong.sensors_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableSwagger2
@SpringBootApplication
@CrossOrigin
public class SensorsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SensorsApiApplication.class, args);
	}

}
