package taller02;

import java.util.Scanner;

public class Punto07_operacionesMatriz3x3 {
	
	static int[][] matriz = new int[3][3];
	static float med = 0;
	static int max = 0;
	static int min = 0;
	static int sumDiaAsc = 0;
	static int sumDiaDes = 0;
	static int triSup = 0;
	static int triInf = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		println("Bienvenido a su programa para calcular ciertos valores de una matriz ingresada.");
		println("A continuación ingrese los valores de la matriz según sean pedidos. Recuerde que es una mtriz de 3x3.");
		for(short i=0;i<=2;i++) { // Fila
			for(short j=0;j<=2;j++) { // Columna
				print("Ingrese fila "+(i+1)+" columna "+(j+1)+" => ");
				matriz[i][j] = sc.nextShort();
			}
		}
		min = matriz[0][0];
		max = matriz[0][0];
		println(" --\t--\t--\t--");
		println("La matriz ingresada fue:");
		for(short i=0;i<=2;i++) { // Fila
			for(short j=0;j<=2;j++) { // Columna
				print(" | "+matriz[i][j]+" | ");
				med+=matriz[i][j];
				if(min > matriz[i][j]) {
					min = matriz[i][j];
				}
				if(max < matriz[i][j]) {
					max = matriz[i][j];
				}
				if(i == j) {
					sumDiaDes+=matriz[i][j];
				}
				if(((i == 0) && (j== 2)) || ((i == 1) && (j == 1)) || ((i == 2) && (j == 0))) {
					sumDiaAsc+=matriz[i][j];
				}
			}
			println("");
		}
		triSup = matriz[0][2]; // El triángulo superior, o sea por encima de la diagonal descendente de la matriz es solo la posición 0,2
		triInf = matriz[2][0]; // El triángulo inferior, o sea por debajo de la diagonal descendente de la matriz es solo la posición 2,0
		println(" --\t--\t--\t--");
		println("La suma de los componentes de la matriz es "+med);
		med/=9;
		println("La media de la matriz es "+med);
		println("El valor máximo de la matriz es "+max);
		println("El valor mínimo de la matriz es "+min);
		println("La suma de la diagonal ascendente es "+sumDiaAsc);
		println("La suma de la diagonal descendente es "+sumDiaDes);
		println("La suma del triángulo superior formado por la diagonal descendente es "+triSup);
		println("La suma del triángulo inferior formado por la diagonal descendente es "+triInf);
		
		if(sc != null) {
	        sc.close();
		}
	}

//Funciones creadas para ahorrar escribir código de imprimir
	public static void print(String string) {
		System.out.print(string);
		return;
	}
	
	public static void println(String string) {
		System.out.println(string);
		return;
	}
}
