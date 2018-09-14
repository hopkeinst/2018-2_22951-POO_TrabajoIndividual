package gestorV01;

public class Etapa {

	int id;
	String nombre;
	int pAvance;
	int pesoPorc;
	int idResp;
	int estado; //Para saber si está parada (-1), en ejecución (1) o terminada (0)
	Etapa e;
	
	public Etapa(int id, String nombre, int pAvance, int pesoPorc, int idResp,
			int estado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.pAvance = pAvance;
		this.pesoPorc = pesoPorc;
		this.idResp = idResp;
		this.estado = estado;
	}
	
	void crearActividad(int id, String nombre, int pAvance,int idResp, int estado){
/* Para crear las actividades que irán ligadas a cada etapa. Después de creada serán
 * asignadas a una lista de actividades de esta etapa
 */	
	}
	
	void nuevaEtapa(int id, String nombre, int pAvance, int pesoPorc, int idResp,
			int estado){
/* Para crear nuevas etapas dentro del proyecto actual
 */
		e = new Etapa(id,nombre,pAvance,pesoPorc,idResp,estado);
		println("Etapa "+e.nombre+" creada con exito");
	}
	
	void modificarEtapa(int id, String nombre, int pAvance, int pesoPorc, int idResp,
			int estado){
/* Metodo para modificar la etapa completamente, se ingresan todos los datos para
/*modificar esta etapa exactamente por los nuevos datos ingresados como argumentos
 */
	}

	void listarEtapas(){
/* Para mostrar todas las etapas del proyecto actual
 */
	}
	
	void infoProyecto(int id){
/* Para mostrar toda la información de una etapa específica del proyecto actual
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
