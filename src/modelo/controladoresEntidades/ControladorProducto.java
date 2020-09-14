package modelo.controladoresEntidades;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import app.TallerSoftwareII;
import util.Util;

public class ControladorProducto {

	
	
	/**
	 * Constructor de la clase.
	 */
	public ControladorProducto() {
		
	}

	/**
	 * 
	 * Método encargado de insertar un producto
	 * @author Francisco Alejandro Hoyos Rojas
	 * 
	 * @param nombre nombre del autor a insertar
	 */
	public Long insertarProducto(String tipoProducto, Integer numeroCalificaciones, Double calificacion) {
		try {
			String SQL = "INSERT INTO producto (tipoProducto, numeroCalificaciones, calificacion) values (?,?,?)";
			PreparedStatement pst = TallerSoftwareII.conector.prepareStatement(SQL,Statement.RETURN_GENERATED_KEYS);
			pst.setString(1, tipoProducto.toUpperCase());
			pst.setString(2, numeroCalificaciones.toString());
			pst.setString(3, calificacion.toString());
			pst.execute();
			return Util.obtenerIdGenerado(pst);
		} catch (SQLException e) {
			System.out.println("Ocurrió un error al insertar el producto" + e.getMessage());
		}
		return null;
	}
}