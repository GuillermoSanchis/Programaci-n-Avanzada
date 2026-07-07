package junio;

public class Alimento extends producto {

	String fechaVencimiento, calorias;
	Double peso;
	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getCalorias() {
		return calorias;
	}

	public void setCalorias(String calorias) {
		this.calorias = calorias;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Alimento(String nombreProducto, String codigo, int stock, Double precio, String fechaVencimiento, String calorias, Double peso) {
		super(nombreProducto, codigo, stock, precio);
		this.fechaVencimiento = fechaVencimiento;
		this.calorias = calorias;
		this.peso = peso;
	}
	
	
}
