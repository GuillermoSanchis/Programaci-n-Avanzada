package practico_4;

public class ESCULTURA extends OBRA_ARTE {
	String escala, tipo;
	Double peso;
	
	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getEscala() {
		return escala;
	}

	public void setEscala(String escala) {
		this.escala = escala;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public ESCULTURA(String nombre, String autor, String material, Double precio, String dimensiones, Double peso,
			String escala, String tipo) {
		super(nombre, autor, material, precio, dimensiones);
		this.peso = peso;
		this.escala = escala;
		this.tipo = tipo;
	}
	
	
}
