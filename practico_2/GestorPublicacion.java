package practico_2;

import java.util.Scanner;

public class GestorPublicacion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		LIBRO libro1 = new LIBRO(0, null, null, null, null, null);
		REVISTA revista1 = new REVISTA(0, null, null, null, 0, null);
		ARTICULO_CIENTIFICO articulo_cientifico1 = new ARTICULO_CIENTIFICO(0, null, null, null, null, null, null, null);

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
		String isbn = sc.next();
		LIBRO(libro1, anioLibro, tituloLibro, autorLibro, editorialLibro, genero, isbn);

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
		REVISTA(revista1, anioRevista, tituloRevista, autorRevista, editorialRevista, nroEdicion, periocidad);

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
		ARTICULO_CIENTIFICO(articulo_cientifico1, anioArticuloCientifico, tituloArticuloCientifico,
				autorArticuloCientifico, editorialArticuloCientifico, doi, areaInvestigacion, revistaPublicada,
				institucion);

		MuestreoDeDatos(libro1, revista1, articulo_cientifico1);
	}

	public static void LIBRO(LIBRO l, int anio, String titulo, String autor, String editorial, String genero,
			String isbn) {
		l.setAnioPublicacion(anio);
		l.setTitulo(titulo);
		l.setAutor(autor);
		l.setEditorial(editorial);
		l.setGenero(genero);
		l.setIsbn(isbn);

	}

	public static void REVISTA(REVISTA r, int anio, String titulo, String autor, String editorial, int nro,
			String periocidad) {
		r.setAnioPublicacion(anio);
		r.setTitulo(titulo);
		r.setAutor(autor);
		r.setAnioPublicacion(anio);
		r.setEditorial(editorial);
		r.setNroEdicion(nro);
		r.setPeriocidad(periocidad);

	}

	public static void ARTICULO_CIENTIFICO(ARTICULO_CIENTIFICO a, int anio, String titulo, String autor,
			String editorial, String doi, String area, String revistaP, String ins) {
		a.setAnioPublicacion(anio);
		a.setTitulo(titulo);
		a.setAutor(autor);
		a.setEditorial(editorial);
		a.setDoi(doi);
		a.setAreaInvestigacion(area);
		a.setRevistaPublicada(revistaP);
		a.setInstitucion(ins);

	}

	public static void MuestreoDeDatos(LIBRO l, REVISTA r, ARTICULO_CIENTIFICO a) {
		System.out.println("--LIBRO--");
		System.out.println("Año: " + l.getAnioPublicacion());
		System.out.println("Titulo: " + l.getTitulo());
		System.out.println("Autor: " + l.getAutor());
		System.out.println("Editorial: " + l.getEditorial());
		System.out.println("Género: " + l.getGenero());
		System.out.println("ISBN: " + l.getIsbn());
		System.out.println(" ");

		System.out.println("--REVISTA--");
		System.out.println("Año: " + r.getAnioPublicacion());
		System.out.println("Titulo: " + r.getTitulo());
		System.out.println("Autor: " + r.getAutor());
		System.out.println("Editorial: " + r.getEditorial());
		System.out.println("Número: " + r.getNroEdicion());
		System.out.println("Periocidad: " + r.getPeriocidad());
		System.out.println(" ");

		System.out.println("--ARTICULO CIENTÍFICO--");
		System.out.println("Año: " + a.getAnioPublicacion());
		System.out.println("Titulo: " + a.getTitulo());
		System.out.println("Autor: " + a.getAutor());
		System.out.println("Editorial: " + a.getEditorial());
		System.out.println("DOI: " + a.getDoi());
		System.out.println("Área de investigación: " + a.getAreaInvestigacion());
		System.out.println("Revista: " + a.getRevistaPublicada());
		System.out.println("Institución: " + a.getInstitucion());
	}

}
