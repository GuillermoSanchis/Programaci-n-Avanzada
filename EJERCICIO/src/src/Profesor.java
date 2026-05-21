package src;

public class Profesor extends Persona {
	private String materia, turnoProfesor, horarios, correoE;
	private Double sueldo;

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getTurnoProfesor() {
		return turnoProfesor;
	}

	public void setTurnoProfesor(String turnoProfesor) {
		this.turnoProfesor = turnoProfesor;
	}

	public String getHorarios() {
		return horarios;
	}

	public void setHorarios(String horarios) {
		this.horarios = horarios;
	}

	public String getCorreoE() {
		return correoE;
	}

	public void setCorreoE(String correoE) {
		this.correoE = correoE;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	public Profesor(String nombre, String apellido, String telefono, String fechaNacimiento, int CI, String materia,
			String turnoProfesor, String horarios, String correoE, Double sueldo) {
		super(nombre, apellido, telefono, fechaNacimiento, CI);
		this.materia = materia;
		this.turnoProfesor = turnoProfesor;
		this.horarios = horarios;
		this.correoE = correoE;
		this.sueldo = sueldo;
	}
}
