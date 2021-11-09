package escuela.escuela;


import java.util.ArrayList;
import java.util.List;



public class listaDeNotas {
        
	private List<Alumnos>listadenotas;
	
	public listaDeNotas() {
		this.listadenotas = new ArrayList();	
	}
	
public void agregaralumnos(Alumnos alumnos) {
	this.listadenotas.add(alumnos);
}


public void calcularPromedio() {
	for (Alumnos p:this.listadenotas) {
                 if(p.getnota1()<1 || p.getnota1() >10 || p.getnota2()<1 || p.getnota2() >10 ||p.getnota3()<1 || p.getnota3() >10){
                        throw new ArithmeticException("El rango de notas es entre 1 y 10");                 	    
                }else{ 
                        if(((p.getnota1()+p.getnota2()+p.getnota3())/3) >=6){
                                   System.out.println(p.getnombre() +"      "+ p.getnota1()+"  "+ p.getnota2()+"  "+ p.getnota3()+"      " + "APROBADO" );
                        }else{
                          System.out.println(p.getnombre() +"      "+ p.getnota1()+"  "+ p.getnota2()+"  "+ p.getnota3()+ "     "+"DESAPROBADO");
                              }
                    }              
                                           }
                                }

}




        
        



