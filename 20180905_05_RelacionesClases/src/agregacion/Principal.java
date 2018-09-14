package agregacion;

import java.util.*;

public class Principal {
	
	public static void main(String[] args) { 
		Estudiante s1 = new Estudiante("Hugo", 1, "IS"); 
		Estudiante s2 = new Estudiante("Paco", 2, "IS"); 
		Estudiante s3 = new Estudiante("Luis", 1, "IE"); 
		Estudiante s4 = new Estudiante("Pepe", 2, "IE");
		
		List <Estudiante> iS_students = new ArrayList<Estudiante>();
		iS_students.add(s1);
		iS_students.add(s2);
		
		List <Estudiante> iE_students = new ArrayList<Estudiante>();
		iE_students.add(s3);
		iE_students.add(s4);
		
		Escuela iS = new Escuela("IS", iS_students); 
		Escuela iE = new Escuela ("IE", iE_students);
		
		List <Escuela> escuelas = new ArrayList<Escuela>(); 
		escuelas.add(iS);
		escuelas.add(iE);
		
		Universidad institute = new Universidad("UIS", escuelas); 
		System.out.println("-- TOTAL ESTUDIANTES DE LA UNIVERSIDAD --");
		System.out.println("Estudiantes: ");
		System.out.print(institute.getTotalEstudiantesCarrera());
		System.out.println();
		System.out.println("-- TOTAL ESTUDIANTES POR ESCUELAS --");
		System.out.println("Estudiantes IS: ");
		System.out.print(iS.getTotalEstudiantesEscuela());
		System.out.println();
		System.out.println("Estudiantes IE: ");
		System.out.print(iE.getTotalEstudiantesEscuela());
		
		System.out.println("\n -- -- -- -- -- ");
		System.out.println("Implementando .size");
		System.out.println("Total estudiantes en IS: "+iS.getEstudiantes().size());
		System.out.println("Total estudiantes en IE: "+iE.getEstudiantes().size());
	} 
	
}
