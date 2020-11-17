package test;

import com.senforage.dao.IUser;
import com.senforage.dao.UserImpl;
import com.senforage.entities.User;

public class Testuser {

	public static void main(String[] args) {
		
		IUser userdao = new UserImpl();
		User u = new User();
		
		u.setNom("Sagna");
		u.setPrenom("Judith");
		u.setEmail("sagna.judith@gmail.com");
		u.setPassword("1234p");
		u.setEtat(1);
		
		System.out.println(userdao.add(u));
	}
}
