package com.portal.daos;

import com.portal.models.User;

public interface UserDao {
	public boolean registerUser(User userObj);
	public User validateUser(int Id,String password);
}
