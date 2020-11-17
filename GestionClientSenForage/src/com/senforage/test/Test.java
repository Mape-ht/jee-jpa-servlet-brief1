package com.senforage.test;

import com.senforageUser.dao.IUser;
import com.senforageUser.dao.UserImpl;
import com.senforageUser.entities.User;

public class Test 
{

	public static void main(String[] args) 
	{
	
		IUser userdao = new UserImpl();

		User u = new User();
		
		u.setNom("Sagna");
		u.setPrenom("Judith");
		u.setEmail("sagna.judith@gmail.com");
		u.setPassword("p1234");
		u.setEtat(1);
		System.out.println(userdao.add(u));
	}


}
