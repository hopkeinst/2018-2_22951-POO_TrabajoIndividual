package taller02;

import java.util.Scanner;

public class Punto06_matrizSimetrica {
	
	static short[][] matriz = new short[4][4];
	static boolean fSimetrica = true;
	static short iS,jS;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		println("Bienvenido a su programa para ver si una matriz ingresada es simétrica.");
		println("A continuación ingrese los valores de la matriz según sean pedidos. Recuerde que es una mtriz de 4x4.");
		for(short i=0;i<=3;i++) { // Fila
			for(short j=0;j<=3;j++) { // Columna
				print("Ingrese fila "+(i+1)+" columna "+(j+1)+" => ");
				matriz[i][j] = sc.nextShort();
			}
		}
		println(" --\t--\t--\t--\t--");
		println("La matriz ingresada fue:");
		for(short i=0;i<=3;i++) { // Fila
			for(short j=0;j<=3;j++) { // Columna
				print(" | "+matriz[i][j]+" | ");
			}
			println("");
		}
		for(short i=0;i<=3;i++) { // Columna
			for(short j=0;j<=3;j++) { // Fila
				if(matriz[i][j] != matriz[j][i]) {
					fSimetrica = false;
					iS = i;
					jS = j;
					j = 5;
					i = 5;
				}
			}
		}
		if(fSimetrica == true) {
			println("La matriz SI es simétrica.");
		}else {
			println("La matriz NO es simétrica porque su componente de la fila "+(iS+1)+" columna "+(jS+1)+" => ("+matriz[iS][jS]+") no es igual al componente de la fila "+(jS+1)+" columna "+(iS+1)+" => ("+matriz[jS][iS]+").");
		}
		
		if(sc != null) {
	        sc.close();
		}
	}
	
// Funciones creadas para ahorrar escribir código de imprimir
	public static void print(String string) {
		System.out.print(string);
		return;
	}
	
	public static void println(String string) {
		System.out.println(string);
		return;
	}
}
