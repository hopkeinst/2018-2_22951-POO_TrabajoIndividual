package gestorV01;

public class Actividad {

	int id;
	String nombre;
	int pAvance;
	int idResp;
	int estado; //Para saber si está parada (-1), en ejecución (1) o terminada (0)
	Actividad a;
	
	public Actividad(int id, String nombre, int pAvance,int idResp, int estado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.pAvance = pAvance;
		this.idResp = idResp;
		this.estado = estado;
	}
	
	Actividad(){
		
	}
	
	void nuevaActividad(int id, String nombre, int pAvance,int idResp, int estado){
/* Para crear nuevas actividades dentro de la etapa-proyecto actual
 */
		a = new Actividad(id,nombre,pAvance,idResp,estado);
		println("Actividad "+a.nombre+" creada con exito");
	}
	
	void modificarActividad(int id, String nombre, int pAvance,int idResp, int estado){
/* Metodo para modificar la actividad completamente, se ingresan todos los datos para
/*modificar esta etapa exactamente por los nuevos datos ingresados como argumentos
 */
	}
	
	void listarActividades(){
/* Para mostrar todas las actividades de la etapa-proyecto actual
 */
	}
	
	void infoActividad(int id){
/* Para mostrar toda la información de una actividad específica de la etapa-proyecto actual
*/
	}

// Funciones internas de la clase, no interactuan fuera

	void print(String s){
		System.out.print(s);
	}
	
	void println(String s){
		System.out.println(s);
	}
	
}
