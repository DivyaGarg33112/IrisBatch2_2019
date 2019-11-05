package com.examples.daosimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.examples.daos.UserDao;
import com.examples.models.User;
import com.examples.utility.ConnectionProvider;

public class UserDaoImpl implements UserDao {

	@Override
	public boolean registerUser(User userObj) {
		try {
		Connection conn=ConnectionProvider.getConn();
		PreparedStatement ps=conn.prepareStatement("insert into Iristab values(useridseq.nextval,?,?,?,?,?,?)");
		ps.setString(1,userObj.getPassword());
		ps.setString(2,userObj.getFirstname());
		ps.setString(3,userObj.getLastname());
		ps.setString(4,userObj.getGender());
		ps.setString(5,userObj.getCity());
		ps.setString(6,userObj.getRole());
		
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
	public User validate(int userId, String password) {
		try {
			Connection conn=ConnectionProvider.getConn();
			PreparedStatement ps=conn.prepareStatement("select * from IrisTab where UserID=? and Password=?");
			ps.setInt(1,userId);
			ps.setString(2,password);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				User obj=new User();
				obj.setFirstname(rs.getString("firstname"));
				obj.setLastname(rs.getString("lastname"));
				obj.setGender(rs.getString("gender"));
				obj.setCity(rs.getString("city"));
				obj.setPassword(rs.getString("password"));
				obj.setRole(rs.getString("role"));
				
				return obj;
			}
			
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return null;
	}

	@Override
	public List<User> getAllCustomers() {
		List<User> list=new ArrayList<>();
		try {
			Connection conn=ConnectionProvider.getConn();
			PreparedStatement ps=conn.prepareStatement("select * from IrisTab where role=?");
			ps.setString(1,"Customer");
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				User obj=new User();
				obj.setFirstname(rs.getString("firstname"));
				obj.setLastname(rs.getString("lastname"));
				obj.setGender(rs.getString("gender"));
				obj.setCity(rs.getString("city"));
				obj.setPassword(rs.getString("password"));
				obj.setRole(rs.getString("role"));
				list.add(obj);
				
			}
			
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return list;

		
	}

}
