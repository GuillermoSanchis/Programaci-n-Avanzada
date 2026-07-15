package empresa_acciones;

public class Encargado implements EMPRESA {
	
	int idEncargado = 2;

	@Override
	public void envairMail() {
		System.out.println("Mail enviado correctamente");
		
	}

	public int getIdEncargado() {
		return idEncargado;
	}

	public void setIdEncargado(int idEncargado) {
		this.idEncargado = idEncargado;
	}

	public Encargado(int idEncargado) {
		super();
		this.idEncargado = idEncargado;
	}

}
