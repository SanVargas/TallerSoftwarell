package app;

import java.sql.Connection;
import conector.Conector;

/**
 * <b>Descripción:<b> Clase principal
 * @author 
 * @author 
 * @author Francisco Alejandro Hoyos Rojas
 * @version 1.0
 */
public class TallerSoftwareII {

	/**
	 * Atributo que representa la conexión a la base de datos
	 */
	public static Connection conector;

	/**
	 * Constructor de la clase.
	 */
	public TallerSoftwareII() {
		conector = Conector.establecerConexion();
	}

	/**
	 * Metodo encargado de retornar el valor del atributo conector
	 * @return El conector asociado a la clase
	 */
	public Connection getConector() {
		return conector;
	}
	
	public void generarDatos() {
		// TODO
	}
	
}
