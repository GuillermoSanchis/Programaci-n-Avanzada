package practico_2;

public abstract class PUBLICACION {
	
	int anioPublicacion;
	String titulo, autor, editorial;
	public int getAnioPublicacion() {
		return anioPublicacion;
	}
	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public PUBLICACION(int anioPublicacion, String titulo, String autor, String editorial) {
		super();
		this.anioPublicacion = anioPublicacion;
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
	}

	
}
