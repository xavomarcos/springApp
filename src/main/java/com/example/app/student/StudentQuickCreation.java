package com.example.app.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentQuickCreation {
	
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args -> {
			Student kevin = new Student(
					"Kevin",
					"kevin@gmail.com",  
					LocalDate.of(2006, Month.JANUARY, 10)
			);
			
			Student student2 = new Student( 
					"Student2",
					"student2@gmail.com",
					LocalDate.of(2010, Month.JANUARY, 10)
					
			);
			
			repository.saveAll(List.of(kevin, student2));
		};
		
	}
}
