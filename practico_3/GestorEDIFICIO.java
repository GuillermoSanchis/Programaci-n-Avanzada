package practico_3;

import java.util.Scanner;

import practico_2.LIBRO;
import practico_2.REVISTA;

public class GestorEDIFICIO {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		CASA casa1 = new CASA(null, null, null, 0, null, 0, null);
		APARTAMENTO apartamento1 = new APARTAMENTO(null, null, null, 0, 0, 0);

		System.out.println("--CASA--");
		System.out.println("Ingrese dirección: ");
		String direccionCasa = sc.next();
		System.out.println("Ingrese tamaño: ");
		Double tamanioCasa = sc.nextDouble();
		System.out.println("Ingrese el precio: ");
		Double precioCasa = sc.nextDouble();
		System.out.println("Ingrese la cantidad de habitaciones: ");
		int habitacionesCasa = sc.nextInt();
		System.out.println("Ingrese tamaño del terreno: ");
		Double tamanioTerreno = sc.nextDouble();
		System.out.println("Ingrese id de la casa: ");
		String idCasa = sc.next();
		System.out.println("Ingrese la cantidad de pisos: ");
		int cantPisos = sc.nextInt();
		CASA(casa1, direccionCasa, tamanioCasa, precioCasa, habitacionesCasa, tamanioTerreno, idCasa, cantPisos);

		System.out.println(" ");
		System.out.println("--APARTAMENTO--");
		System.out.println("Ingrese dirección: ");
		String direccionAp = sc.next();
		System.out.println("Ingrese tamaño: ");
		Double tamanioAp = sc.nextDouble();
		System.out.println("Ingrese el precio: ");
		Double precioAp = sc.nextDouble();
		System.out.println("Ingrese la cantidad de habitaciones: ");
		int habitacionesAp = sc.nextInt();
		System.out.println("Ingrese el nro de apartamemnto: ");
		int nroAp= sc.nextInt();
		System.out.println("Ingrese el nro de piso: ");
		int piso = sc.nextInt();
		APARTAMENTO(apartamento1, direccionAp, tamanioAp, precioAp, habitacionesAp, nroAp, piso);
		
		Muestreo(casa1, apartamento1);
	}

	public static void CASA(CASA c, String dCasa, Double tamanioC, Double precioC, int habitacionesC, Double terreno, String idC, int pisosC) {
		c.setDireccion(dCasa);
		c.setTamanio(tamanioC);
		c.setPrecio(precioC);
		c.setCantHabitaciones(habitacionesC);
		c.setTerrenoTamanio(terreno);
		c.setIdCasa(idC);
		c.setPisos(pisosC);

	}

	public static void APARTAMENTO(APARTAMENTO ap, String dAp, Double tamanioAp, Double precioAp, int habitacionesAp, int nroAp, int nroPiso ) {
		ap.setDireccion(dAp);
		ap.setTamanio(tamanioAp);
		ap.setPrecio(precioAp);
		ap.setCantHabitaciones(habitacionesAp);
		ap.setPiso(nroPiso);
		ap.setNroApartamento(nroAp);

	}
	
	public static void Muestreo (CASA c, APARTAMENTO ap) {
		
		System.out.println(" ");
		System.out.println("--CASA--");
		System.out.println("Direccion: " + c.getDireccion());
		System.out.println("Tamaño: " + c.getTamanio());
		System.out.println("Precio: " + c.getPrecio());
		System.out.println("Habitaciones: " + c.getCantHabitaciones());
		System.out.println("Tamaño del terreno: " + c.getTerrenoTamanio());
		System.out.println("ID: " + c.getIdCasa());
		System.out.println("Pisos: " + c.getPisos());
		System.out.println(" ");
		
		System.out.println("--APARTAMENTO--");
		System.out.println("Direccion: " + ap.getDireccion());
		System.out.println("Tamaño: " + ap.getTamanio());
		System.out.println("Precio: " + ap.getPrecio());
		System.out.println("Habitaciones: " + ap.getCantHabitaciones());
		System.out.println("Piso: " + ap.getPiso());
		System.out.println("Nro de apartamento: " + ap.getNroApartamento());
		
	}
}
