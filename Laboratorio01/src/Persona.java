
public abstract class Persona implements Comparable<Persona>{
private long dni;
private int  id,edad;
String apellido, nombre, sexo;

	public Persona(int id,String apellido, String nombre, int edad, String sexo, long dni) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.apellido=apellido;
		this.nombre=nombre;
		this.edad=edad;
		this.sexo=sexo;
		this.dni=dni;
	}

	public long getId() {
		return id;
	}

	public long getDni() {
		return dni;
	}

	public int getEdad() {
		return edad;
	}

	public String getApellido() {
		return apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public String getSexo() {
		return sexo;
	}
	
	public int compareTo(Persona o) {
		return (this.getApellido()+this.getNombre()).compareTo(o.getApellido()+o.getNombre());
	}

}
