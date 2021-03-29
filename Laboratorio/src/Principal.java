
public class Principal {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Profesor profesor = new Profesor();
		 Alumno alumno1 = new Alumno();
		 Alumno alumno2 = new Alumno();
		 Curso curso = new Curso();
		 profesor.setApellido("Shoji");
		 profesor.setLegajo(6969);
		 alumno1.setApellido("Kessler");
		 alumno1.setNombre("Gastón");
		 alumno1.setNroDocumento(36000000);
		 alumno2.setApellido("Silva");
		 alumno2.setNombre("Matias");
		 alumno2.setNroDocumento(32036076);
		 curso.setNombreDelCurso("Lectura de PDF con Shoji");
		 curso.setProfesor(profesor);
		 curso.add(alumno1);
		 curso.add(alumno2);
		 curso.imprimir();
	}

}
