package modelo.entidad;

/**
 * <b>Descripción:<b> Clase que representa la entidad Autor
 * @author 
 * @author 
 * @author Francisco Alejandro Hoyos Rojas
 * @version 1.0
 */
public class Autor {
	/**
	 * Atributo que representa el id del autor
	 */
	private Long idAutor;
	
	/**
	 * Atriburo que representa el nombre del autor
	 */
	private String nombreAutor;
	
	
	/**
	 * Constructor de la clase.
	 * @param idAutor id del autor 
	 * @param nombreAutor nombre del autor
	 */
	public Autor(Long idAutor, String nombreAutor) {
		super();
		this.idAutor = idAutor;
		this.nombreAutor = nombreAutor;
	}
	
	/**
	 * Metodo encargado de retornar el valor del atributo idAutor
	 * @return El idAutor asociado a la clase
	 */
	public Long getIdAutor() {
		return idAutor;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo idAutor
	 * @param idAutor El nuevo idAutor a modificar.
	 */
	public void setIdAutor(Long idAutor) {
		this.idAutor = idAutor;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo nombreAutor
	 * @return El nombreAutor asociado a la clase
	 */
	public String getNombreAutor() {
		return nombreAutor;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo nombreAutor
	 * @param nombreAutor El nuevo nombreAutor a modificar.
	 */
	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}
	
}
