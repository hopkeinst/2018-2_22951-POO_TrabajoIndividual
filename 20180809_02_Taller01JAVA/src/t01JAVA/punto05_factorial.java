package t01JAVA;

import java.util.Scanner;

public class punto05_factorial {
	
	static int factorial = 1;
	static short n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hola, bienvenido al programa para calcular el factorial de un número.");
		do{ // Ciclo repetitivo en caso de que no se ingrese un número posible (entero positivo)
			System.out.print("Ingrese el número al cual desea calcular su factorial: ");
			n = sc.nextShort(); 
			System.out.print(n+"! = 1");
			if(n == 1) { // Caso en el que solo sea el factorial de '1', se muestra solamente el 1
			}else { // Para el resto, se muestra la multiplicación y el resultado, gracias al for
				for(short i=2;i<=n;i++) {
					factorial*=i;
					System.out.print(" * "+i);
				}
				System.out.print(" = "+factorial);
			}
			if(n<1) {
				System.out.println("\tERROR - Al número "+n+" no se le puede calcular factorial porque no es entero positivo.\nIntente de nuevo.\n");
			}
		}while(n<1);
		
		if(sc != null) {
	        sc.close();
		}
	}
}
