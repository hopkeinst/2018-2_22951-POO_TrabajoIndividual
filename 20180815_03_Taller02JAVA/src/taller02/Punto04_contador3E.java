package taller02;

import java.util.Formatter;
import java.util.Scanner;

public class Punto04_contador3E {
	
	static String contador = "00000";
	static int nConta = 0;
	static String opcion;
	static char op;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido a un programa de conteo de 5 dígitos. Presione 'enter' para continuar o ingrese cualquier caracter para salir");
		
		do {
			Formatter fmt = new Formatter();
			opcion = sc.nextLine();
			nConta++;
			fmt.format("%05d",nConta);
			contador = fmt.toString();
			for(short i=0;i<contador.length();i++) {
				if(contador.charAt(i) == '3') {
					System.out.print('E');
				}else {
					System.out.print(contador.charAt(i));
				}
				if((i>= 0) && (i<contador.length()-1)) {
					System.out.print('-');
				}
			}
			if (opcion.contains("0")){
				opcion = "0";
			}
		}while(opcion != "0");
		
		System.out.println(" Terminó el contador");
		
		if(sc != null) {
	        sc.close();
		}
	}
}
