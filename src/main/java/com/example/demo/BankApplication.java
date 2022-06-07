package com.example.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Employee;

@SpringBootApplication
@Controller
public class BankApplication {
	
	@GetMapping("/")
	public String home()
	{
		return "home";
	}

	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
		
		
	}

}
