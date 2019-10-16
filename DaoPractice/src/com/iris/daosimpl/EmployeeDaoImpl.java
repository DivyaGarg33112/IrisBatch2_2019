package com.iris.daosimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.iris.daos.EmployeeDao;
import com.iris.models.Employee;
import com.iris.utility.ConnectionProvider;

public class EmployeeDaoImpl implements EmployeeDao{

	Connection conn=ConnectionProvider.getConn();
	
	
	@Override
	public boolean addEmployee(Employee e) throws Exception{
		PreparedStatement ps=conn.prepareStatement("insert into EmployeeTab values(?,?,?,?,?)");
		ps.setInt(1,e.getEmployeeId());
		ps.setString(2,e.getEmployeeName());
		ps.setString(3,e.getGender());
		ps.setString(4,e.getPassword());
		ps.setDouble(5,e.getSalary());
		
		int i=ps.executeUpdate();
		if(i!=0){
			return true;
		}
		
		return false;
	}

	@Override
	public boolean deleteEmployee(int employeeId) throws Exception {
		PreparedStatement ps=conn.prepareStatement("delete from EmployeeTab Where EId=?");
		ps.setInt(1,employeeId);
		
		int i=ps.executeUpdate();
		if(i!=0){
			return true;
		}
		return false;
	}

	@Override
	public Employee getEmployeeById(int employeeId) throws Exception{
		PreparedStatement ps=conn.prepareStatement("select * from EmployeeTab where EId=?");
		ps.setInt(1, employeeId);
		
		ResultSet rs=ps.executeQuery();
		if(rs.next()){
			int id=rs.getInt(1);
			String name=rs.getString(2);
			String gen=rs.getString(3);
			String pass=rs.getString(4);
			double sal=rs.getDouble(5);
			
			Employee emp=new Employee();
			emp.setEmployeeId(id);
			emp.setEmployeeName(name);
			emp.setGender(gen);
			emp.setPassword(pass);
			emp.setSalary(sal);
			
			return emp;
		}
		
		return null;
	}

	@Override
	public boolean validateEmployee(int empId, String empPass) throws Exception{
		PreparedStatement ps=conn.prepareStatement("select * from EmployeeTab where EId=? and Password=?");
		ps.setInt(1, empId);
		ps.setString(2,empPass);
		
		ResultSet rs=ps.executeQuery();
		
		if(rs.next()){
			return true;
		}
		
		return false;
	}

	@Override
	public List<Employee> getAllEmployees() throws Exception{
		
		List<Employee> empList=new ArrayList<>();
		
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("select * from EmployeeTab");
		while(rs.next()){
			int id=rs.getInt(1);
			String name=rs.getString(2);
			String gen=rs.getString(3);
			String pass=rs.getString(4);
			double sal=rs.getDouble(5);
			
			Employee emp=new Employee();
			emp.setEmployeeId(id);
			emp.setEmployeeName(name);
			emp.setGender(gen);
			emp.setPassword(pass);
			emp.setSalary(sal);
			
			empList.add(emp);
			
		}
		return empList;
	}

}

















