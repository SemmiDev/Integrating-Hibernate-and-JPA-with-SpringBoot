package com.sam.demo;

import com.sam.demo.student.Student;
import com.sam.demo.student.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	StudentRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Student id 10001 -> {}", repository.findById(10001L));
		logger.info("Inserting -> {}", repository.save(new Student("Ayatullah","A1234567234")));
		logger.info("update E1234567 -> {}", repository.save(new Student(10001L,"sammi aldhi yanto","0018813695")));
		repository.deleteById(10001L);
		logger.info("All students -> {}", repository.findAll());
	}
}
