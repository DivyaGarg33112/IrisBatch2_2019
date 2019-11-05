package com.examples.daos;

import java.util.List;

import com.examples.models.User;

public interface UserDao {
	public boolean registerUser(User userObj);
	public User validate(int userId,String password);
	public List<User> getAllCustomers();
}
