package com.iris.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	
	private static Connection conn;
	static {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","iris2","iris2");
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public static Connection getConn(){
		return conn;
	}
}
