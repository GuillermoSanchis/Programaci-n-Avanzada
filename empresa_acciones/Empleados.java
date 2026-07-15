package empresa_acciones;

public class Empleados implements EMPRESA{
	
	int idEmpleado = 1;

	@Override
	public void envairMail() { 
		System.out.println("Mail enviado a otro empleado correctamente");
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public Empleados(int idEmpleado) {
		super();
		this.idEmpleado = idEmpleado;
	}

}
