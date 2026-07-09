package acciones;
import java.util.Scanner;
public class GESTOR {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		DINOSAURIO dino = new DINOSAURIO("Pepe");
		PERRO perrito = new PERRO("Simon");
		
		int opcion = 0;
		
		do {System.out.println(" ");
			System.out.println("----------------");
			System.out.println("--PROGRAMITA--");
			System.out.println("1. Alimentar");
			System.out.println("2. Dormir");
			System.out.println("3. Salir...");
			System.out.println("----------------");
			System.out.println(" ");
			opcion = sc.nextInt();
			
			switch(opcion) {
			
			case 1:
				int animalAlimentar;
				System.out.println("¿Qué animal desea alimentar?");
				System.out.println("1. Perro");
				System.out.println("2. Dinosaurio");
				animalAlimentar = sc.nextInt();
				
				if (animalAlimentar==1) {
					perrito.comer();
					System.out.println("Perro comiendo...");
				} 
				
				if(animalAlimentar==2){
					dino.comer();
					System.out.println("Dinosaurio comiendo...");
				}
				break;
				
			case 2:
				int animalDormir;
				System.out.println("¿Qué animal desea que duerma?");
				System.out.println("1. Perro");
				System.out.println("2. Dinosaurio");
				animalDormir = sc.nextInt();
				
				if (animalDormir==1) {
					perrito.comer();
					System.out.println("Perro durmiendo...");
				} 
				if(animalDormir==2){
					dino.comer();
					System.out.println("Dinosaurio durmiendo...");
				}
				break;
			}
			
		} while (opcion!=3);
	}
 
}
