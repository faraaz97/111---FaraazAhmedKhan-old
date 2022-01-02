package com.marticus.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marticus.springmvc.entity.EmployeeEntity;
import com.marticus.springmvc.entity.UserEntity;
import com.marticus.springmvc.repository.EmployeeRepository;
import com.marticus.springmvc.repository.UserRepository;

@Service
public class EmployeeService {
	
	@Autowired
	UserRepository userRepository;
	@Autowired
	EmployeeRepository employeeRepository;
	
	public String createUser(UserEntity userEntity) {

		String response = " user created successfully";
		UserEntity result = userRepository.save(userEntity);
		if (result == null) {
			response = "User cannot be created ";
			return response;
		}
		return response;

	}
	public String update(UserEntity userEntity) {

		String response = "User updated Successfully";
		UserEntity user = userRepository.findUsersById(userEntity.getId());
		if (user != null) {
			userRepository.save(userEntity);
			return response;
		}
		response = "No user found";
		return response;
	}
	public String deleteUser(int id) {

		String response = "User deleted Successfully";
		UserEntity user = userRepository.findUsersById(id);
		if (user != null) {
			userRepository.deleteById(user.getId());
			return response;
		}
		response = "User Not Found";
		return response;
	}
	public String findAll() {

		String temp;
		String response = "";
		List<UserEntity> users = userRepository.findAll();
		if (users.size() > 0) {
			for (UserEntity user : users) {
				temp = "\n Id : " + user.getId() + "\n Name : " + user.getUserName() + "\n";
				response = response + temp;
			}
			return response;
		}
		response = "There are no users";
		return response;

	}
	public String findUsersById(int id) {

		String response;
		UserEntity user = userRepository.findUsersById(id);
		if (user != null) {
			response = " Id : " + user.getId() + "\n Name : " + user.getUserName();
			return response;
		}
		response = "User Not Found";
		return response;
	}
	public String findUsersByUserName(String userName) {
		String response;
		UserEntity user = userRepository.findUsersByUserName(userName);
		if (user != null) {
			response = " Id : " + user.getId() + "\n Name : " + user.getUserName();
			return response;
		}
		response = "User Not Found";
		return response;
	}
	public boolean authenticateUser(UserEntity user) {
		UserEntity userEntity = userRepository.findUsersByUserNameAndPassword(user.getUserName(), user.getPassword());
		if (userEntity != null) {
			return true;
		}
		return false;

	}
	public List<EmployeeEntity> getAllEmployeeList() {
		List<EmployeeEntity> employees = employeeRepository.findAll();
		return employees;

	}
	public void saveEmpInDB(EmployeeEntity employeeEntity) {
		employeeRepository.save(employeeEntity);

	}
	public EmployeeEntity findEmployeesById(int id) {
		return employeeRepository.findEmployeesById(id);
	}
	public void deleteEmp(int id) {
		EmployeeEntity employeeEntity = employeeRepository.findEmployeesById(id);
		if (employeeEntity != null) {

			employeeRepository.delete(employeeEntity);
		}
	}
	public List<EmployeeEntity> search(String search) {
		return employeeRepository.findEmployeesByEmpNameContaining(search);

	}
	public void update(EmployeeEntity employeeEntity) {
		EmployeeEntity emp = employeeRepository.findEmployeesById(employeeEntity.getId());
		if(emp!=null)
		{
			emp.setId(employeeEntity.getId());
			emp.setEmpName(employeeEntity.getEmpName());
			emp.setAge(employeeEntity.getAge());
			emp.setSalary(employeeEntity.getSalary());
			emp.setDepartment(employeeEntity.getDepartment());
			emp.setAadharNumber(employeeEntity.getAadharNumber());
			employeeRepository.save(emp);
		}
	}


}
