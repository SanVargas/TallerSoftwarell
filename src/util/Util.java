package util;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 * <b>Descripción:<b> Clase utilizada para manejar método globales
 * @author
 * @author
 * @author Francisco Alejandro Hoyos Rojas
 * @version 1.0
 */
public final class Util {
	
	/**
	 * 
	 * Método encargado de obtener un id después de persistir una entidad
	 * @author Francisco Alejandro Hoyos rojas
	 * 
	 * @param pst
	 * @return id de la entidad persistida
	 */
	public static Long obtenerIdGenerado(PreparedStatement pst) {
		try {
			ResultSet rs = pst.getGeneratedKeys();
			if (rs != null && rs.next()) {
				return rs.getLong(1);
			}
		} catch (SQLException e) {
			System.out.println("Ocurrió un error al obtener el id " + e.getMessage());
		}
		return null;
	}
}
