package modelo;

import java.util.ArrayList;

/**
 * Clase para modelar la seccion de una materia 
 * @author c.zambrano10
 *
 */
public class Seccion {

	//------------------------
	//		Atributos
	//------------------------

	/**
	 * El numero de esta seccion.
	 */
	private int numero;

	/**
	 * la hora en la que inicia esta seccion.
	 * La hora no es una hora corriente sino un numero
	 * que representa la hora a la que inicia la 
	 * clase en el dia.
	 */
	private int horaInicio;

	/**
	 * la hora en la que finaliza esta seccion.
	 * La hora no es una hora corriente sino un numero
	 * que representa la hora a la que finaliza la
	 * clase en el dia.
	 */
	private int horaFin;

	/**
	 * Arreglo booleano para representar los dias de la
	 * semana en los que esta materia tiene lugar.
	 * 
	 * Este es un vector de 5 posiciones (de lunes a viernes)
	 * en donde se representa como verdadero si en ese
	 * dia de la semana dicha seccion tiene una clase.
	 */
	private boolean[] dias;


	/**
	 * La materia a la que pertenece esta seccion.
	 */
	private Materia materia;

	//------------------------
	//	    Constructor
	//------------------------

	/**
	 * Constructor default para una seccion, donde se espera 
	 * que se den los valores que van a almacenarse en la 
	 * instancia de la clase.
	 * @param numero numero de esta seccion.
	 * @param horaInicio hora en la que inicia la clase representada con un numero.
	 * @param horaFin hora en la que inicia la clase representada con un numero.
	 * @param dias vector binario de dias.
	 * @param materia a la que va a pertenecer esta seccion
	 */
	public Seccion(int numero, int horaInicio, int horaFin, boolean[] dias, Materia materia){
		this.numero=numero;
		this.horaInicio=horaInicio;
		this.horaFin=horaFin;
		this.dias=dias;
		this.materia=materia;
	}


	/**
	 * Constructor que permite inicializar la clase con los valores de los dias como strings
	 * @param numero numero numero de esta seccion.
	 * @param horaInicio horaInicio hora en la que inicia la clase representada con un numero.
	 * @param horaFin horaFin hora en la que inicia la clase representada con un numero.
	 * @param dias los strings con los dias en los que la seccion tiene una clase.
	 * @param materia a la que va a pertenecer esta seccion
	 */
	public Seccion(int numero, int horaInicio, int horaFin, String[] dias, Materia materia){
		this.numero=numero;
		this.horaInicio=horaInicio;
		this.horaFin=horaFin;
		this.materia=materia;

		this.dias = new boolean [5];
		setDias(dias); //actualiza los dias con el metodo para ello.
	}


	/**
	 * Constructor que permite inicializar la clase con el vector de dias con todo en false.
	 * @param numero numero numero de esta seccion.
	 * @param horaInicio horaInicio hora en la que inicia la clase representada con un numero.
	 * @param horaFin horaFin hora en la que inicia la clase representada con un numero.
	 * @param materia a la que va a pertenecer esta seccion
	 */
	public Seccion(int numero, int horaInicio, int horaFin,Materia materia){
		this.numero=numero;
		this.horaInicio=horaInicio;
		this.horaFin=horaFin;
		this.materia=materia;

		dias = new boolean [5];
	}

	//------------------------
	//	      Metodos
	//------------------------

	/**
	 * da el numero de una seccion
	 * @return el numero de la seccion
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Ajusta el numero de la seccion
	 * @param numero el nuevo numero que va a tener la seccion
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * da la hora en la que inicia una clase de la seccion
	 * @return la hora de inicio
	 */
	public int getHoraInicio() {
		return horaInicio;
	}

	/**
	 * Ajusta el valor de la hora de inicio.
	 * 
	 * @param horaInicio
	 */
	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}

	/**
	 * da la hora en la que finaliza una clase de la seccion
	 * @return la hora de fin.
	 */
	public int getHoraFin() {
		return horaFin;
	}

	/**
	 * Ajusta el valor de la hora de fin.
	 *
	 * @param horaFin
	 */
	public void setHoraFin(int horaFin) {
		this.horaFin = horaFin;
	}

	/**
	 * Devuelve le vector de dias de la semana 
	 * en los que hay clases de esta seccion.
	 * el vector es el binario
	 * @return el vector binario de dias.
	 */
	public boolean[] getDias() {
		return dias;
	}

	/**
	 * Ajusta el vector de dias de la seccion
	 * @param dias el vector de dias nuevo.
	 */
	public void setDias(boolean[] dias) {
		this.dias = dias;
	}

	/**
	 * * Ajusta el vector de dias a partir de un arreglo de 
	 * Strings, este puede ser un solo dia y simplemente
	 * lo agregara a la lista de dias que ya existen en el vector.
	 * 
	 * @param dias los strings con los dias a agregar a la seccion.
	 * cada string puede ser "lunes"||"martes"||etc.
	 */
	public void setDias(String[] dias){
		//toma cada cadena de caracteres del parametro
		for(String s : dias){

			int i = -1; //posicion del arreglo a modificar

			switch (s){
			case "Lunes":
			case "lunes":
				i++;
				break;
			case "Martes":
			case "martes":
				i=i+2;
				break;
			case "Miercoles":
			case "miercoles":
				i=i+3;					//cada break aumenta la posicion al dia correspondiente
				break;
			case "Jueves":
			case "jueves":
				i=i+4;
				break;
			case "Viernes":
			case "viernes":
				i=i+3;
				break;
			}

			if (i>=0){
				this.dias[i]=true; //el valor del arreglo para eeste dia se actualiza.	
			}
		}

	}

	/**
	 * Metodo para obtener en un arreglo de strings los dias en
	 * los que la seccion tiene clases.
	 * 
	 * @return los dias "lunes" "Martes"... en los que 
	 * una seccion tiene clase 
	 */
	public ArrayList<String> getDiasString(){

		ArrayList<String> respuestas = new ArrayList<String>(); //arreglo de respuesta

		if (dias[0]) respuestas.add("Lunes");

		if (dias[1]) respuestas.add("Martes");

		if (dias[2]) respuestas.add("Miercoles");

		if (dias[3]) respuestas.add("Jueves");

		if (dias[4]) respuestas.add("Viernes");

		return respuestas;
	}


	/**
	 * Materia a la que pertenece esta seccion.
	 * @return la materia de la seccion.
	 */
	public Materia getMateria() {
		return materia;
	}


	/**
	 * Ajusta la materia de la seccion.
	 * @param materia es la que va a quedar como 
	 * materia de esta seccion.
	 * 
	 */
	public void setMateria(Materia materia) {
		this.materia = materia;
	}


}
