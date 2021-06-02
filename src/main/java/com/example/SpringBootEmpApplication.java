package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;
import com.example.beans.Employee;

@SpringBootApplication
public class SpringBootEmpApplication extends SpringBootServletInitialize{

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringBootEmpApplication.class, args);
//		Employee e=context.getBean(Employee.class);
//		e.setName("abc");
//		System.out.println(e);
	}
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
         return application.sources(SpringBootEmpApplication.class);
    }

}
