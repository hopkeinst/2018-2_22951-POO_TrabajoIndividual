package t01JAVA;

import java.util.Scanner;

public class punto03_password3cifras {
	
	static String contra = ""; // String donde se guardará la clave para ver su longitud
	static short longitud = 0;

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
		
		System.out.println("Su nueva contraseña del sistema es: "+contra);
		
		if(sc != null) {
	        sc.close();
		}
	}
}
