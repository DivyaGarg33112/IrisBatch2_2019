package com.iris.models;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User_7Nov")
public class User {
	
	/*@Id says the column creating for UserID will be primary key
	 * column and @GeneratedValue its value will be generated auto
	 * matically..*/
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	
	
	private String userName;
	
	@Column(name="UserPass")
	private String password;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
