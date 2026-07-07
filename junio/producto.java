package junio;

public abstract class producto {
	
	String nombreProducto, codigo; 
	int stock;
	Double precio;
	
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public producto(String nombreProducto, String codigo, int stock, Double precio) {
		super();
		this.nombreProducto = nombreProducto;
		this.codigo = codigo;
		this.stock = stock;
		this.precio = precio;
	}
	
	
	

}
