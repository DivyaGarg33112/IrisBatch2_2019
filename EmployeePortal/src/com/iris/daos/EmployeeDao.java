package com.iris.daos;

import com.iris.models.Employee;

public interface EmployeeDao {
	public boolean registerEmployee(Employee emp);
	public Employee validateEmployee(int employeeId,String password);
}
