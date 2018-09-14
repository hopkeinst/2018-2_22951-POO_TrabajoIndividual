package gestorV01;

public class Responsable {

	int id;
	String nombre;

	public Responsable(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	Responsable(){
		
	}
	
	void listarProyectos(int id){
/* Para listar, o mostrar una lista de los proyectos a cargo que tiene este responsable
 * ubicado por el id
 */
	}
	
	void listarEtapas(int id){
	/* Para listar, o mostrar una lista de las etapas-proyectos a cargo que tiene este 
	* responsable ubicado por el id
	*/
	}
	
	void listarActividades(int id){
/* Para listar, o mostrar una lista de las actividad-etapas-proyectos a cargo que tiene
*  este responsable ubicado por el id
*/
	}

	void print(String s){
		System.out.print(s);
	}
	
	void println(String s){
		System.out.println(s);
	}

}
