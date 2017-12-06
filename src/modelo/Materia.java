package modelo;


/**
 * Clase que modela una materia
 * 
 * @author c.zambrano10
 *
 */
public class Materia {

	//------------------------
	//		Atributos
	//------------------------

	/**
	 * Id para identificar a la materia de las demas.
	 */
	//TODO: creo que este atributo se puede obviar pero los puedes dejar si te parece util :p
	private int id;

	/**
	 * El nombre de una materia.
	 */
	private String nombre;


	//------------------------
	//	   Constructores
	//------------------------

	/**
	 * Constructor para una materia con
	 * todos los atributos.
	 * 
	 * @param id identificador unico de la nueva materia.
	 * @param Nombre de la materia.
	 */
	public Materia(int id, String nombre){
		this.id = id;
		this.nombre = nombre;
	}

	/**
	 * Constructor para una materia solo 
	 * con el atributo de nombre.
	 * 
	 * @param id identificador unico de la nueva materia.
	 * @param Nombre de la materia.
	 */
	public Materia(String Nombre){
		this.nombre = Nombre;
	}


	//------------------------
	//	      Metodos
	//------------------------


	/**
	 * da el Id correspondiente a la materia
	 * 
	 * @return id de esta materia
	 */
	//TODO: Esto lo puedes quitar segun como decidieras
	public int getId() {
		return id;
	}

	/**
	 * Ajusta el id de la materia.
	 * <b>Atencion: asegurar que el 
	 * nuevo id es unico<b>
	 * 
	 * @param id el nuevo id unico para la materia.
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * da el nombre de la materia
	 * 
	 * @return el nombre de esta materia.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Ajusta el nombre de esta materia.
	 * 
	 * @param nombre el nuevo nombre para la materia.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
