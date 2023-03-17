package com.vit;

import com.vit.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * Student student1 = new Student("Vit", "Rod", "vit@gmail.com");
		 * studentRepository.save(student1);
		 * 
		 * Student student2 = new Student("Will", "Smith", "smith@gmail.com");
		 * studentRepository.save(student2);
		 * 
		 * Student student3 = new Student("Tony", "Stark", "tony@gmail.com");
		 * studentRepository.save(student3);
		 */
		
	}

}
