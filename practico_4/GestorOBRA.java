package practico_4;
import java.util.Scanner;
public class GestorOBRA {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		PINTURA pintura1 = new PINTURA(null, null, null, null, null, null, null);
		ESCULTURA escultura1 = new ESCULTURA (null, null, null, null, null, null, null, null);
		FOTOGRAFIA fotografia1 = new FOTOGRAFIA (null, null, null, null, null, null, null, null, null);
		
		System.out.println("--PINTURA--");
		System.out.println("Ingrese el nombre de la obra: ");
		String nomPin = sc.next();
		
		System.out.println("Ingrese autor: ");
		String autorPin = sc.next();
		
		System.out.println("Ingrese material utilizado: ");
		String matPin = sc.next();
		
		System.out.println("Ingrese precio: ");
		Double precioPin = sc.nextDouble();
		
		System.out.println("Ingrese sus dimensiones: ");
		String dimPin = sc.next();
		
		System.out.println("Ingrese el estilo artistico de la pintura: ");
		String estiloArt = sc.next();
		
		System.out.println("Ingrese la tecnica: ");
		String tecnica = sc.next();
		
		PINTURA(pintura1, nomPin, autorPin, matPin, precioPin, dimPin, estiloArt, tecnica);
		//-----------------------------------
		
		System.out.println(" ");
		System.out.println("--ESCULTURA--");
		System.out.println("Ingrese el nombre de la obra: ");
		String nomEsc = sc.next();
		
		System.out.println("Ingrese autor: ");
		String autorEsc = sc.next();
		
		System.out.println("Ingrese material utilizado: ");
		String matEsc = sc.next();
		
		System.out.println("Ingrese precio: ");
		Double precioEsc = sc.nextDouble();
		
		System.out.println("Ingrese sus dimensiones: ");
		String dimEsc = sc.next();
		
		System.out.println("Ingrese la escala");
		String escala = sc.next();
		
		System.out.println("Ingrese tipo: ");
		String tipo = sc.next();
		
		System.out.println("Ingrese el peso");
		Double peso = sc.nextDouble();
		ESCULTURA(escultura1, nomEsc, autorEsc, matEsc, precioEsc, dimEsc, escala, tipo, peso);
		
		//-----------------------------------
		
		System.out.println(" ");
		System.out.println("--PINTURA--");
		System.out.println("Ingrese el nombre de la obra: ");
		String nomFot = sc.next();
		
		System.out.println("Ingrese autor: ");
		String autorFot = sc.next();
		
		System.out.println("Ingrese material utilizado: ");
		String matFot = sc.next();
		
		System.out.println("Ingrese precio: ");
		Double precioFot = sc.nextDouble();
		
		System.out.println("Ingrese sus dimensiones: ");
		String dimFot = sc.next();
		
		System.out.println("Ingrese el tipo de cámara utilizada: ");
		String tipoCam = sc.next();
		
		System.out.println("Ingrese la relación de aspecto de la imagen: ");
		String relacionAspecto = sc.next();
		
		System.out.println("Ingrese la resolución de la imagen: ");
		String resolucion = sc.next();
		
		System.out.println("Ingrese el tipo de lente: ");
		String lente = sc.next();
		
		FOTOGRAFIA(fotografia1, nomEsc, autorEsc, matEsc, precioEsc, dimEsc, tipoCam, relacionAspecto, resolucion, lente);
		
		MuestreoDeDatos(pintura1, escultura1, fotografia1);
		
	}

	public static void PINTURA (PINTURA P, String n, String a, String m, Double p, String d, String e, String t) {
		
		P.setNombre(n);
		P.setAutor(a);
		P.setMaterial(m);
		P.setPrecio(p);
		P.setDimensiones(d);
		P.setEstiloArtistico(e);
		P.setTecnica(t);	
	}
	public static void ESCULTURA (ESCULTURA E, String n, String a, String m, Double p, String dimEsc, String e, String t, Double peso) {
		
		E.setNombre(n);
		E.setAutor(a);
		E.setMaterial(m);
		E.setPrecio(p);
		E.setDimensiones(dimEsc);
		E.setEscala(e);
		E.setTipo(t);	
		E.setPeso(peso);
}
	public static void FOTOGRAFIA (FOTOGRAFIA F, String n, String a, String m, Double p, String d, String tipo, String rP, String res, String lente) {
		
		F.setNombre(n);
		F.setAutor(a);
		F.setMaterial(m);
		F.setPrecio(p);
		F.setDimensiones(d);
		F.setTipoCam(tipo);
		F.setRelacionApecto(rP);
		F.setResolucion(res);
		F.setLente(lente);
}
	
	public static void MuestreoDeDatos(PINTURA P, ESCULTURA E, FOTOGRAFIA F) {
		
		System.out.println(" ");
		System.out.println("--PINTURA--");
		System.out.println("Nombre: " + P.getNombre());
		System.out.println("Autor: " +  P.getAutor());
		System.out.println("Material: " + P.getMaterial());
		System.out.println("Precio: " + P.getPrecio());
		System.out.println("Dimensiones: " + P.getDimensiones());
		System.out.println("Estilo artístico: " + P.getEstiloArtistico());
		System.out.println("Técnica: " + P.getTecnica());
		System.out.println(" ");
		
		//-----------------------------------
		
		System.out.println("--REVISTA--");
		System.out.println("Nombre: " + E.getNombre());
		System.out.println("Autor: " +  E.getAutor());
		System.out.println("Material: " + E.getMaterial());
		System.out.println("Precio: " + E.getPrecio());
		System.out.println("Dimensiones: " + E.getDimensiones());
		System.out.println("Escala: " + E.getEscala());
		System.out.println("Tipo: " + E.getTipo());
		System.out.println("Peso: " + E.getPeso());
		System.out.println(" ");
		
		//-----------------------------------
		
		System.out.println("--ARTICULO CIENTÍFICO--");
		System.out.println("Nombre: " + F.getNombre());
		System.out.println("Autor: " +  F.getAutor());
		System.out.println("Material: " + F.getMaterial());
		System.out.println("Precio: " + F.getPrecio());
		System.out.println("Dimensiones: " + F.getDimensiones());
		System.out.println("Tipo de cámara: " + F.getTipoCam());
		System.out.println("Relación de aspecto: " + F.getRelacionApecto());
		System.out.println("Resolución: " + F.getResolucion());
		
	}
	
	
	
	}


