package practico_4;

public class PINTURA extends OBRA_ARTE {
 
	String estiloArtistico, tecnica;

	public String getEstiloArtistico() {
		return estiloArtistico;
	}

	public void setEstiloArtistico(String estiloArtistico) {
		this.estiloArtistico = estiloArtistico;
	}

	public String getTecnica() {
		return tecnica;
	}

	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}

	public PINTURA(String nombre, String autor, String material, Double precio, String dimensiones,
			String estiloArtistico, String tecnica) {
		super(nombre, autor, material, precio, dimensiones);
		this.estiloArtistico = estiloArtistico;
		this.tecnica = tecnica;
	}
	
	

}
