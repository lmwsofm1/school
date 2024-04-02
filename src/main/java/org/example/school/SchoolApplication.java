package org.example.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolApplication.class, args);
	}

	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}

	@GetMapping("/home")
	public String homePage() {
		return "home";
	}

}
