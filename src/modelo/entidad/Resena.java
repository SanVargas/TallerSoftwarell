package modelo.entidad;

/**
 * <b>Descripción:<b> Clase que representa una reseña de un libro
 * @author 
 * @author 
 * @author Francisco Alejandro Hoyos Rojas
 * @version 1.0
 */
public class Resena {
	
	private String idReseña;
	private String descripcion;
	private String idUsuario;
	private String nombreUsuario;
	
	public Resena(String idReseña, String descripcion, String idUsuario, String nombreUsuario) {
		super();
		this.idReseña = idReseña;
		this.descripcion = descripcion;
		this.idUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
	}

	public String getIdReseña() {
		return idReseña;
	}

	public void setIdReseña(String idReseña) {
		this.idReseña = idReseña;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
}
