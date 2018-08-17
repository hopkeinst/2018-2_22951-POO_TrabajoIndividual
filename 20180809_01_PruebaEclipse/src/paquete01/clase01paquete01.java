package paquete01;

import paquete02.clase01paquete02;

public class clase01paquete01 {

	static String cadena = "Hola Paquete01 Clase01";

	public static void main(String[] args) {
		paquete02.clase01paquete02 clase01paquete02 = new paquete02.clase01paquete02();
		
		System.out.println(cadena);
		clase01paquete02.main(args);
	}
}
