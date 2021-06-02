package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;


@SpringBootApplication
public class SpringBootEmpApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringBootEmpApplication.class, args);

	}
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
         return application.sources(SpringBootEmpApplication.class);
    }

}
