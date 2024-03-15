package com.EmployeeDB.console;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<EmployeeModel, Integer> {

}
