package com.sample.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.tutorial.model.Employee;

@Repository
public interface EmployeeRepostories extends JpaRepository<Employee, Long> {

}
