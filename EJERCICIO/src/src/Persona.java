package src;

public abstract class Persona {
	private String nombre, apellido, telefono, fechaNacimiento;
	private int CI;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getCI() {
		return CI;
	}

	public void setCI(int cI) {
		CI = cI;
	}

	public Persona(String nombre, String apellido, String telefono, String fechaNacimiento, int CI) {
	}
}
