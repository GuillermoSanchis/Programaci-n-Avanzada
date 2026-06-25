package practico_4;

public abstract class OBRA_ARTE {
	
	String nombre, autor, material;
	Double precio;
	String dimensiones;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getDimensiones() {
		return dimensiones;
	}
	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}
	public OBRA_ARTE(String nombre, String autor, String material, Double precio, String dimensiones) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.material = material;
		this.precio = precio;
		this.dimensiones = dimensiones;
	}

	
	
}
