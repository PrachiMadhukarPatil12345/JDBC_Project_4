package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.User.User;
import com.dao.dao_User;

public class User_Service
{
	static dao_User du = new dao_User();
	
	
	public String ServiceDeleteUser(User user) throws ClassNotFoundException, SQLException
	{
		return du.daoDeleteUser(user);
	}
	
	
	public String SrviceUpdate(User user)             throws ClassNotFoundException, SQLException
	{
		return du.UpdateUserdao(user);         
		
	}
	
	
	
	public ArrayList<User>  getAllRecords_Service()     throws ClassNotFoundException, SQLException
	{
		return  du.getAllRecords() ;
		
	}
	
	
	
	
	
	public static String ServiceMethod(ArrayList<User> user)  throws ClassNotFoundException, SQLException
	{
		return du.daoMethod(user);	
	}
	
	
	
//	
//	public  String ServiceMethod(User user)       throws ClassNotFoundException, SQLException
//	{
//		String str = dao_User.daoMethod(user);
//		return str;
//		
//	}
}
