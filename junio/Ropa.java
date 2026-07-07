package junio;

public class Ropa extends producto{
	
	String marcaRopa, modeloRopa, talle, color, material;

	public String getMarcaRopa() {
		return marcaRopa;
	}

	public void setMarcaRopa(String marcaRopa) {
		this.marcaRopa = marcaRopa;
	}

	public String getModeloRopa() {
		return modeloRopa;
	}

	public void setModeloRopa(String modeloRopa) {
		this.modeloRopa = modeloRopa;
	}

	public String getTalle() {
		return talle;
	}

	public void setTalle(String talle) {
		this.talle = talle;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	

	public Ropa(String nombreProducto, String codigo, int stock, Double precio, String marcaRopa, String modeloRopa, String talle, String color, String material) {
		super(nombreProducto, codigo, stock, precio);
		this.marcaRopa = marcaRopa;
		this.modeloRopa = modeloRopa;
		this.talle = talle;
		this.color = color;
		this.material = material;
	}
	
	

}
