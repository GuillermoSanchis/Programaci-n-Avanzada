package src;

public class GestorPersona {
	public static void main(String[] args) {
		Alumno alumno1 = new Alumno ("Guillermo", "Sanchis", "091456099", "17/05/2009", 57971323, "5to", "Biológico", "Vespertino", 8);
		System.out.println(alumno1.getNombre() + alumno1.getApellido() + alumno1.getTelefono() + alumno1.getFechaNacimiento() + alumno1.getCI() + alumno1.getGrado() + alumno1.getOrientacion() + alumno1.getTurnoAlumno() + alumno1.getInasistencias());
	}
}
