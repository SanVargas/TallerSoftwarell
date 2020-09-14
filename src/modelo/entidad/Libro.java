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
	
	/**
	 * Constructor de la clase.
	 * @param idLibro id del libro
	 * @param producto llave con producto
	 * @param titulo titulo del libro
	 * @param autores autores del libro
	 * @param isbn isbn del libro
	 */
	public Libro(Long idLibro, Producto producto, String titulo, ArrayList<Autor> autores, String isbn) {
		super();
		this.idLibro = idLibro;
		this.producto = producto;
		this.titulo = titulo;
		this.autores = autores;
		this.isbn = isbn;
	}
	/**
	 * Atributo que representa el id de un libro
	 */
	private Long idLibro;
	/**
	 * Atributo que representa la llave con producto
	 */
	private Producto producto;
	/**
	 * Atributo que representa el título de un libro
	 */
	private String titulo;
	/**
	 * Atributo que representa los autores del libro
	 */
	private ArrayList<Autor>autores;
	/**
	 * Atributo que representa el isbn de un libro
	 */
	private String isbn;
	/**
	 * Metodo encargado de retornar el valor del atributo idLibro
	 * @return El idLibro asociado a la clase
	 */
	public Long getIdLibro() {
		return idLibro;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo idLibro
	 * @param idLibro El nuevo idLibro a modificar.
	 */
	public void setIdLibro(Long idLibro) {
		this.idLibro = idLibro;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo producto
	 * @return El producto asociado a la clase
	 */
	public Producto getProducto() {
		return producto;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo producto
	 * @param producto El nuevo producto a modificar.
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo titulo
	 * @return El titulo asociado a la clase
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo titulo
	 * @param titulo El nuevo titulo a modificar.
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo autores
	 * @return El autores asociado a la clase
	 */
	public ArrayList<Autor> getAutores() {
		return autores;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo autores
	 * @param autores El nuevo autores a modificar.
	 */
	public void setAutores(ArrayList<Autor> autores) {
		this.autores = autores;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo isbn
	 * @return El isbn asociado a la clase
	 */
	public String getIsbn() {
		return isbn;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo isbn
	 * @param isbn El nuevo isbn a modificar.
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
}
