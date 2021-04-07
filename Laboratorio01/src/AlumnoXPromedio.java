import java.util.Comparator;

public class AlumnoXPromedio implements Comparator<Persona>{

	@Override
	public int compare(Persona o1, Persona o2) {
		// TODO Auto-generated method stub
		Alumno a1 = (Alumno) o1;
		Alumno a2= (Alumno) o2;
		return (int) (a2.getPromedio()*10-a1.getPromedio()*10);
	}

	
}
