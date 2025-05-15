package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/azure")
public class AzureDeployApplication {

	@GetMapping("/start")
	public String demo() {
		return "App Deployed successfully to Azure";
	}

	public static void main(String[] args) {
		SpringApplication.run(AzureDeployApplication.class, args);
	}

}
