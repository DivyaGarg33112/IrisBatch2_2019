package com.iris.main;

import com.iris.daos.UserDao;
import com.iris.daosimpl.UserDaoImpl;
import com.iris.models.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	User uObj=new User();
    	uObj.setUserName("Divya");
    	uObj.setPassword("divya123");
    	
       UserDao userDao=new UserDaoImpl();
       userDao.saveUser(uObj);
    }
}
