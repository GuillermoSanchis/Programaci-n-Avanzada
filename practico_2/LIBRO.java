package practico_2;

public class LIBRO extends PUBLICACION{

	String genero, isbn;

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public LIBRO(int anioPublicacion, String titulo, String autor, String editorial, String genero, String isbn) {
		super(anioPublicacion, titulo, autor, editorial);
		this.genero = genero;
		this.isbn = isbn;
	}
	
}
