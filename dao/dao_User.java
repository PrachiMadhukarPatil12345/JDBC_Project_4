package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.User.User;
import com.Utility.Userdbconnection;

public class dao_User
{
	static Userdbconnection ud = new Userdbconnection();

	
	
	public String daoDeleteUser(User user) throws SQLException, ClassNotFoundException
	{
		Connection con = ud.dbConnection();
		PreparedStatement pst = con.prepareStatement(" DELETE FROM USER WHERE Uernme =? ");
		pst.setString(1, user.getUsername() );
pst.executeUpdate();
		
		return "Record Deleteed";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public String UpdateUserdao(User user)             throws ClassNotFoundException, SQLException
	{
		Connection con = ud.dbConnection();
		PreparedStatement pst = con.prepareStatement("UPDATE USER SET Address =?, Email=? WHERE Password =? ");
		pst.setString(1, user.getAddress());
		pst.setString(2, user.getEmail() );
		pst.setString(3, user.getPassword() );
		
		int rs = pst.executeUpdate();
		
		return "Udated Successfuly";
		
	}
	
	
	
	
	
	
	
	
	
	public ArrayList<User>  getAllRecords()     throws ClassNotFoundException, SQLException
	{
		ArrayList<User> userlist = new ArrayList <User>();
		Connection con = ud.dbConnection();
		PreparedStatement pst = con.prepareStatement("SELECT * FROM USER");
		ResultSet rs = pst.executeQuery();
		
		while(rs.next())
		{
			String str = rs.getString ("Uernme");
			String sr = rs.getString ("Password");
			String strn = rs.getString ("Address");
			String email = rs.getString ("Email");
			long Mobno = rs.getLong ("Mob_No");
			int age = rs.getInt ("Age");
			
			User obj =new User(str, sr, strn, email, Mobno, age);
			userlist.add(obj);
			
		}
		return userlist;
	}
	
	
	
	
	
	
	
	
	public static String daoMethod(ArrayList<User> user)     throws ClassNotFoundException, SQLException
	{
		Connection con = ud.dbConnection();
		PreparedStatement pst = con.prepareStatement(" insert into user values(?,?,?,?,?,? )");
		
		for(User u :user)
		{
			pst.setString(1, u.getUsername());
			pst.setString(2, u.getPassword());
			pst.setString(3,u.getAddress() );
			pst.setString(4,u.getEmail() );
			pst.setInt(5,u.getAge() );
			pst.setLong(6, u.getMob_No() );
		    pst.addBatch();
		}
		
		int[] arr = pst.executeBatch();
		return  arr.length     +  "User Inserted successfully";
	}
	
	
	
	
	
	
	
	
	
	
//	public static String daoMethod(User user)            throws ClassNotFoundException, SQLException
//	{
//		Connection con = ud.dbConnection();
//		PreparedStatement st = con.prepareStatement("insert into User values( ?,?,?,?,?,?)" );
//		st.setString(1, user.getUsername());
//		st.setString(2, user.getPassword());
//		st.setString(3, user.getAddress());
//		st.setString(4, user.getEmail());
//		st.setLong(6,user.getMob_No());
//		st.setInt(5,user.getAge());
//		
//		
//		st.executeUpdate();
//		
//		 return " Records Insert";
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * public static void CreateTable() throws ClassNotFoundException, SQLException
	 * { 
	 * Connection con = ud.dbConnection(); 
	 * Statement st = con.createStatement();
	 * st.execute("CREATE TABLE USER (Uernme varchar(20) ,Password varchar(25) , Address varchar(20) ,Email varchar(20) , Age int, Mob_No long )"
	 * ); // System.out.println("Table created");
	 * 
	 * }
	 * 
	
	 * 
	 
	 
	 * 
	 * public static void main(String[] args) throws ClassNotFoundException,
	 * SQLException { dao_User du = new dao_User(); CreateTable();
	 * 
	 * }
	 */
}
