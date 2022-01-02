package com.marticus.springmvc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marticus.springmvc.entity.EmployeeEntity;



@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {
	EmployeeEntity findEmployeesById(int id);

	List<EmployeeEntity> findEmployeesByEmpNameContaining(String search);

}
