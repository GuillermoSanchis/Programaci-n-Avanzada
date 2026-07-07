package practico_2;

import java.util.Scanner;

public class GestorPublicacion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		LIBRO libro1 = new LIBRO(0, null, null, null, null, 0);
		REVISTA revista1 = new REVISTA(0, null, null, null, 0, null);
		ARTICULO_CIENTIFICO articulo_cientifico1 = new ARTICULO_CIENTIFICO(0, null, null, null, null, null, null, null);

		LIBRO libroArreglo[] = new LIBRO[10];
		REVISTA revistaArreglo[] = new REVISTA[10];
		ARTICULO_CIENTIFICO articulo_cientificoArreglo[] = new ARTICULO_CIENTIFICO[10];

		int opcion = 0;
		do {System.out.println(" ");
			System.out.println("----------------");
			System.out.println("--PROGRAMITA--");
			System.out.println("1. Alta de libro");
			System.out.println("2. Alta de revista");
			System.out.println("3. Alta de artículo aientífico");
			System.out.println("4. Lista de instancias registradas");
			System.out.println("5. Borrar libro guardado");
			System.out.println("6. Borrar revista guardada");
			System.out.println("7. Borrar artículo guardado");
			System.out.println("8. Modificar dato de un libro");
			System.out.println("9. Modificar dato de una revista");
			System.out.println("10. Modificar dato de un artículo");
			System.out.println("11. Salir...");
			System.out.println("----------------");
			System.out.println(" ");
			opcion = sc.nextInt();


			switch (opcion) {

			case 1:

				System.out.println("--LIBRO--");
				System.out.println("Ingrese año de publicación: ");
				int anioLibro = sc.nextInt();
				System.out.println("Ingrese titulo: ");
				String tituloLibro = sc.next();
				System.out.println("Ingrese autor: ");
				String autorLibro = sc.next();
				System.out.println("Ingrese editorial: ");
				String editorialLibro = sc.next();
				System.out.println("Ingrese genero: ");
				String genero = sc.next();
				System.out.println("Ingrese ISBN");
				int isbn = sc.nextInt();
				LIBRO(libroArreglo, libro1, anioLibro, tituloLibro, autorLibro, editorialLibro, genero, isbn);
				break; 
				
			case 2:
				System.out.println(" ");
				System.out.println("--REVISTA--");
				System.out.println("Ingrese año de publicación: ");
				int anioRevista = sc.nextInt();
				System.out.println("Ingrese titulo: ");
				String tituloRevista = sc.next();
				System.out.println("Ingrese autor: ");
				String autorRevista = sc.next();
				System.out.println("Ingrese editorial: ");
				String editorialRevista = sc.next();
				System.out.println("Ingrese el nro de edición: ");
				int nroEdicion = sc.nextInt();
				System.out.println("Ingrese la periocidad: ");
				String periocidad = sc.next();
				REVISTA(revistaArreglo, revista1, anioRevista, tituloRevista, autorRevista, editorialRevista,
						nroEdicion, periocidad);
				break;
				
			case 3:
				System.out.println(" ");
				System.out.println("--ARTICULO CIENTIFICO--");
				System.out.println("Ingrese año de publicación: ");
				int anioArticuloCientifico = sc.nextInt();
				System.out.println("Ingrese titulo: ");
				String tituloArticuloCientifico = sc.next();
				System.out.println("Ingrese autor: ");
				String autorArticuloCientifico = sc.next();
				System.out.println("Ingrese editorial: ");
				String editorialArticuloCientifico = sc.next();
				System.out.println("Ingrese DOI: ");
				String doi = sc.next();
				System.out.println("Ingrese el área donde se realizó la investigación: ");
				String areaInvestigacion = sc.next();
				System.out.println("Ingrese la revista donde fue publicado el articulo: ");
				String revistaPublicada = sc.next();
				System.out.println("Ingrese la institución la cual realizó la investigación: ");
				String institucion = sc.next();
				ARTICULO_CIENTIFICO(articulo_cientificoArreglo, articulo_cientifico1, anioArticuloCientifico,
						tituloArticuloCientifico, autorArticuloCientifico, editorialArticuloCientifico, doi,
						areaInvestigacion, revistaPublicada, institucion);
				break;

			case 4:
				MuestreoLIBRO(libroArreglo);
				MuestreoREVISTA(revistaArreglo);
				MuestreoARTICULO(articulo_cientificoArreglo);
				break;

			case 5:
				System.out.println("Ingrese ISBN del libro a eliminar: ");
				int isbnBorrar = sc.nextInt();
				BajaLIBRO(isbnBorrar, libroArreglo);
				break;
				
			case 6:
				System.out.println("Ingrese nro de edición de la revista a eliminar: ");
				int nroEdicionBorrar = sc.nextInt();
				BajaREVISTA(nroEdicionBorrar, revistaArreglo);
				break;
				
			case 7:
				System.out.println("Ingrese doi del articulo a eliminar: ");
				String doiBorrar = sc.next();
				BajaARTICULO(doiBorrar, articulo_cientificoArreglo);
				break;
				
			case 8:
				System.out.println("Ingrese isbn del libro que desee modificar un dato: ");
				int isbnMod = sc.nextInt();
				int datoParaModificarL;
				System.out.println("Elija el dato que desea modificar: ");
				System.out.println("1. Título");
				System.out.println("2. Género");
				datoParaModificarL = sc.nextInt();
				String nuevoTituloL = null;
				String nuevoGenero = null;
				if (datoParaModificarL == 1) {
					System.out.println("Ingrese el nuevo título: ");
					nuevoTituloL = sc.next();
				} else {
					System.out.println("Ingrese el nuevo género: ");
					nuevoGenero = sc.next();
				}
				ModificarLIBRO(libroArreglo, isbnMod, datoParaModificarL, nuevoTituloL, nuevoGenero);
				break;
				
			case 9:
				System.out.println("Ingrese nro de edición de la revista que desee modificar un dato: ");
				int nroEdMod = sc.nextInt();
				int datoParaModificarR = 0;
				System.out.println("Elija el dato que desea modificar: ");
				System.out.println("1. Título");
				System.out.println("2. Periocidad");
				datoParaModificarL = sc.nextInt();
				String nuevoTituloR = null;
				String nuevaPeriocidad = null;
				if (datoParaModificarL == 1) {
					System.out.println("Ingrese el nuevo título: ");
					nuevoTituloR = sc.next();
				} else {
					System.out.println("Ingrese la nueva periocidad: ");
					nuevaPeriocidad = sc.next();
				}
				ModificarREVISTA(revistaArreglo, nroEdMod, datoParaModificarR, nuevoTituloR, nuevaPeriocidad);
				break;
				
			case 10:
				System.out.println("Ingrese nro de edición de la revista que desee modificar un dato: ");
				String doiMod = sc.next();
				int datoParaModificarA = 0;
				System.out.println("Elija el dato que desea modificar: ");
				System.out.println("1. Título");
				System.out.println("2. Área de investigación");
				datoParaModificarL = sc.nextInt();
				String nuevoTituloA = null;
				String nuevaAreaInv = null;
				if (datoParaModificarL == 1) {
					System.out.println("Ingrese el nuevo título: ");
					nuevoTituloR = sc.next();
				} else {
					System.out.println("Ingrese la nueva área de inevstigación: ");
					nuevaAreaInv = sc.next();
				}
				ModificarARTICULO(articulo_cientificoArreglo, doiMod, datoParaModificarA, nuevoTituloA, nuevaAreaInv);
				break;
				
				
			case 11:
				System.out.println("Saliendo...");
				break;
			}
		} while (opcion != 11);

	}

	public static void LIBRO(LIBRO[] LA, LIBRO l, int anio, String titulo, String autor, String editorial,
			String genero, int isbn) {
		for (int i = 0; i < LA.length; i++) {

			if (LA[i] == null) {

				LA[i] = new LIBRO(anio, titulo, autor, editorial, genero, isbn);
				System.out.println("Datos recibidos");
				System.out.println(" ");
				break;
			}
		}

	}

	public static void REVISTA(REVISTA[] RA, REVISTA r, int anio, String titulo, String autor, String editorial,
			int nro, String periocidad) {

		for (int i = 0; i < RA.length; i++) {

			if (RA[i] == null) {

				RA[i] = new REVISTA(anio, titulo, autor, editorial, nro, periocidad);
				System.out.println("Datos recibidos");
				System.out.println(" ");
				break;
			}
		}

	}

	public static void ARTICULO_CIENTIFICO(ARTICULO_CIENTIFICO[] AA, ARTICULO_CIENTIFICO a, int anio, String titulo,
			String autor, String editorial, String doi, String area, String revistaP, String ins) {

		for (int i = 0; i < AA.length; i++) {

			if (AA[i] == null) {

				AA[i] = new ARTICULO_CIENTIFICO(anio, titulo, autor, editorial, doi, area, revistaP, ins);
				System.out.println("Datos recibidos");
				System.out.println(" ");
				break;
			}
		}

	}

	public static void MuestreoLIBRO(LIBRO[] l) {

		for (int i = 0; i < l.length; i++) {

			if (l[i] == null) {

			} else {
				System.out.println("--LIBROS--");
				System.out.println("Posición nro: " + i);
				System.out.println("Año: " + l[i].getAnioPublicacion());
				System.out.println("Titulo: " + l[i].getTitulo());
				System.out.println("Autor: " + l[i].getAutor());
				System.out.println("Editorial: " + l[i].getEditorial());
				System.out.println("Género: " + l[i].getGenero());
				System.out.println("ISBN: " + l[i].getIsbn());
				System.out.println(" ");
			}
		}
	}

	public static void MuestreoREVISTA(REVISTA[] r) {

		for (int i = 0; i < r.length; i++) {

			if (r[i] == null) {

			} else {
				System.out.println("--REVISTAS--");
				System.out.println("Posición nro: " + i);
				System.out.println("Año: " + r[i].getAnioPublicacion());
				System.out.println("Titulo: " + r[i].getTitulo());
				System.out.println("Autor: " + r[i].getAutor());
				System.out.println("Editorial: " + r[i].getEditorial());
				System.out.println("Número: " + r[i].getNroEdicion());
				System.out.println("Periocidad: " + r[i].getPeriocidad());
				System.out.println(" ");
			}
		}
	}

public static void MuestreoARTICULO(ARTICULO_CIENTIFICO[] a) {
	
	for (int i = 0; i < a.length; i++) {

		if (a[i] == null) {

		} else {
			System.out.println("--ARTICULOS CIENTÍFICOS--");
			System.out.println("Posición nro: " + i);
			System.out.println("Año: " + a[i].getAnioPublicacion());
			System.out.println("Titulo: " + a[i].getTitulo());
			System.out.println("Autor: " + a[i].getAutor());
			System.out.println("Editorial: " + a[i].getEditorial());
			System.out.println("DOI: " + a[i].getDoi());
			System.out.println("Área de investigación: " + a[i].getAreaInvestigacion());
			System.out.println("Revista: " + a[i].getRevistaPublicada());
			System.out.println("Institución: " + a[i].getInstitucion());
		}
	}
}

	public static void BajaLIBRO(int isbn, LIBRO[] l) {

		for (int i = 0; i < l.length; i++) {
			if (l[i].getIsbn() == isbn) {
				l[i] = null;
				System.out.println("Libro eliminado exitosamente");
				System.out.println(" ");
				break;
}}}
	public static void BajaREVISTA(int nroEdicion, REVISTA[] r) {

		for (int i = 0; i < r.length; i++) {
			if (r[i].getNroEdicion() == nroEdicion) {
				r[i] = null;
				System.out.println("Revista eliminada exitosamente");
				System.out.println(" ");
				break;
}}}
	public static void BajaARTICULO(String doi, ARTICULO_CIENTIFICO[] a) {

		for (int i = 0; i < a.length; i++) {
			if (a[i].getDoi() == doi) {
				a[i] = null;
				System.out.println("Articulo eliminado exitosamente");
				System.out.println(" ");
				break;
}}}
	
	public static void ModificarLIBRO(LIBRO[] l, int isbn, int datoParaModificar, String nuevoTitulo,
			String nuevoGenero) {
		for (int i = 0; i < l.length; i++) {
			if (l[i] != null && l[i].getIsbn() == isbn) {
				System.out.println("Dato modificado exitosamente :D");
				if (datoParaModificar == 1) {
					l[i].setTitulo(nuevoTitulo);

				} else {
					l[i].setGenero(nuevoGenero);

				}

			}

		}

	}
	public static void ModificarREVISTA(REVISTA[] r, int nroEdicion, int datoParaModificar, String nuevoTitulo,
			String nuevaPeriocidad) {
		for (int i = 0; i < r.length; i++) {
			if (r[i] != null && r[i].getNroEdicion() == nroEdicion) {
				System.out.println("Dato modificado exitosamente :D");
				if (datoParaModificar == 1) {
					r[i].setTitulo(nuevoTitulo);

				} else {
					r[i].setPeriocidad(nuevaPeriocidad);

				}

			}

		}

	}
	public static void ModificarARTICULO(ARTICULO_CIENTIFICO[] a, String doi, int datoParaModificar, String nuevoTitulo,
			String AreaInvestigacion) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null && a[i].getDoi().equals(doi)) {
				System.out.println("Dato modificado exitosamente :D");
				if (datoParaModificar == 1) {
					a[i].setTitulo(nuevoTitulo);

				} else {
					a[i].setAreaInvestigacion(AreaInvestigacion);

				}

			}

		}

	}
}
	
