package src;

public class Auto extends Vehiculo {
String cantidadPuertas;

public String getCantidadPuertas() {
	return cantidadPuertas;
}

public void setCantidadPuertas(String cantidadPuertas) {
	this.cantidadPuertas = cantidadPuertas;
}
public Auto (String marca, String modelo, String color, int anio, String cantidadPuertas) {
super(marca, modelo, color, anio);
this.cantidadPuertas = cantidadPuertas;

}}
