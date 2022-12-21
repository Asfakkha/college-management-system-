package com.example.employee.entity;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

	@Autowired
	private EntityManager entityManager;

	public List<EmployeeEntity> findaAll() {
		List<EmployeeEntity> employees = entityManager
				.createQuery("select u from EmployeeEntity u ", EmployeeEntity.class).getResultList();

		return employees;
	}

}
