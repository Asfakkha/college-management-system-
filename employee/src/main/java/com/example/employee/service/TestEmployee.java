package com.example.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.employee.entity.ConfigProperties;
import com.example.employee.entity.EmployeeRepository;

@Component
public class TestEmployee implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private ConfigProperties configProperties;

	@Scheduled(fixedDelay = 3000, initialDelay = 5000)
	@Override
	public void run(String... args) throws Exception {
		System.out.println(employeeRepository.findaAll());
		employeeRepository.findaAll();
		System.out.println("khan shab");
		// System.out.println(configProperties);

	}

}
