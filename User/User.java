package com.User;

public class User
{
	String Username;
	String Password;
	String Address;
	String Email;
	long Mob_No;
	int Age;
	
	public User(String username, String password, String address, String email, long mob_No, int age) {
		super();
		Username = username;
		Password = password;
		Address = address;
		Email = email;
		Mob_No = mob_No;
		Age = age;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public long getMob_No() {
		return Mob_No;
	}

	public void setMob_No(long mob_No) {
		Mob_No = mob_No;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}
	
	
	
}
