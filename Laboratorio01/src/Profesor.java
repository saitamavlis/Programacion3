
public class Profesor extends Persona {

	static int legajo;
	 String titulo;
	
	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		Profesor.legajo = legajo;
	}

	public String getTitulo() {
		return titulo;
	}

	

	public Profesor(int id, String apellido, String nombre, int edad, String sexo, long dni, String titulo) {
		super(id, apellido, nombre, edad, sexo, dni);
		// TODO Auto-generated constructor stub
		this.titulo=titulo;
	}

	@Override
	public String toString() {
		return "Apellido: "+ getApellido()+", "+getNombre()+", edad: "+getEdad()+", Titulo: "+ getTitulo();
	}

	

}
