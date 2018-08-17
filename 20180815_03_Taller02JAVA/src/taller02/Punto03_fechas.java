package taller02;

import java.util.Scanner;

public class Punto03_fechas {
	
	static short dia;
	static short mes;
	static short ano;
	static boolean fDias = true;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sistema para indicar si la fecha es correcta y si no corregirla");
		do {
			System.out.print("Ingrese el día: ");
			dia = sc.nextShort();
			if((dia < 1) || (dia > 31)) {
				System.out.println("\t ERROR rango de días no válido. Intente de nuevo.");
			}
		}while((dia < 1) || (dia > 31));
		do {
			System.out.print("Ingrese el mes: ");
			mes = sc.nextShort();
			if((mes < 1) || (mes > 12)) {
				System.out.println("\t ERROR rango de meses no válido. Intente de nuevo.");
			}
		}while((mes < 1) || (mes > 12));
		do {
			System.out.print("Ingrese el año: ");
			ano = sc.nextShort();
			if(ano < 1) {
				System.out.println("\t ERROR rango de años no válido. Intente de nuevo.");
			}
		}while(ano < 1);
		System.out.print("La fecha de "+dia+"/"+mes+"/"+ano+" es ");
		if((dia <= 28) && (mes == 2)) {
			System.out.println("CORRECTA");
		}else if((dia > 28) && (mes == 2)){
			mes++;
			dia-=28;
			System.out.println("INCORRECTA - La nueva corregida es "+dia+"/"+mes+"/"+ano);
		}else if((dia <= 30) && ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11))){
			System.out.println("CORRECTA");
		}else if((dia > 30) && ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11))){
			mes++;
			dia-=30;
			System.out.println("INCORRECTA - La nueva corregida es "+dia+"/"+mes+"/"+ano);
		}else {
			System.out.println("CORRECTA");
		}

		if(sc != null) {
	        sc.close();
		}
	}
}
