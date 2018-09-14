package agregacion;

import java.util.*;

public class Escuela { 
	
	String nombre;
	private List<Estudiante> estudiantes;

	Escuela (String name, List<Estudiante> students) {
		this.nombre = name; this.estudiantes = students;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}
	
	public void setEstudiantes(List<Estudiante> estudiantes) { 
		this.estudiantes = estudiantes;
	}
	
	public int getTotalEstudiantesEscuela() {
		int noEstudiantes = 0; 
		for(Estudiante s : estudiantes) {
			noEstudiantes++;
	    	System.out.println("\t"+s.nombre); 
		}
		System.out.print("Total Estudiantes de la Escuela de "+this.nombre+": ");
		return noEstudiantes; 
	}
}
