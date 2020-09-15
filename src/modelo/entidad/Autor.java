package modelo.entidad;

import java.util.ArrayList;

/**
 * <b>Descripción:<b> Clase que representa la entidad Autor
 * @author 
 * @author 
 * @author Francisco Alejandro Hoyos Rojas
 * @version 1.0
 */
public class Autor {
	
	private String idAutor;
	private String nombreAutor;
	private ArrayList<Libro> libros;
	
	public Autor(String idAutor, String nombreAutor, ArrayList<Libro> libros) {
		super();
		this.idAutor = idAutor;
		this.nombreAutor = nombreAutor;
		this.libros = libros;
	}

	public String getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(String idAutor) {
		this.idAutor = idAutor;
	}

	public String getNombreAutor() {
		return nombreAutor;
	}

	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}

	public ArrayList<Libro> getLibros() {
		return libros;
	}

	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}

}
