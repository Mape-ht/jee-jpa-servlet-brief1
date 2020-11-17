package begintd;

import java.util.Scanner;

public class exo3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Saisir la valeur de R1 : ");
		float R1 = scanner.nextFloat();  
		System.out.println("Saisir la valeur de R2 : ");
		float R2 = scanner.nextFloat();
		System.out.println("Saisir la valeur de R3 : ");
		float R3 = scanner.nextFloat();
		
		float resistanceSerie = (R1 + R2 + R3);
		System.out.println("la resistance en série est : " +resistanceSerie);
		float resistanceParallele = (R1 * R2 * R3)/(R1 * R2 + R2 * R3 + R1 * R3);
		System.out.println("la resistance en parallèle est : " +resistanceParallele);
	
		System.out.print("la valeur est : ");
		int choice = scanner.nextInt();
	
		if (choice == 1) 
			System.out.println("la résistance est en série" );	
		 else
			System.out.println("la résistance est en parallele");	

	}

}
