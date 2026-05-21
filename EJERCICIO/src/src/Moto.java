package src;

public class Moto extends Vehiculo {
	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Moto(String marca, String modelo, String color, int anio, String tipo) {
		super(marca, modelo, color, anio);
		this.tipo = tipo;
	}
}
