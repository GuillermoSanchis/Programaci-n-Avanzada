package src;

public class Director extends Persona {
	String sueldoDirector, correoDirector, horariosDirector;
	int aniosExperiencia;

	public String getSueldoDirector() {
		return sueldoDirector;
	}

	public void setSueldoDirector(String sueldoDirector) {
		this.sueldoDirector = sueldoDirector;
	}

	public String getCorreoDirector() {
		return correoDirector;
	}

	public void setCorreoDirector(String correoDirector) {
		this.correoDirector = correoDirector;
	}

	public String getHorariosDirector() {
		return horariosDirector;
	}

	public void setHorariosDirector(String horariosDirector) {
		this.horariosDirector = horariosDirector;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	public Director(String nombre, String apellido, String telefono, String fechaNacimiento, int CI, String sueldoDirector,
			String correoDirector, String horariosDirector, int aniosExperiencia) {
		super(nombre, apellido, telefono, fechaNacimiento, CI);
		this.sueldoDirector = sueldoDirector;
		this.correoDirector = correoDirector;
		this.horariosDirector = horariosDirector;
		this.aniosExperiencia = aniosExperiencia;
	}

}
