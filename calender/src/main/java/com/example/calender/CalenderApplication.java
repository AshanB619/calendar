package com.example.calender;

import com.example.calender.model.Status;
import com.example.calender.model.content;
import com.example.calender.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

@SpringBootApplication
public class CalenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalenderApplication.class, args);

	}
	@Bean
	CommandLineRunner commandLineRunner(ContentRepository repository) {
		return args ->{
			content content=new content(null,"wimal","nice", Status.IDEA, LocalDateTime.now(),"");
			repository.save(content);

		};
	}

}
