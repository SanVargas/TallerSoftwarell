package modelo.controladoresEntidades;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import app.TallerSoftwareII;
import util.Util;

/**
 * 
 * <b>Descripción:<b> Clase encargada de manejar la lógica de la entidad Resena
 * @author 
 * @author 
 * @author Francisco Alejandro Hoyos Rojas
 * @version 1.0
 */
public class ControladorResena {
	
	public Long insertarResena(String nombreUsuario, String resena, Long idLibro) {
		try {
			String SQL = "INSERT INTO Resena (nombreUsuario, resena, idLibro) values (?,?,?)";
			PreparedStatement pst = TallerSoftwareII.conector.prepareStatement(SQL,Statement.RETURN_GENERATED_KEYS);
			pst.setString(1, nombreUsuario);
			pst.setString(2, resena);
			pst.setString(3, idLibro.toString());
			pst.execute();
			return Util.obtenerIdGenerado(pst);
		} catch (SQLException e) {
			System.out.println("Ocurrió un error al insertar el producto" + e.getMessage());
		}
		return null;
	}
	
}
