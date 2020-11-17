package begintd;

import java.math.*;
import java.util.Scanner;

public class exo4 {

	public static void main(String[] args) {
		//Demander les input et les enregistrer en même temps avec scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println("Saisir un nombre réel");
		float nombre1 = Float.parseFloat(scanner.next());  
		System.out.println("Saisir un nombre entier");
		int nombre2 = scanner.nextInt();  
		 

		//sortir nombre 1 puissance nombre 2
		float puissance = (float) Math.pow(nombre1, nombre2);
		System.out.println(+ nombre1+ "puissance " + nombre2+ "est : "+puissance);
		
	}
}
