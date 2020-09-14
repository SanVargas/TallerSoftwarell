package modelo.entidad;

/**
 * 
 * <b>Descripción:<b> Clase que representa la entidad Producto
 * @author 
 * @author 
 * @author Francisco Alejandro Hoyos Rojas
 * @version 1.0
 */
public class Producto {

	/**
	 * Atributo que representa el id de un producto
	 */
	private Long idProducto;
	
	/**
	 * Atributo que representa el tipo de producto
	 */
	private String tipoProducto;
	
	/**
	 * Atributo que representa el número de calificaciones
	 */
	private Integer numeroCalificaciones;
	
	/**
	 * Atributo que representa la calificación del producto
	 */
	private Double calificacion;
	
	/**
	 * Constructor de la clase.
	 * @param tipoProducto tipo del producto
	 * @param numeroCalificaciones número de calificaciones del producto
	 * @param calificacion calificación del producto
	 */
	public Producto(String tipoProducto, Integer numeroCalificaciones, Double calificacion) {
		super();
		this.tipoProducto = tipoProducto;
		this.numeroCalificaciones = numeroCalificaciones;
		this.calificacion = calificacion;
	}
	
	/**
	 * Metodo encargado de retornar el valor del atributo idProducto
	 * @return El idProducto asociado a la clase
	 */
	public Long getIdProducto() {
		return idProducto;
	}
	
	/**
	 * Metodo encargado de modificar el valor del atributo idProducto
	 * @param idProducto El nuevo idProducto a modificar.
	 */
	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo tipoProducto
	 * @return El tipoProducto asociado a la clase
	 */
	public String getTipoProducto() {
		return tipoProducto;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo tipoProducto
	 * @param tipoProducto El nuevo tipoProducto a modificar.
	 */
	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo numeroCalificaciones
	 * @return El numeroCalificaciones asociado a la clase
	 */
	public Integer getNumeroCalificaciones() {
		return numeroCalificaciones;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo numeroCalificaciones
	 * @param numeroCalificaciones El nuevo numeroCalificaciones a modificar.
	 */
	public void setNumeroCalificaciones(Integer numeroCalificaciones) {
		this.numeroCalificaciones = numeroCalificaciones;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo calificacion
	 * @return El calificacion asociado a la clase
	 */
	public Double getCalificacion() {
		return calificacion;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo calificacion
	 * @param calificacion El nuevo calificacion a modificar.
	 */
	public void setCalificacion(Double calificacion) {
		this.calificacion = calificacion;
	}
	
	
}
