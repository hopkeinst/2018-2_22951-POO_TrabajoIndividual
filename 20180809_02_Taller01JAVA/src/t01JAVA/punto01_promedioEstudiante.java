package t01JAVA;

import java.util.Scanner;

public class punto01_promedioEstudiante {
	
	static float pQ,sQ,tQ; // Las notas de los quices
	static float pTC,sTC,tTC; // Las notas de trabajo en clase
	static float pE,sE; // Las notas de lso examanes
	static float tF; // La nota del trabajo final
	static float nota = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hola, bienvenido al sistema de cálculo de promedio de notas.");
		
		// NOTAS PRIMER CORTE
		
		do{ // PRIMER QUIZ
			System.out.print("Digite por favor nota de Primer Quiz (5%): ");
			pQ = sc.nextFloat();
			if((pQ < 0) || (pQ > 5)) {
				System.out.println("ERROR - Rango de nota no válido - Intente de nuevo");
			}
		}while((pQ < 0) || (pQ > 5));
		
		do{ // PRIMER TRABAJO
			System.out.print("Digite por favor nota de Primer Trabajo de Clase (5%): ");
			pTC = sc.nextFloat();
			if((pTC < 0) || (pTC > 5)) {
				System.out.println("ERROR - Rango de nota no válido - Intente de nuevo");
			}
		}while((pTC < 0) || (pTC > 5));
		
		do{ // PRIMER EXAMEN
			System.out.print("Digite por favor nota de Primer Examen (20%): ");
			pE = sc.nextFloat();
			if((pE < 0) || (pE > 5)) {
				System.out.println("ERROR - Rango de nota no válido - Intente de nuevo");
			}
		}while((pE < 0) || (pE > 5));
		
		// NOTAS SEGUNDO CORTE
		
		do{ // SEGUNDO QUIZ
			System.out.print("Digite por favor nota de Segundo Quiz (5%): ");
			sQ = sc.nextFloat();
			if((sQ < 0) || (sQ > 5)) {
				System.out.println("ERROR - Rango de nota no válido - Intente de nuevo");
			}
		}while((sQ < 0) || (sQ > 5));
		
		do{ // SEGUNDO TRABAJO
			System.out.print("Digite por favor nota de Segundo Trabajo de Clase (5%): ");
			sTC = sc.nextFloat();
			if((sTC < 0) || (sTC > 5)) {
				System.out.println("ERROR - Rango de nota no válido - Intente de nuevo");
			}
		}while((sTC < 0) || (sTC > 5));
		
		do{ // SEGUNDO EXAMEN
			System.out.print("Digite por favor nota de Segundo Examen (20%): ");
			sE = sc.nextFloat();
			if((sE < 0) || (sE > 5)) {
				System.out.println("ERROR - Rango de nota no válido - Intente de nuevo");
			}
		}while((sE < 0) || (sE > 5));
		
		// NOTAS TERCER CORTE
		
		do{ // TERCER QUIZ
			System.out.print("Digite por favor nota de Tercer Quiz (5%): ");
			tQ = sc.nextFloat();
			if((tQ < 0) || (tQ > 5)) {
				System.out.println("ERROR - Rango de nota no válido - Intente de nuevo");
			}
		}while((tQ < 0) || (tQ > 5));
		
		do{ // TERCER TRABAJO
			System.out.print("Digite por favor nota de Segundo Trabajo de Clase (5%): ");
			tTC = sc.nextFloat();
			if((tTC < 0) || (tTC > 5)) {
				System.out.println("ERROR - Rango de nota no válido - Intente de nuevo");
			}
		}while((tTC < 0) || (tTC > 5));
		
		do{ // TRABAJO FINAL
			System.out.print("Digite por favor nota de Trabajo Final (30%): ");
			tF = sc.nextFloat();
			if((tF < 0) || (tF > 5)) {
				System.out.println("ERROR - Rango de nota no válido - Intente de nuevo");
			}
		}while((tF < 0) || (tF > 5));
		
		if(sc != null) {
	        sc.close();
		}
		
		nota = (float) ((pQ*0.05)+(sQ*0.05)+(tQ*0.05)+(pTC*0.05)+(sTC*0.05)+(tTC*0.05)+(pE*0.2)+(sE*0.2)+(tF*0.3));
		
		System.out.println(nota);
	}

}
