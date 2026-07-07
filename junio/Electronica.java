package junio;

public class Electronica extends producto {

	String garantia, marcaElectronico, modeloElectronico; 
	int anio;
	
	public String getGarantia() {
		return garantia;
	}
	public void setGarantia(String garantia) {
		this.garantia = garantia;
	}
	public String getMarcaElectronico() {
		return marcaElectronico;
	}
	public void setMarcaElectronico(String marcaElectronico) {
		this.marcaElectronico = marcaElectronico;
	}
	public String getModeloElectronico() {
		return modeloElectronico;
	}
	public void setModeloElectronico(String modeloElectronico) {
		this.modeloElectronico = modeloElectronico;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public Electronica(String nombreProducto, String codigo, int stock, Double precio, String garantia, String marcaElectronico, String modeloElectronico, int anio) {
		super(nombreProducto, codigo, stock, precio);
		this.garantia = garantia;
		this.marcaElectronico = marcaElectronico;
		this.modeloElectronico = modeloElectronico;
		this.anio = anio;
	}
	
	
}
