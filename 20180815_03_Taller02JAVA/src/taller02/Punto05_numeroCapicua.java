package taller02;

import java.util.Scanner;

public class Punto05_numeroCapicua {
	
	static int numInt;
	static String numStr;
	static short larNum;
	static boolean fCapicua = true;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Programa para comprobar si un número es capicua.");
		System.out.print("Ingrese el número a analizar: ");
		numInt = sc.nextInt();
		if(numInt < 0) {
			System.out.print("El número "+numInt);
			numInt*=(-1);
			System.out.println(" se analizará como el número "+numInt+" por ser negativo.");
		}
		numStr = Integer.toString(numInt);
		larNum = (short)numStr.length();
		if(larNum > 1) {
			if((larNum%2) == 0) {
				for(int i=((larNum/2)-1);i>=0;i--) {
					//System.out.println("i "+(i+1)+" -> "+numStr.charAt(i)+" vs "+(larNum-i)+" -> "+numStr.charAt(larNum-i-1));
					if(numStr.charAt(i) != numStr.charAt(larNum-i-1)) {
						fCapicua = false;
						System.out.println("NO ES CAPICUA porque el dígito "+(i+1)+" => "+numStr.charAt(i)+" es diferente al dígito "+(larNum-i)+" => "+numStr.charAt(larNum-i-1)+".");
						i = -1;
					}
				}
			}else {
				for(int i=((larNum/2)-1);i>=0;i--) {
					if(numStr.charAt(i) != numStr.charAt(larNum-i-1)) {
						fCapicua = false;
						System.out.println("NO ES CAPICUA porque el dígito "+(i+1)+" => "+numStr.charAt(i)+" es diferente al dígito "+(larNum-i)+" => "+numStr.charAt(larNum-i-1)+".");
						i = -1;
					}
				}
			}
			if(fCapicua == true) {
				System.out.println("El número si es CAPICUA.");
			}
		}else {
			System.out.println("No se puede analizar el número porque tiene 1 solo dígito.");
		}

		if(sc != null) {
	        sc.close();
		}
	}
}
