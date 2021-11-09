package escuela.escuela;

public class Alumnos {
	private String nombre;
	private int nota1;
        private int nota2;
	private int nota3;
	

//Constructor
		public Alumnos(String nombre, int nota1, int nota2,int nota3) {
			this.nombre =nombre;
			this.nota1 = nota1;
                        this.nota2 = nota2;
                        this.nota3 = nota3;

	}

		public String getnombre () {
			return this.nombre;
		}
		
		public int getnota1() {
			return this.nota1;
		}
                public int getnota2() {
			return this.nota2;
		}
                public int getnota3() {
			return this.nota3;
		}
             
               
}