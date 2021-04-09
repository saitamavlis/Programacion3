
public class Profesor extends Persona {

	int legajo;
	String titulo;

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getTitulo() {
		return titulo;
	}

	public Profesor(int id, String apellido, String nombre, int edad, String sexo, long dni, String titulo) {
		super(id, apellido, nombre, edad, sexo, dni);
		// TODO Auto-generated constructor stub
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return " Id:" + getId() + ": " + apellido + ", " + nombre + ". Edad: " + getEdad() + ". Sexo: " + sexo + ". DNI: "
				+ getDni() + ". Legajo: " + getLegajo() + ". Titulo: " + getTitulo();
	}

}
