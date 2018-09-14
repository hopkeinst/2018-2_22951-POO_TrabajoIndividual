package gestorV01;

import java.util.*;

public class Principal {
	
	Proyecto p001;
	Proyecto p002;
	Responsable r001;
	Responsable r002;
	Responsable r003;
	Responsable r004;
	Responsable r005;
	Responsable r006;
	Responsable r007;
	List <Proyecto> proyectos;
	List <Responsable> responsables;
	static Scanner sc;
	static int opc;

	Principal(){
/*	Constructor inicial, para cargar la informaci�n inicial con la cual se empieza
 * a utilizar este software de gesti�n de proyectos, teniendo en cuenta que ya 
 * estaba en ejecuci�n la construcci�n de la estrella de la muerte.
 */
		
// Creaci�n de los proyectos iniciales;
		p001 = new Proyecto(1,"Construccion de la base para la estructura del reactor","01-Ene-2015","15-Sep-2019","00-xxx-0000",12,1,1);
		p002 = new Proyecto(2,"Construccion del reactor principal","01-Ene-2016","15-May-2022","00-xxx-0000",5,2,1);

// Creaci�n de las etapas, se hacen dentro de los proyectos
		p001.crearEtapa(1,"Planeacion",12,2,3,1);
		p001.crearEtapa(2,"Asignacion de Tareas",5,1,4,1);
		p002.crearEtapa(1,"Planeacion",12,2,5,1);
		p002.crearEtapa(2,"Maquetacion",5,4,6,1);
		
// Creaci�n de las actividades
		
		

		
// Creaci�n de los responsables
		r001 = new Responsable(1,"Hugo");
		r002 = new Responsable(2,"Paco");
		r003 = new Responsable(3,"Hugo");
		r004 = new Responsable(4,"Paco");
		r005 = new Responsable(5,"Hugo");
		r006 = new Responsable(6,"Paco");
		r007 = new Responsable(7,"Paco");
		
// Creaci�n de las listas para asignarles los objetos
		proyectos = new ArrayList<Proyecto>();
		proyectos.add(p001);
		proyectos.add(p002);
		println("Cantidad de proyectos iniciales: "+proyectos.size());
		responsables = new ArrayList<Responsable>();
		responsables.add(r001);
		responsables.add(r002);
		responsables.add(r003);
		responsables.add(r004);
		responsables.add(r005);
		responsables.add(r006);
		responsables.add(r007);
		println("Cantidad de responsables iniciales: "+responsables.size());
	}
	
	public static void main(String[] args) {
		Principal inicio = new Principal();
		println(" -- -- -- -- --");
		println("BIENVENIDO AL GESTOR DE PROYECTOS DE LA ESTRELLA DE LA MUERTE");
		println("\t\tDEATH DARK STAR PLANNER");
		do{
			println("Escoja que accion desea realizar:");
			println("1 => Crear nuevo proyecto\n" +
					"2 => Modificar proyecto\n"+
					"3 => Generar reportes\n"+
					"0 => Salir"+
					"Opcion: ");
			sc = new Scanner(System.in);
			opc = sc.nextInt();
			if((opc > 3) && (opc < 0)){
				println("ERROR - OPCION NO VALIDA\n"+
						"Procedera a mostrarse el menu de nuevo\n"+
						" -- -- -- -- --");
			}
		}while((opc > 3) && (opc < 0));
		
/* Y dependiendo de la opci�n escogida pues procede a
 * 1. Mostrar para meter datos del nuevo proyecto
 * 2. Llevar a un men� de lso proyectos. All� puede escoger modificarlos, o
 * 	  crearles etapas a un proyecto espec�fico. Tambi�n modificar etapas que 
 * 	  a su vez lleva a otro men� para realizar lo mismo dentro de �l y con sus
 * 	  actividades correspondientes.
 * 3. Llama a la clase <<informes>> para generar los informes correspondientes
 * 0. Da salida del programa
 */
	}
	
	static void print(String s){
		System.out.print(s);
	}
	
	static void println(String s){
		System.out.println(s);
	}
}
