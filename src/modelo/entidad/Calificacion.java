package modelo.entidad;

public enum Calificacion{
	
	UNO("1"),DOS("2"),TRES("3"),CUATRO("4"),CINCO("5");
	
	private String nombre;

	private Calificacion(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nombre;
	}
}
