package taller02;

import java.util.Scanner;

public class Punto01_ecuaciones2Grado {
	
	static float a;
	static float b;
	static float c;
	static double x1;
	static double x2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("PROGRAMA PARA HALLAR SOLUCIONES DE ECUACIONES DE SEGUNDO GRADO");
		System.out.println("Ingrese los coeficientes (valores numéricos) que acompañan a las variables para hallar sus posibles valores.");
		System.out.println("---\t---\t---");
		System.out.print("Ingrese el coeficiente que acompaña a x2: ");
		a = sc.nextFloat();
		System.out.print("Ingrese el coeficiente que acompaña a x: ");
		b = sc.nextFloat();
		System.out.print("Ingrese el coeficiente que va solo: ");
		c = sc.nextFloat();
		
		if((b*b) < (4*a*c)) {
			System.out.println("---\n NO SE PUEDE CALCULAR SOLUCIÓN REAL");
		}else {
			x1 = ((-b)+Math.sqrt((b*b)-(4*a*c)))/(2*a);
			x2 = ((-b)-Math.sqrt((b*b)-(4*a*c)))/(2*a);
			System.out.println("La solución 1 es: "+x1);
			System.out.println("La solución 2 es: "+x2);
		}

		if(sc != null) {
	        sc.close();
		}
	}
}
