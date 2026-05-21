package src;

public class Triangulo extends FiguraGeometrica {
	private Double lado1, lado2, lado3, altura;

	public Double getLado1() {
		return lado1;
	}

	public void setLado1(Double lado1) {
		this.lado1 = lado1;
	}

	public Double getLado2() {
		return lado2;
	}

	public void setLado2(Double lado2) {
		this.lado2 = lado2;
	}

	public Double getLado3() {
		return lado3;
	}

	public void setLado3(Double lado3) {
		this.lado3 = lado3;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Triangulo(Double perimetro, Double area, String color, Double lado1, Double lado2, Double lado3,
			Double altura) {
		super(perimetro, area, color);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.altura = altura;
	}

}
