import java.util.Iterator;
import java.util.Vector;

public class Curso {
private Vector<Alumno> alumnos=new Vector<Alumno>();
private String nombreDelCurso;
private Profesor profesor;
	public Curso() {
		// TODO Auto-generated constructor stub
	}
		
	public void setNombreDelCurso(String nombreDelCurso) {
		this.nombreDelCurso=nombreDelCurso;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor=profesor;
	}
	
	public void add(Alumno alumno) {
	alumnos.add(alumno);
	}
	
	public void imprimir() {
		
		System.out.println("Curso: "+ nombreDelCurso);
		System.out.println("Profesor: "+ profesor.getApellido()+ ", Legajo: "+profesor.getNroLegajo());
		System.out.println("Alumnos: ");
		Iterator<Alumno> i = alumnos.iterator();
		while(i.hasNext()) {
			Alumno alumno=(Alumno)i.next();
			System.out.println(alumno.getApellido()+", "+alumno.getNombre()+", DNI: "+alumno.getnroDocumento());
		}
		
	}
}
