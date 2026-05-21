package src;

public class Alumno extends Persona {
	private String grado, orientacion, turnoAlumno;
	private int inasistencias;

	public int getInasistencias() {
		return inasistencias;
	}

	public void setInasistencias(int inasistencias) {
		this.inasistencias = inasistencias;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	public String getOrientacion() {
		return orientacion;
	}

	public void setOrientacion(String orientacion) {
		this.orientacion = orientacion;
	}

	public String getTurnoAlumno() {
		return turnoAlumno;
	}

	public void setTurnoAlumno(String turnoAlumno) {
		this.turnoAlumno = turnoAlumno;
	}

	public Alumno(String nombre, String apellido, String telefono, String fechaNacimiento, int CI, String grado,
			String orientacion, String turnoAlumno, int inasistencias) {
		super(nombre, apellido, telefono, fechaNacimiento, CI);
		this.inasistencias = inasistencias;
		this.grado = grado;
		this.orientacion = orientacion;
		this.turnoAlumno = turnoAlumno;
	}
}
