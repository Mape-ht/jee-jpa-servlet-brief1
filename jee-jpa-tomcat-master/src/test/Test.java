package test;

import com.senforage.dao.IVillage;
import com.senforage.dao.VillageImpl;
import com.senforage.entities.Village;

public class Test {

	public static void main(String[] args){
		
		IVillage villagedao= new VillageImpl();
		
		Village village = new Village();
		
		village.setNom("Yeumbeul");
		
		int ok = villagedao.add(village);
		System.out.println(ok);
	}
}
