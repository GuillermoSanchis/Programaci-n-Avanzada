package empresa_acciones;

public class Duenio implements EMPRESA{
	
	int idDuenio = 3;

	@Override
	public void envairMail() {
		System.out.println("Mail enviado a encargado correctamente");		
	}

	public int getIdDuenio() {
		return idDuenio;
	}

	public void setIdDuenio(int idDuenio) {
		this.idDuenio = idDuenio;
	}

	public Duenio(int idDuenio) {
		super();
		this.idDuenio = idDuenio;
	}

}
