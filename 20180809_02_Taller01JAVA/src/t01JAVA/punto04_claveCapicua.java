package t01JAVA;

// Tomo el código del punto 03 y agrego el cálculo del capicua; pero también para caracteres.

import java.util.Scanner;

public class punto04_claveCapicua {
	
	static String contra = ""; // String donde se guardará la clave para ver su longitud
	static short longitud = 0; // Para la longitud del string
	static char primera; // Para almacenar el primer caracter
	static char ultima; // Para almacenar el ultimo caracter

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hola, bienvenido al sistema para crear su contraseña de acceso.\nRecuerde que debe ser solamente de 3 caracteres.");
		do { //Ciclo repetitivo si no se cumple que la longitud sea de 3 caracteres
			System.out.print("Ingrese la nueva contraseña de la cuenta: ");
			contra = sc.nextLine();
			longitud = (short) contra.length();
			if(longitud != 3) {
				System.out.println("\tERROR - Ingresó una contraseña que no es de 3 caracteres. Se solicitará de nuevo.");
			}
		}while(longitud != 3);
		
		System.out.println(" || Su nueva contraseña del sistema es: "+contra+" || ");
		
		primera = contra.charAt(0);
		ultima = contra.charAt(2);
		if(primera == ultima) {
			System.out.println("La clave es CAPICUA");
		}else {
			System.out.println("La clave NO es capicua");
		}
		
		if(sc != null) {
	        sc.close();
		}
	}
}