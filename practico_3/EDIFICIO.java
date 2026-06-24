package practico_3;

public abstract class EDIFICIO {
	
	String direccion;
	Double tamanio, precio;
	int cantHabitaciones;
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Double getTamanio() {
		return tamanio;
	}
	public void setTamanio(Double tamanio) {
		this.tamanio = tamanio;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public int getCantHabitaciones() {
		return cantHabitaciones;
	}
	public void setCantHabitaciones(int cantHabitaciones) {
		this.cantHabitaciones = cantHabitaciones;
	}
	public EDIFICIO(String direccion, Double tamanio, Double precio, int cantHabitaciones) {
		super();
		this.direccion = direccion;
		this.tamanio = tamanio;
		this.precio = precio;
		this.cantHabitaciones = cantHabitaciones;
	}
	
	
}
