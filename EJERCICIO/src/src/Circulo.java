package src;

public class Circulo extends FiguraGeometrica {
	private Double radio, diametro;

	public Double getRadio() {
		return radio;
	}

	public void setRadio(Double radio) {
		this.radio = radio;
	}

	public Double getDiametro() {
		return diametro;
	}

	public void setDiametro(Double diametro) {
		this.diametro = diametro;
	}

	public Circulo(Double perimetro, Double area, String color, Double radio, Double diametro) {
		super(perimetro, area, color);
		this.radio = radio;
		this.diametro = diametro;

	}
}
