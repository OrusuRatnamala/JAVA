package com.infinite.H2DataBaseExample.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infinite.H2DataBaseExample.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
