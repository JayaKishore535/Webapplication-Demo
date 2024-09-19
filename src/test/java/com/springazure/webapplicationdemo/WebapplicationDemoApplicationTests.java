package com.springazure.webapplicationdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
class WebapplicationDemoApplication {

    @GetMapping("/message") {
         public String message () {
			 return " Webapplication deployed into Azure using Springboot " ;
		}
	}
	void contextLoads() {
	}

}
