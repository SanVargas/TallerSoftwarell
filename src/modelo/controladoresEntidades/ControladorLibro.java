package modelo.controladoresEntidades;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import app.TallerSoftwareII;

/**
 * 
 * <b>Descripción:<b> Clase encargada de manejar la lógica de la entidad Libro
 * @author 
 * @author 
 * @author Francisco Alejandro Hoyos Rojas
 * @version 1.0
 */
public class ControladorLibro {

	/**
	 * 
	 * Método encargado de insertar un libro
	 * @author Francisco Alejandro Hoyos Rojas
	 * 
	 * @param nombre nombre del autor a insertar
	 */
	public void insertarLibro(String titulo,ArrayList<String> autores, Integer isbn) {
		try {
			Long idLibro;
			Long idProducto = new ControladorProducto().insertarProducto("LIBRO", 0, 0.0);
			ArrayList<Long> idsAutores = new ControladorAutor().insertarAutor(autores);
			
			String SQL = "INSERT INTO libro (titulo,isbn,idproducto) values (?,?,?)";
			PreparedStatement pst = TallerSoftwareII.conector.prepareStatement(SQL,Statement.RETURN_GENERATED_KEYS);
			pst.setString(1, titulo.toUpperCase());
			pst.setString(2, isbn.toString());
			pst.setString(3, idProducto.toString());
			pst.execute();
			ResultSet rs = pst.getGeneratedKeys();
			if (rs != null && rs.next()) {
				idLibro = rs.getLong(1);
				for(Long idAutor: idsAutores) {
					SQL = "INSERT INTO libro_autor (idLibro,idAutor) values (?,?)";
					pst = TallerSoftwareII.conector.prepareStatement(SQL);
					pst.setString(1, idLibro.toString());
					pst.setString(2, idAutor.toString());
					pst.execute();
				}
			}	
		} catch (SQLException e) {
			System.out.println("Ocurio un error al insertar el libro " +titulo+ " "+ e.getMessage());
		}
	}
	
}
