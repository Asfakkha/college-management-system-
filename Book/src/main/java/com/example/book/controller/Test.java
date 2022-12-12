package com.example.book.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.book.entity.AddressEntity;
import com.example.book.entity.StudentEntity;
import com.example.book.repostory.AddressRepostory;
import com.example.book.repostory.StudentRepostory;

@Component
public class Test implements CommandLineRunner {

	@Autowired
	StudentRepostory studentRepostory;

	@Autowired
	AddressRepostory addressRepostory;

	@Override
	public void run(String... args) throws Exception {
		StudentEntity student = new StudentEntity();
		student.setName("asfak");
		student.setAge(21);
		student.setAdmissionDate(new Date());
		student.setClassName(12l);
		student.setEnrollmentNumber(201223l);
		student.setFatherName("jiya khan");
		student.setMobileNumber(7737129936l);

		AddressEntity address = new AddressEntity();
		address.setColony("jhotwara");
		address.setDistric("jaipur");
		address.setPinCode(203012l);
		address.setState("rajasthan");
		student.setAddressEntity(address);
		address.setStudentEntity(student);
		studentRepostory.save(student);
		List<StudentEntity> students = studentRepostory.findAll();
		System.out.println(students);
	}
}
