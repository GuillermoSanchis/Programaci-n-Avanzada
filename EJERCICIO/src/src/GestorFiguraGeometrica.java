package src;

public class GestorFiguraGeometrica {
	public static void main(String[] args) {
		Circulo circulo1 = new Circulo (25.13 , 50.27, "Rojo", 4.0, 8.0);
		System.out.println(circulo1.getPerimetro() + circulo1.getArea() + circulo1.getColor() + circulo1.getRadio() + circulo1.getDiametro());
	}
}
