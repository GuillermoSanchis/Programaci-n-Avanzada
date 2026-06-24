package practico_3;

public class APARTAMENTO extends EDIFICIO{

	int piso, nroApartamento;

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public int getNroApartamento() {
		return nroApartamento;
	}

	public void setNroApartamento(int nroApartamento) {
		this.nroApartamento = nroApartamento;
	}

	public APARTAMENTO(String direccion, Double tamanio, Double precio, int cantHabitaciones, int piso,
			int nroApartamento) {
		super(direccion, tamanio, precio, cantHabitaciones);
		this.piso = piso;
		this.nroApartamento = nroApartamento;
	}

	
}
