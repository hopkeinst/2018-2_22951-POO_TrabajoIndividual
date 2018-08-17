package t01JAVA;

import java.util.Scanner;

public class punto06_serieFibonacci {
	
	static short n; // La cantidad de números Fibonacci a mostrar
	static int a = 1; // Donde se almacena parte de la serie
	static int b = 0; // Donde se almacena parte de la serie
	static int f = a; // Número va la serie
	static short contador = 0; // Para llevar el conteo de los números de la serie

	public static void main(String[] args) {
		System.out.println("Hola, bienvenido a su programa para encontrar los primeros 'n' números de la serie Fibonacci.");
		System.out.print("Ingrese por favor la cantidad a encontrar: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextShort();
		if(n<1) {
			System.out.println("\tERROR - Ingresaste un valor no válido. El programa terminará.");
		}else {
			System.out.print("Serie Fibonacci de "+n+" = ");
			if(n == 1) {
				System.out.println(a);
			}else {
				for(short i=2;i<=n;i++) {
					f = a+b;
					b = a;
					System.out.print(a+" ");
					a = f;
				}
				System.out.println(f);
			}
			
		}
		
		if(sc != null) {
	        sc.close();
		}
	}
}
