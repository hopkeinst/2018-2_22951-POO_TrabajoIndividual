package agregacion;

import java.util.*;

public class Universidad { 
	
	String nombre;
	private List<Escuela> escuelas;
	
	Universidad (String instituteName, List<Escuela> escuelas) {
		this.nombre = instituteName;
		this.escuelas = escuelas;
	}
	
	public int getTotalEstudiantesCarrera() {
		int noEstudiantes = 0; 
		List<Estudiante> estudiantes; 
		for(Escuela dept : escuelas) {
			estudiantes = dept.getEstudiantes(); 
			for(Estudiante s : estudiantes) {
	                noEstudiantes++;
	                System.out.println("\t"+s.nombre);
			} 
		}
		System.out.print("Total Estudiantes en la Institucion: ");
		return noEstudiantes; 
	}
}