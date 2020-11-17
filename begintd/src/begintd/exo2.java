package begintd;

import java.util.Scanner;
import java.lang.Math;
public class exo2 {

	public static void main(String[] args) {
		//récuperer les données saisies par l'utilisteur 
		Scanner scanner = new Scanner(System.in);
		System.out.print("rayon =" );
		int rayon = scanner.nextInt();
		System.out.println("le rayon du cercle est : " +rayon);
		
		//type float accepte integer  
		float perimetre = scanner.nextFloat();
		perimetre = rayon*rayon;
		System.out.println("perimetre ="+perimetre);
		float surface = (float)Math.PI*(rayon*rayon);
		System.out.println("surface ="+surface);
		
	}

}
