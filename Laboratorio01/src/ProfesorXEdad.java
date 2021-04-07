import java.util.Comparator;

public class ProfesorXEdad implements Comparator<Persona>{

	@Override
	public int compare(Persona o1, Persona o2) {
		// TODO Auto-generated method stub
		return o2.getEdad()-o1.getEdad();
	}

}
