package practico_3;

import java.util.Scanner;

public class GestorEDIFICIO {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		CASA casa1 = new CASA(null, null, null, 0, null, 0, null);
		APARTAMENTO apartamento1 = new APARTAMENTO(null, null, null, 0, 0, 0);
		
		CASA casaArreglo[] = new CASA[10];
		APARTAMENTO apartamentoArreglo[] = new APARTAMENTO[10];

		int opcion = 0;
		do { System.out.println(" ");
			System.out.println("----------------");
			System.out.println("--PROGRAMITA--");
			System.out.println("1. Alta de casa");
			System.out.println("2. Alta de apartamento");
			System.out.println("3. Lista de instancias registradas");
			System.out.println("4. Borrar casa guardada");
			System.out.println("5. Modificar dato de una casa existente");
			System.out.println("6. Borrar apartamento guardado");
			System.out.println("7. Modificar dato de un apartamento existente");
			System.out.println("8. Salir...");
			System.out.println("----------------");
			System.out.println(" ");
			opcion = sc.nextInt();


			switch (opcion) {

			case 1:

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
				break;
				
			case 2:
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
				int nroAp = sc.nextInt();
				System.out.println("Ingrese el nro de piso: ");
				int piso = sc.nextInt();
				APARTAMENTO(apartamento1, direccionAp, tamanioAp, precioAp, habitacionesAp, nroAp, piso);
				break;

			case 3:
				Muestreo(casa1, apartamento1);
				break;

			case 4:
				System.out.println("Ingrese id de la casa a eliminar: ");
				String idCasaBorrar = sc.next();
				BajaCASA(idCasaBorrar, casaArreglo);
				break;
				
			case 5:
				System.out.println("Ingrese id de la casa que desea modificar dato: ");
				String id = sc.next();
				int datoParaModificar;
				System.out.println("Elija el dato que desea modificar: ");
				System.out.println("1. Cantidad de habitaciones");
				System.out.println("2. Tamaño de la casa");
				datoParaModificar = sc.nextInt();
				int nuevaCant = 0;
				Double nuevoTamanio = 0.0;
				if (datoParaModificar == 1) {
					System.out.println("Ingrese la nueva cantidad de habitaciones: ");
					nuevaCant = sc.nextInt();
				} else {
					System.out.println("Ingrese el nuevo tamaño: ");
					nuevoTamanio = sc.nextDouble();
				}
				ModificarCASA(casaArreglo, id, datoParaModificar, nuevaCant, nuevoTamanio);
				break;
				
			case 6:
				System.out.println("Ingrese el nro del apartamento a eliminar: ");
				int nroApBorrar = sc.nextInt();
				BajaAPARTAMENTO(nroApBorrar, apartamentoArreglo);
				break;
				
			case 7:
				System.out.println("Ingrese id de la casa que desea modificar dato: ");
				int nroApa = sc.nextInt();
				int datoParaModificarApa = 0;
				System.out.println("Elija el dato que desea modificar: ");
				System.out.println("1. Cantidad de habitaciones");
				System.out.println("2. Tamaño de la casa");
				datoParaModificar = sc.nextInt();
				Double nuevoPrecio = 0.0;
				int nuevaCantHabitaciones = 0;
				if (datoParaModificar == 1) {
					System.out.println("Ingrese la nueva cantidad de habitaciones: ");
					nuevoPrecio = sc.nextDouble();
				} else {
					System.out.println("Ingrese el nuevo tamaño: ");
					nuevaCantHabitaciones = sc.nextInt();
				}
				ModificarAPARTAMENTO(apartamentoArreglo, nroApa, datoParaModificarApa, nuevoPrecio, nuevaCantHabitaciones);
				break;
				
			case 8:
				System.out.println("Saliendo...");
				break;
			}
		} while (opcion != 8);
		

	
	}

	public static void CASA(CASA c, String dCasa, Double tamanioC, Double precioC, int habitacionesC, Double terreno,
			String idC, int pisosC) {
		c.setDireccion(dCasa);
		c.setTamanio(tamanioC);
		c.setPrecio(precioC);
		c.setCantHabitaciones(habitacionesC);
		c.setTerrenoTamanio(terreno);
		c.setIdCasa(idC);
		c.setPisos(pisosC);

	}

	public static void APARTAMENTO(APARTAMENTO ap, String dAp, Double tamanioAp, Double precioAp, int habitacionesAp,
			int nroAp, int nroPiso) {
		ap.setDireccion(dAp);
		ap.setTamanio(tamanioAp);
		ap.setPrecio(precioAp);
		ap.setCantHabitaciones(habitacionesAp);
		ap.setPiso(nroPiso);
		ap.setNroApartamento(nroAp);

	}

	public static void Muestreo(CASA c, APARTAMENTO ap) {

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
	
	public static void BajaCASA(String idCasa, CASA[] c) {

		for (int i = 0; i < c.length; i++) {
			if (c[i].getIdCasa() == idCasa) {
				c[i] = null;
				System.out.println("Casa eliminado exitosamente");
				System.out.println(" ");
				break;
			}}
				}
	
	public static void BajaAPARTAMENTO(int nroApartamento, APARTAMENTO[] a) {

		for (int i = 0; i < a.length; i++) {
			if (a[i].getNroApartamento() == nroApartamento) {
				a[i] = null;
				System.out.println("Casa eliminado exitosamente");
				System.out.println(" ");
				break;
			}}
				}
	public static void ModificarCASA(CASA[] c, String idCasa, int datoParaModificar, int nuevaCantHabitaciones,
			Double nuevoTamanio) {
		for (int i = 0; i < c.length; i++) {
			if (c[i] != null && c[i].getIdCasa() == idCasa) {
				System.out.println("Dato modificado exitosamente :D");
				if (datoParaModificar == 1) {
					c[i].setCantHabitaciones(nuevaCantHabitaciones);

				} else {
					c[i].setTamanio(nuevoTamanio);

				}

			}

		}

	}
	public static void ModificarAPARTAMENTO(APARTAMENTO[] a, int nroAp, int datoParaModificar, Double nuevoPrecio,
			int nuevaCantHabitaciones) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null && a[i].getNroApartamento() == nroAp) {
				System.out.println("Dato modificado exitosamente :D");
				if (datoParaModificar == 1) {
					a[i].setPrecio(nuevoPrecio);

				} else {
					a[i].setCantHabitaciones(nuevaCantHabitaciones);

				}

			}

		}

	}
}
