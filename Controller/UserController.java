package com.Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import com.User.User;
import com.service.User_Service;


@SuppressWarnings("static-access")
public class UserController
{
	 static User_Service us = new  User_Service();
	 
	 
	 public String ControllerDeleteUser(User user) throws ClassNotFoundException, SQLException
	 {
		return us.ServiceDeleteUser(user);
	 }
	 
	 
	 
	 public String UpdateController(User user)    throws ClassNotFoundException, SQLException
	 {
		return us.SrviceUpdate(user);
	 }
	 
	 
	 
	 
	 
	 public ArrayList<User>  getAllRecords_Controller()      throws ClassNotFoundException, SQLException
		{
			return  us.getAllRecords_Service();
		} 
	 
	 
	 
	 
	 
	 public static String ControllerMethod(ArrayList<User> user) throws ClassNotFoundException, SQLException
	 {
		 return us.ServiceMethod(user);
	 }
	 
	 
	 
	 
	 
//	public  String ControllereMethod(User user)     throws ClassNotFoundException, SQLException
//	{
//		return us.ServiceMethod(user);
//	}
	 
	 
}
