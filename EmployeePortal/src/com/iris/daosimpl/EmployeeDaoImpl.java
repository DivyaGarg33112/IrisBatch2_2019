package com.iris.daosimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.iris.daos.EmployeeDao;
import com.iris.models.Employee;
import com.iris.utility.ConnectionProvider;

public class EmployeeDaoImpl implements EmployeeDao {
	
	Connection conn=ConnectionProvider.getConn();
	
	@Override
	public boolean registerEmployee(Employee emp) {
		try {
		PreparedStatement ps=conn.prepareStatement("insert into EmployeeTab values(employeetabseq.nextval,?,?,?,?,?)");
		
		ps.setString(1,emp.getEmployeeName());
		ps.setString(2, emp.getGender());
		ps.setString(3,emp.getCity());
		ps.setString(4,emp.getEmail());
		ps.setString(5,emp.getPassword());
		
		int i=ps.executeUpdate();
		if(i!=0){
			return true;
		}
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Employee validateEmployee(int employeeId, String password) {
		try {
		PreparedStatement ps=conn.prepareStatement("select * from EmployeeTab where eId=? and password=?");
		ps.setInt(1, employeeId);
		ps.setString(2, password);
		
		ResultSet rs=ps.executeQuery();
		if(rs.next()){
			int Id=rs.getInt(1);
			String s2=rs.getString(2);
			String s3=rs.getString(3);
			String s4=rs.getString(4);
			String s5=rs.getString(5);
			String s6=rs.getString(6);
			
			Employee emp=new Employee(Id,s2,s3,s4,s5,s6);
			return emp;
			
		}
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

}












