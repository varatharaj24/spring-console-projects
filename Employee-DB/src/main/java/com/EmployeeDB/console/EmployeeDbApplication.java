package com.EmployeeDB.console;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeDbApplication implements CommandLineRunner {

	@Autowired
	EmployeeRepo emprepo;
	
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(emprepo.findAll());
		
	}

	

}
