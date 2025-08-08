package com.repository;

import com.springbootbeanfiles.Employeepojo13;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository13 extends JpaRepository<Employeepojo13, Integer> {
}
