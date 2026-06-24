package practico_3;

public class CASA extends EDIFICIO{
	String idCasa;
	int pisos;
	Double terrenoTamanio;
	
	
	public String getIdCasa() {
		return idCasa;
	}
	public void setIdCasa(String idCasa) {
		this.idCasa = idCasa;
	}
	public int getPisos() {
		return pisos;
	}
	public void setPisos(int pisos) {
		this.pisos = pisos;
	}
	public Double getTerrenoTamanio() {
		return terrenoTamanio;
	}
	public void setTerrenoTamanio(Double terrenoTamanio) {
		this.terrenoTamanio = terrenoTamanio;
	}
	public CASA(String direccion, Double tamanio, Double precio, int cantHabitaciones, String idCasa, int pisos,
			Double terrenoTamanio) {
		super(direccion, tamanio, precio, cantHabitaciones);
		this.pisos = pisos;
		this.terrenoTamanio = terrenoTamanio;
	}
	
	
}
