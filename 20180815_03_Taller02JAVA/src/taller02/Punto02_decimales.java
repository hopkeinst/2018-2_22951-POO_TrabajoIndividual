package taller02;

import java.util.Scanner;

public class Punto02_decimales {
	
	static float ing;
	static String numero;
	static String entero;
	static String decimales;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un valor entre 0 y 0,999: ");
		ing = sc.nextFloat();
		if((ing > 0) && (ing < 9.999)) {
			numero = Float.toString(ing);
			decimales = numero.substring(numero.indexOf(".")+1);
			entero = numero.substring(0,numero.indexOf("."));
			System.out.print("El número "+numero+" tiene "+decimales.length()+" cifras decimales y con el invertido en su parte decimal quedaría "+entero+".");
			for(int i=(decimales.length()-1);i>=0;i--) {
				System.out.print(decimales.charAt(i));
			}
		}else {
			System.out.println("\t ERROR ingresaste un número por fuera del rango.");
		}
		
		if(sc != null) {
	        sc.close();
		}
	}
}
