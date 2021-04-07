import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Principal {

	static List<Persona> listAlumnos = new ArrayList<Persona>();
	static List<Persona> listProfesores = new ArrayList<Persona>();
	static List<Persona> listPersonas = new ArrayList<Persona>();
	static List<Persona> listMejoresProm = new ArrayList<Persona>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenerarLista();
		OrdenarAlumnosApellido();
		OrdenarProfesoresApellido();
		OrdenarAlumnosPromedio();
		MejoresPromedios();
		IngenierosEnSistema();
		ProfesoresMayorAMenor();
	}

	private static void ProfesoresMayorAMenor() {
		// TODO Auto-generated method stub
		Collections.sort(listProfesores, new ProfesorXEdad());
		System.out.println("Profesores por edad (Mayor a menor): ");
		MostrarLista(listProfesores);
	}

	private static void IngenierosEnSistema() {
		// TODO Auto-generated method stub
		int ing = 0;
		System.out.println("Profesores Ing. en Sistemas");
		for (Persona p : listProfesores) {
			if (((Profesor) p).getTitulo() == "Ing. en Sistemas") {
				System.out.println(p.toString());
				ing++;
			}
		}
		if (ing == 0)
			System.out.println("Ninguno");
		System.out.println("---------------------------");
	}

	private static void MejoresPromedios() {
		// TODO Auto-generated method stub
		for (Persona p : listAlumnos) {
			if (((Alumno) p).getPromedio() > 7)
				listMejoresProm.add(p);
		}
		Collections.sort(listMejoresProm, new AlumnoXPromedio());
		System.out.println("Promedios mayor a 7 (Mayor a menor): ");
		MostrarLista(listMejoresProm);
	}

	private static void OrdenarAlumnosPromedio() {
		// TODO Auto-generated method stub
		Collections.sort(listAlumnos, new AlumnoXPromedio());
		System.out.println("Promedio más bajo: " + listAlumnos.get(listAlumnos.size() - 1));
		System.out.println("Promedio más alto: " + listAlumnos.get(0));
		System.out.println("---------------------------");
	}

	private static void OrdenarProfesoresApellido() {
		// TODO Auto-generated method stub
		Collections.sort(listProfesores);
		System.out.println("Profesores Ordenados por apellido: ");
		MostrarLista(listProfesores);
	}

	private static void OrdenarAlumnosApellido() {
		// TODO Auto-generated method stub
		Collections.sort(listAlumnos);
		System.out.println("Alumnos Ordenados por apellido: ");
		MostrarLista(listAlumnos);
	}

	private static void MostrarLista(List<Persona> mostrar) {
		// TODO Auto-generated method stub
		for (Persona p : mostrar) {
			System.out.println(p);
		}
		System.out.println("---------------------------");
	}

	private static void GenerarLista() {
		// TODO Auto-generated method stub
		// Genera nombre alumno aleatorio
		Random rdn = new Random();
		int numero;
		for (int i = 0; i < 20; i++) {
			String[] nombres = { "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez",
					"Once", "Doce", "Trece", "Catorce", "Quince" };
			numero = (int) (Math.random() * 14);
			String nombre = nombres[numero];

			// Genera apellido alumno aleatorio
			String[] apellidos = { "Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto", "Septimo", "Octavo",
					"Noveno", "Decimo" };
			numero = (int) (Math.random() * 9);
			String apellido = apellidos[numero];

			// Genera dni alumno aleatorio
			long dni = (long) (Math.random() * (45000000 - 20000000) + 20000000);

			String[] titulos = { "Contador", "Programador", "Ing. en Sistemas", "Ing. Civil", "Paleontologo" };
			numero = (int) (Math.random() * 4);// me genera mismo valor
			String titulo = titulos[numero];
			String sexo;
			numero = (int) (Math.random() * 2);
			if (numero == 0)
				sexo = "Masculino";
			else
				sexo = "Femenino";

			if (i <= 14) {

				Alumno alumno = new Alumno(i + 1, apellido, nombre, (int) (Math.random() * (70 - 18) + 18), sexo, dni);
				alumno.setMateriasAprobadas((int) (Math.random() * 20));// siempre me genera el mismo valor
				numero = (int) (rdn.nextInt(1500));// siempre me genera el mismo valor
				alumno.setNroLe(numero);
				alumno.setPromedio(rdn.nextDouble() * 10);// siempre me genera el mismo valor
				listAlumnos.add(alumno);
				listPersonas.add(alumno);
			} else {
				Profesor profesor = new Profesor(i, apellido, nombre, (int) (Math.random() * (70 - 18) + 18), sexo, dni,
						titulo);
				profesor.setLegajo((int) Math.random() * 200);

				// profesor.setTitulo(titulo);
				listProfesores.add(profesor);
				listPersonas.add(profesor);
			}

		}
	}

}
