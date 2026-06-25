package practico_4;

public class FOTOGRAFIA extends OBRA_ARTE {
	
	String tipoCam, relacionAspecto, resolucion, lente;

	public String getTipoCam() {
		return tipoCam;
	}

	public void setTipoCam(String tipoCam) {
		this.tipoCam = tipoCam;
	}

	public String getRelacionApecto() {
		return relacionAspecto;
	}

	public void setRelacionApecto(String relacionApecto) {
		this.relacionAspecto = relacionApecto;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}
	

	public String getLente() {
		return lente;
	}

	public void setLente(String lente) {
		this.lente = lente;
	}

	public FOTOGRAFIA(String nombre, String autor, String material, Double precio, String dimensiones, String tipoCam,
			String relacionAspecto, String resolucion, String lente) {
		super(nombre, autor, material, precio, dimensiones);
		this.tipoCam = tipoCam;
		this.relacionAspecto = relacionAspecto;
		this.resolucion = resolucion;
		this.lente = lente;
	}
	
	
}
