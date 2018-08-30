package pruebas;

public class Principal {

	public static void main(String[] args) {
		Persona pepe = new Persona();
		pepe.asignarNombre("Jorge", "Castillo");
		println(pepe.nombre+" "+pepe.apellido);

		Persona pipe = new Persona("Saul","Jaimes",25,"Bucaramanga");
		println(pipe.nombre);
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
