package com.customerservice;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springdoc.core.SwaggerUiConfigParameters;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


import java.util.ArrayList;
@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Customer Service Application",
				version ="2.0",
				description = "This is a Swagger Spec for the Rest APIs exposed in Customer Service Application.",
				contact =@Contact(name = "Abc.Inc",
						url = "https://www.Abc.com",
						email = "abc@gmail.com"
				)
		)
)
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	public GroupedOpenApi customApi()
	{
		return GroupedOpenApi.builder()
				.group("custom")
				.pathsToMatch("com/customerservice/controllers/**")
				.build();
	}

}
