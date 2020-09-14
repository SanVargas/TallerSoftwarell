package conector;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 * <b>Descripción:<b> Clase encargada de realizar la conexión con la base de datos
 * @author 
 * @author 
 * @author Francisco Alejandro Hoyos Rojas
 * @version 1.0
 */
public class Conector {

	/**
	 * Constante que reprsenta la URL de la base de datos
	 */
	public static final String URL = "jdbc:mysql://localhost:3306/Libreria";
	/**
	 * Constante que reprsenta el usuario de la base de datos
	 */
	public static final String USER = "root";
	/**
	 * Constante que reprsenta la constraseña de la base de datos
	 */
	public static final String PASSWORD = "1234";

	
	/**
	 * Método encargado de establecer la conexión con la base de datos
	 * @return
	 */
	public static Connection establecerConexion() {
		Connection c = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c = (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Conexión exitosa con la base de datos");
		} catch (Exception e) {
			System.out.println("No se pudo realizar la conexión con la base de datos, verifique. error: " + e.getMessage());
		}
		return c;

	}

}