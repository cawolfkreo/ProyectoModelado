package modelo;

import java.util.ArrayList;

/**
 * Clase para realizar la simulacion.
 * @author c.zambrano10
 *
 */
public class Simulacion {
	
	//------------------------
	//		Atributos
	//------------------------
	
	/**
	 * Lista de materias
	 */
	private ArrayList<Materia> materias;
	
	/**
	 * lista de secciones.
	 */
	private ArrayList<Seccion> secciones;
	
	
	//TODO agregar atributos faltantes. Como matriz horas x  dia (HxD).
	
	//------------------------
	//		   Main
	//------------------------

	public static void main(String[] args) {
		// TODO Aun faltan cosas, estaba haciendo pruebas de lo que llevaba.
		Materia m = new Materia("Aguacates lol");
		Materia m2 = new Materia(1, "no es palta");
		Seccion s1 = new Seccion(1, 1, 1, m);
		String[] s= {"Lunes","Martes","Viernes"};
		Seccion s2 = new Seccion(2, 2, 2, s, m2);
		s1.setDias(s2.getDias());

	}

	
	
	
	//------------------------
	//	      Metodos
	//------------------------

	/**
	 * Devuelve la lista de materias de la simulacion.
	 * @return la lista de materias.
	 */
	public ArrayList<Materia> getMaterias() {
		return materias;
	}

	/**
	 * Ajusta la lista de materias de la simulacion.
	 * @param materias la nueva lista de materias
	 */
	public void setMaterias(ArrayList<Materia> materias) {
		this.materias = materias;
	}

	/**
	 * da la lista de secciones de la simulacion
	 * @return la lista de secciones de la simulacion
	 */
	public ArrayList<Seccion> getSecciones() {
		return secciones;
	}

	/**
	 * Ajusta la lista de secciones de la simulacion
	 * @param secciones la nueva lista de secciones.
	 */
	public void setSecciones(ArrayList<Seccion> secciones) {
		this.secciones = secciones;
	}

}
