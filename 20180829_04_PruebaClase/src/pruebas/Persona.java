package pruebas;

public class Persona {

	public String nombre;
	public String apellido;
	public int edad;
	public String ciudad;
	
	public void asignarNombre(String a,String b){
		this.nombre = a;
		this.apellido = b;
	}
	
	public Persona(String a,String b,int c,String d) {
		this.nombre = a;
		this.apellido = b;
		this.edad = c;
		this.ciudad = d;
	}
	
	public Persona() {
	}
}


