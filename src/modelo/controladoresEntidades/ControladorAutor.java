package modelo.controladoresEntidades;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import app.TallerSoftwareII;

/**
 * 
 * <b>Descripción:<b> Clase encargada de manejar la lógica de la entidad Autor
 * <b>Caso de Uso:<b> 
 * @author 
 * @author 
 * @author Francisco Alejandro Hoyos Rojas
 * @version 1.0
 */
public class ControladorAutor {

		
	/**
	 * Constructor de la clase.
	 * @param con
	 */
	public ControladorAutor() {

	}

	/**
	 * 
	 * Metodo encargado de insertar un autor
	 * @author Francisco Alejandro Hoyos Rojas
	 * 
	 * @param nombre nombre del autor a insertar
	 */
	public ArrayList<Long> insertarAutor(ArrayList<String> nombres) {
		String nombreTemp="";
		ArrayList<Long> idsAutores = new ArrayList<>();
		try {
			for(String nombre: nombres) {
				nombreTemp = nombre;
				String SQL = "INSERT INTO autor (nombreAutor) values (?)";
				PreparedStatement pst = TallerSoftwareII.conector.prepareStatement(SQL,Statement.RETURN_GENERATED_KEYS);
				pst.setString(1, nombre.toUpperCase());
				pst.execute();
				ResultSet rs = pst.getGeneratedKeys();
				if (rs != null && rs.next()) {
					idsAutores.add(rs.getLong(1));
				}
			}
		} catch (SQLException e) {
			System.out.println("Ocurrió un error al instar el autor " +nombreTemp+ " "+ e.getMessage());
		}
		return idsAutores;
	}
}