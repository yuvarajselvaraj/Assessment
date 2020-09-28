package com.cresco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@EnableTransactionManagement
public class AssesmentApplication extends SpringBootServletInitializer {
@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AssesmentApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(AssesmentApplication.class, args);
	}
	 
}
