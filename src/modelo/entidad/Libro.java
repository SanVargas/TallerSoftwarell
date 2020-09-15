package modelo.entidad;

import java.util.ArrayList;

/**
 * <b>Descripción:<b> Clase que representa la entidad Libro
 * @author 
 * @author 
 * @author Francisco Alejandro Hoyos Rojas
 * @version 1.0
 */
public class Libro {
	
	private String titulo;
	
	private String ISBN;
	
	private ArrayList<Autor>autores;
	
	/**
	 * Constructor de la clase.
	 * @param idLibro id del libro
	 * @param producto llave con producto
	 * @param titulo titulo del libro
	 * @param autores autores del libro
	 * @param isbn isbn del libro
	 */
	public Libro(String titulo, ArrayList<Autor> autores, String iSBN) {
		super();
		this.titulo = titulo;
		this.autores = autores;
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public ArrayList<Autor> getAutores() {
		return autores;
	}

	public void setAutores(ArrayList<Autor> autores) {
		this.autores = autores;
	}
	
}
