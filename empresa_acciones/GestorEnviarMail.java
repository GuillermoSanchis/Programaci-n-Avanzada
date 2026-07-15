package empresa_acciones;
import java.util.Scanner;
public class GestorEnviarMail {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Duenio duenio = new Duenio(3);
		Encargado encargado = new Encargado(2);
		Empleados empleado = new Empleados(1);
		
		int opcion = 0;
		
		do {System.out.println(" ");
			System.out.println("----------------");
			System.out.println("--MAIL--");
			System.out.println("1. Enviar mail");
			System.out.println("2. Salir...");
			System.out.println("----------------");
			System.out.println(" ");
			opcion = sc.nextInt();
			
			switch(opcion) {
			
			case 1:
				int rangoID;
				System.out.println("Ingrese ID de su rango en la empresa:");
				rangoID = sc.nextInt();
				
				//1Empleado
				//2Encargado
				//3Dueño
				
				
				if (rangoID==empleado.getIdEmpleado()) {
					empleado.envairMail();
				} 
				
				if (rangoID==encargado.getIdEncargado()) {
					int destinatario;
					System.out.println("Ingrese ID del rango al que desee enviar el mail:");
					System.out.println("(3) Dueño");
					System.out.println("(1) Empleado");
					destinatario = sc.nextInt();
				if (destinatario==duenio.getIdDuenio()) {
					encargado.envairMail();
				}
				if (destinatario==empleado.getIdEmpleado()) {
					encargado.envairMail();
				}}
				
				if (rangoID==duenio.getIdDuenio()) {
					duenio.envairMail();
				}
				break;
				
			case 2:
				System.out.println("Saliendo...");
				break;
				
			default:
				System.out.println("Opción inválida...");
				break;
			}
			
		} while (opcion!=2);
	
	}

}
