
public class Alumno extends Persona {

	int nroLe, materiasAprobadas;
	double promedio;

	public Alumno(int id, String apellido, String nombre, int edad, String sexo, long dni) {
		super(id, apellido, nombre, edad, sexo, dni);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return  apellido + ", " + nombre + ", sexo:" + sexo + ", DNI:" + getDni()
				+ ", Materias Aprobadas:" + getMateriasAprobadas() + ", Promedio:" + String.format("%.2f",getPromedio())
				+ ", Id:" + getId() + ",  Edad: " + getEdad()+", Nro Le: "+getNroLe();
	}

	public int getNroLe() {
		return nroLe;
	}

	public void setNroLe(int nroLe) {
		this.nroLe = nroLe;
	}

	public int getMateriasAprobadas() {
		return materiasAprobadas;
	}

	public void setMateriasAprobadas(int materiasAprobadas) {
		this.materiasAprobadas = materiasAprobadas;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

}
