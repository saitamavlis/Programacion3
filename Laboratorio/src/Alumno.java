public class Alumno {
private String nombre, apellido;
private long nroDocumento;

	public Alumno() {
		// TODO Auto-generated constructor stub
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public long getnroDocumento() {
		return nroDocumento;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setApellido(String apellido) {
		this.apellido=apellido;
	}
	public void setNroDocumento(long nroDocumento) {
		this.nroDocumento=nroDocumento;
	}

}
