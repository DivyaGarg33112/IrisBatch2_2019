package com.iris.daos;

import java.util.List;

import com.iris.models.Employee;

public interface EmployeeDao {

	public boolean addEmployee(Employee e) throws Exception;
	public boolean deleteEmployee(int employeeId)throws Exception;
	public Employee getEmployeeById(int employeeId) throws Exception;
	public boolean validateEmployee(int empId,String empPass) throws Exception;
	public List<Employee> getAllEmployees() throws Exception;
}
