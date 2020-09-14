package app;

import conector.Conector;

/**
 * 
 * <b>Descripción:<b> Clase que representa la clase que inicializa la aplicación 
 * @author 
 * @author 
 * @author Francisco Alejandro Hoyos Rojas
 * @version 1.0
 */
public class Main {
	public static void main(String args[]) {
		Conector.establecerConexion();
		new TallerSoftwareII();
	}
}
