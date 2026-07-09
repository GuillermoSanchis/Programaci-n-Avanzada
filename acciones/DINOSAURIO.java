package acciones;

public class DINOSAURIO implements ACCIONES {
	
	String nombreD;

	@Override
	public void comer() {
		System.out.println("El dinosaurio acaba de comer 250kg de carne");

	}

	@Override
	public void dormir() {
		System.out.println("El dinosaurio esta durmiendo 12hrs");
		
	}

	public String getNombreD() {
		return nombreD;
	}

	public void setNombreD(String nombreD) {
		this.nombreD = nombreD;
	}

	public DINOSAURIO(String nombreD) {
		super();
		this.nombreD = nombreD;
	}
	
}
