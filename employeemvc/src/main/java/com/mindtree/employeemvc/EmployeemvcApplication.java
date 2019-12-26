package com.mindtree.employeemvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.mindtree"})
@EnableJpaRepositories("com.mindtree.employeemvc.repository")
public class EmployeemvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeemvcApplication.class, args);
	}

}
