package escuela.escuela;

public class notasCurso {

	public static void main(String[] args) {
		Alumnos alumno1= new Alumnos  ("Julio Verne           ", 2,6,5);
		Alumnos alumno2= new Alumnos  ("Stephen KIng          ", 3,8,8);
		Alumnos alumno3= new Alumnos  ("Julio Iglesias        ", 4,4,2);
		Alumnos alumno4= new Alumnos  ("Isabel Allende        ", 5,3,9);
		Alumnos alumno5= new Alumnos  ("Fabiana Cantilo      ",8,10,6);
		Alumnos alumno6= new Alumnos  ("Vilma Picapiedras    ",10,8,7);
		Alumnos alumno7= new Alumnos  ("Pebbles Picapiedras   ", 5,7,7);
		Alumnos alumno8= new Alumnos  ("Luis Alberto Spinetta ", 7,6,2);
		Alumnos alumno9= new Alumnos  ("José Perales          ", 2,9,9);
		Alumnos alumno10= new Alumnos ("Juan Carlos Baglieto  ", 1,4,6);

		
		
		listaDeNotas listadenotas= new listaDeNotas ();
		listadenotas.agregaralumnos(alumno1);
		listadenotas.agregaralumnos(alumno2);
		listadenotas.agregaralumnos(alumno3);
		listadenotas.agregaralumnos(alumno4);
		listadenotas.agregaralumnos(alumno5);
		listadenotas.agregaralumnos(alumno6);
		listadenotas.agregaralumnos(alumno7);
		listadenotas.agregaralumnos(alumno8);
		listadenotas.agregaralumnos(alumno9);
		listadenotas.agregaralumnos(alumno10);


		
		listadenotas.calcularPromedio();
                
                   

	}

}
