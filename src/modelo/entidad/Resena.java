package modelo.entidad;

/**
 * <b>Descripción:<b> Clase que representa una reseña de un libro
 * @author 
 * @author 
 * @author Francisco Alejandro Hoyos Rojas
 * @version 1.0
 */
public class Resena {
	
	/**
	 * Atributo que representa el id de una reseña
	 */
	private Long idResena;
	/**
	 * Atributo que representa el nombre del usuario que escribe la reseña
	 */
	private String nombreUsuario;
	/**
	 * Atributo que representa la reseña
	 */
	private String resena;
	
	/**
	 * Atributo que representa la llave con libro
	 */
	private String Libro;
	
	/**
	 * Constructor de la clase.
	 * @param nombreUsuario nombre de usuario de quien escribe la reseña
	 * @param resena reseña
	 */
	public Resena(String nombreUsuario, String resena) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.resena = resena;
	}
	
	/**
	 * Metodo encargado de retornar el valor del atributo idResena
	 * @return El idResena asociado a la clase
	 */
	public Long getIdResena() {
		return idResena;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo idResena
	 * @param idResena El nuevo idResena a modificar.
	 */
	public void setIdResena(Long idResena) {
		this.idResena = idResena;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo nombreUsuario
	 * @return El nombreUsuario asociado a la clase
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo nombreUsuario
	 * @param nombreUsuario El nuevo nombreUsuario a modificar.
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo resena
	 * @return El resena asociado a la clase
	 */
	public String getResena() {
		return resena;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo resena
	 * @param resena El nuevo resena a modificar.
	 */
	public void setResena(String resena) {
		this.resena = resena;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo Libro
	 * @return El libro asociado a la clase
	 */
	public String getLibro() {
		return Libro;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo Libro
	 * @param libro El nuevo libro a modificar.
	 */
	public void setLibro(String libro) {
		Libro = libro;
	}
	
}
