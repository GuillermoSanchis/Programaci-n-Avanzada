package practico_2;

public class ARTICULO_CIENTIFICO extends PUBLICACION {

	String doi, areaInvestigacion, revistaPublicada, institucion;

	public String getDoi() {
		return doi;
	}

	public void setDoi(String doi) {
		this.doi = doi;
	}

	public String getAreaInvestigacion() {
		return areaInvestigacion;
	}

	public void setAreaInvestigacion(String areaInvestigacion) {
		this.areaInvestigacion = areaInvestigacion;
	}

	public String getRevistaPublicada() {
		return revistaPublicada;
	}

	public void setRevistaPublicada(String revistaPublicada) {
		this.revistaPublicada = revistaPublicada;
	}

	public String getInstitucion() {
		return institucion;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}

	public ARTICULO_CIENTIFICO(int anioPublicacion, String titulo, String autor, String editorial, String doi,
			String areaInvestigacion, String revistaPublicada, String institucion) {
		super(anioPublicacion, titulo, autor, editorial);
		this.doi = doi;
		this.areaInvestigacion = areaInvestigacion;
		this.revistaPublicada = revistaPublicada;
		this.institucion = institucion;
	}

}
