package com.nagarro.DockerProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerProjectApplication {
	
	@GetMapping("/test")
    public String getTest() { 
		return "Successfully deployed to Kubernetes";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerProjectApplication.class, args);
	}

}
