package practico_2;

public class REVISTA extends PUBLICACION {

	int nroEdicion;
	String periocidad;

	public int getNroEdicion() {
		return nroEdicion;
	}

	public void setNroEdicion(int nroEdicion) {
		this.nroEdicion = nroEdicion;
	}

	public String getPeriocidad() {
		return periocidad;
	}

	public void setPeriocidad(String periocidad) {
		this.periocidad = periocidad;
	}

	public REVISTA(int anioPublicacion, String titulo, String autor, String editorial, int nroEdicion,
			String periocidad) {
		super(anioPublicacion, titulo, autor, editorial);
		this.nroEdicion = nroEdicion;
		this.periocidad = periocidad;
	}

}
