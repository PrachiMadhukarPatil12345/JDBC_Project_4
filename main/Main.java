package com.main;

import java.sql.SQLException;
import java.util.ArrayList;

import com.Controller.UserController;
import com.User.User;

public class Main 
{

	public static void main(String[] args)           throws ClassNotFoundException, SQLException
	{
		
		UserController cm = new UserController ();
		User u1 = new User("Radhai", "new123","Calcutta", "Vmp@gmail.com", 860053130, 58);
		
		
		String msg = cm.ControllerDeleteUser(u1);
		
		System.out.println(msg);
		
		
//		
//		String msg = cm.UpdateController(u1);
//		System.out.println(msg);
		
		
		
//		
//		ArrayList<User> allRecords = cm.getAllRecords_Controller();
//	for(User u: allRecords )
//	{
//		System.out.println(u.getUsername()); 
//		System.out.println (u.getPassword() );
//		System.out.println (u.getAddress()) ;
//		System.out.println (u.getEmail() ) ;
//		System.out.println (u.getMob_No() ) ;
//		System.out.println (u.getAge() ) ;
//		
//		System.out.println("===============================================");
//	}
				
		
		
		
		// ArrayList <User>al = new ArrayList<>();
//		User u1 = new User("Radhai", "root123","Sangli", "Arew@gmail.com", 860053130, 15);
//		al.add(u1);
//		User u2 = new User("Krishna", "root567","Mumbai", "Poiuh@gmail.com", 980053130, 19);
//		al.add(u2);
//		User u3 = new User("Swara", "new123","Murund", "Hyu@gmail.com", 4453130, 10);
//		al.add(u3);
//		User u4 = new User("Smitaa", "smn12345","Kolhapur", "Ktew@gmail.com", 780053130, 24);
//		al.add(u4);
//		
//		String msg =  cm.ControllerMethod(al);
//		System.out.println(msg);
		 
		//cm.ControllereMethod(u);

	}

}
