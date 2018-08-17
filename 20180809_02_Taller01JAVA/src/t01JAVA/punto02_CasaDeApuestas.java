package t01JAVA;

import java.util.Scanner;

public class punto02_CasaDeApuestas {
	
	static int[][] acc = new int[5][3];
	static int valAcc = 10000;
	static short juego = 1;
	static short ronda = 0;
	static int tAcc = 0;
	static int mayor;
	static int menor;
	static short nMayor,nMenor;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hola, bienvenido al sistema de apuestas diarias.\n");
		
		for(short i=0;i<5;i++) { // Ingresa las acciones que tiene cada jugador
			System.out.print("Ingrese acciones iniciales del "+(i+1)+"º jugador: ");
			acc[i][0] = sc.nextInt();
			acc[i][1] = 0;
			acc[i][2] = acc[i][0];
		}
		System.out.println("\n - INICIA EL JUEGO - \n");
		System.out.println("En cada ronda cada jugador debe apostar una cantidad disponible de acciones.");
		
		do { // Ciclo para jugar cada ronda
			ronda++;
			System.out.println("--- RONDA "+ronda+" INICIADA ---");
			for(short i=0;i<5;i++) {
				do { // Comprueba si hay la cantidad apostada o no, si no muestra error y repita la solicitud de apuesta
					System.out.print("Ingrese acciones a apostar del "+(i+1)+"º jugador: ");
					tAcc = sc.nextInt();
					if(tAcc > acc[i][2]){
						System.out.println("ERROR - Intenta apostar más acciones de las que tiene.\nEste jugador dispone de "+acc[i][2]+" acciones actualmente.");
					}else{ // Si habia la cantidad apostada, entonces suma el dato de lo apostado en la matriz, mientras va descontando de lo que queda para apostar
						acc[i][1]+=tAcc;
						acc[i][2]-=tAcc;
					}
				}while(tAcc > (acc[i][2]+tAcc));
			}
			System.out.print("--- TERMINA LA RONDA ---\nIngrese '1' si desean seguir apostando o cualquier otro número si desea terminar el juego.\nOpción: ");
			juego = sc.nextShort();
		}while(juego == 1);
		System.out.println("\n--- JUEGO TERMINADO ---\n");
		mayor = acc[0][1];
		menor = acc[0][1];
		nMayor = 1;
		nMenor = 1;
		for(short i=0;i<4;i++) { 
			for(short j=(short) (i+1);j<5;j++) {
				if(acc[i][1] < acc[j][1]) { // Consulta por el mayor
					nMayor = (short) (j+1);
				}
				if(acc[i][1] > acc[j][1]) { // Consulta por el menor
					nMenor = (short) (j+1);
				}
			}
		}
		System.out.println("# Jugador\tInicial\tApostado\tSaldo");
		for(short i=0;i<5;i++) {
			System.out.println((i+1)+" Jugador\t"+acc[i][0]+"\t"+acc[i][1]+"\t\t"+acc[i][2]);
		}
		System.out.println("El jugador que más apostó fue el #"+nMayor);
		System.out.println("El jugador que menos apostó fue el #"+nMenor);
		
		if(sc != null) {
	        sc.close();
		}
		
	}	
	
}
