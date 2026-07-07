package practico_2;

public class LIBRO extends PUBLICACION{

	String genero;
	int isbn;
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public LIBRO(int anioPublicacion, String titulo, String autor, String editorial, String genero, int isbn) {
		super(anioPublicacion, titulo, autor, editorial);
		this.genero = genero;
		this.isbn = isbn;
	}
	
}
