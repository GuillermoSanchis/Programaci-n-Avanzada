package acciones;

public class PERRO implements ACCIONES {
	
	String nombreP;

	@Override
	public void comer() {
		System.out.println("El perro acaba de comer 500g");
		
	}

	@Override
	public void dormir() {
		System.out.println("El perro esta durmiendo 9hrs");
	}

	public String getNombre() {
		return nombreP;
	}

	public void setNombre(String nombre) {
		this.nombreP = nombre;
	}

	public PERRO(String nombre) {
		super();
		this.nombreP = nombre;
	}
	
}
