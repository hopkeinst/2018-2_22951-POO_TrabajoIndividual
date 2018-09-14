package gestorV01;

import java.util.*;

public class Proyecto {

	int id;
	String nombre;
	String fInicio;
	String fFinalEstimada;
	String fFinalReal;
	byte pAvance;
	short idResp;
	byte estado; //Para saber si está parada (-1), en ejecución (1) o terminada (0)
	static List <Etapa> etapas;
	Etapa e;
	Proyecto p;
	
	public Proyecto(int id, String nombre, String fInicio, String fFinalEstimada,
			String fFinalReal, int i,int j, int k) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fInicio = fInicio;
		this.fFinalEstimada = fFinalEstimada;
		this.fFinalReal = fFinalReal;
		this.pAvance = (byte) i;
		this.idResp = (short) j;
		this.estado = (byte) k;
		etapas = new ArrayList<Etapa>();
	}
	
	void crearEtapa(int id, String nombre, int pAvance, int pesoPorc, int idResp,
			int estado){
/* Para crear una nueva etapa al proyecto actual, y se van colocando en la lista
 */
		e.nuevaEtapa(id,nombre,pAvance,pesoPorc,idResp,estado);
		etapas.add(e);
	}
	
	void nuevoProyecto(int id, String nombre, String fInicio, String fFinalEstimada,
			String fFinalReal, int pAvance,int idResp, int estado){
		p = new Proyecto(id,nombre,fInicio,fFinalEstimada,fFinalReal,pAvance,idResp,estado);
		println("Proyecto "+p.nombre+" creado con exito");
	}
	
	void modificarProyecto(int id, String nombre, String fInicio, String fFinalEstimada,
			String fFinalReal, int pAvance,int idResp, int estado){
/* Metodo para modificar el proyecto completamente, se ingresan todos los datos para
/*modificar ese proyecto exactamente por los nuevos datos ingresados como argumentos
 *	
 */
	}
	
	void listarProyectos(){
/* Para mostrar todos los proyectos
 */
	}
	
	void infoProyecto(int id){
/* Para mostrar toda la información de un proyecto específico
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
