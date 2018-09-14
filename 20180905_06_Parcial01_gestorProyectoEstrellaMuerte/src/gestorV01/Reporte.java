package gestorV01;

public class Reporte {
	int id;	// identificador del reporte
	String fecha; //fecha que se genera el reporte
	int idRespo; //persona que realiza el reporte
	int horas; //horas gastadas en la actividad reportada
	int pAvance; //porcntaje de avance de al actividad reportada, que se logró al final
	int tipo; //tipo de reporte, haciendo énfasis a si es actividad, etapa o proyecto
	Reporte r;
	
	public Reporte(int id, String fecha, int idRespo, int horas, int pAvance,
			int tipo) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.idRespo = idRespo;
		this.horas = horas;
		this.pAvance = pAvance;
		this.tipo = tipo;
	}
	
	void generarReporte(int id, String fecha, int idRespo, int horas, int pAvance,
			int tipo){
		r = new Reporte(id,fecha,idRespo,horas,pAvance,tipo);
		println("Reporte #"+r.id+" generado con exito");
		
	}
	
	void listarReportes(){
/* Muestra los reportes que hay
 * 
 */
	}
	
	void infoReporte(int id){
/* Muestra información específica de un reporte, buscado por el id
 * 
 */
	}

// Funciones internas de la clase, no interactuan fuera
	
	static void print(String s){
		System.out.print(s);
	}
	
	static void println(String s){
		System.out.println(s);
	}
	
}
