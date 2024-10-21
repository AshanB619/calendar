package com.example.calender;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CalenderApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(CalenderApplication.class, args);

	}

}
