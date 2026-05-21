package src;

public class GestorVehiculo {
	public static void main(String[] args) {
		Moto moto1 = new Moto ("Honda", "Wave 110s", "Negro", 2014, "Sin cambios");
		System.out.println(moto1.getMarca() + moto1.getModelo() + moto1.getColor() + moto1.getAnio() + moto1.getTipo());
	}

}
