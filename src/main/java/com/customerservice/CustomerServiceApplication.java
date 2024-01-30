package com.customerservice;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.servers.Servers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


import java.util.ArrayList;

@OpenAPIDefinition(
		info = @Info(
				title = "Customer Service Application",
				version ="2.0",
				description = "This is a Swagger Spec for the Rest APIs exposed in Customer Service Application.",
				contact =@Contact(name = "example.Inc",
						url = "https://www.example.com",
						email = "example@gmail.com"
				)
		),
		servers = @Server(
				url = "http://localhost:8080",
				description = "Customer Service Application url"
		)
)
@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

}
