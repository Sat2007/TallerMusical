package Modelo;

import java.util.Random;

//Representa el mundo del problema: las clases y métodos que describen el problema 
//Pueden reemplazar el nombre de la clase "Mundo" por el que necesiten.
import Modelo.Persistencia;
public class Mundo {

	Persistencia BD;//se asocia a Mundo para que éste pueda interactuar con la data de Persistencia.
	private String dato; // atributo ejemplo que se va a cargar por un método de vista
	private Persistencia p1;
	public Mundo() {
		// TODO Auto-generated constructor stub
		dato = "";
		p1= new Persistencia();
	}

	//getter para el atributo ejemplo
	public String getDato() {
		return dato;
	}


	//setter para el atributo ejemplo
	public void setDato(String dato) {
		this.dato = dato;
	}



	/* metodo que realiza un proceso basado en un atributo dato (ejemplo)  
	 * Reemplazar por lo que se necesiten
	 */
	public void procesarDato() {
		this.dato = this.dato + " procesado";
	}
	public String mesclaDeArreglos(int numRenglones) {
		Random rd= new Random();
		String rta="";
		for(int i=0;i<numRenglones;i++) {
		rta+=p1.FRASE1[rd.nextInt(p1.FRASE1.length)];
		rta+=p1.FRASE2[rd.nextInt(p1.FRASE2.length)];
		rta+=p1.FRASE3[rd.nextInt(p1.FRASE3.length)];
		rta+=p1.FRASE4[rd.nextInt(p1.FRASE4.length)];
		rta+=p1.FRASE5[rd.nextInt(p1.FRASE5.length)];
		rta+=p1.FRASE6[rd.nextInt(p1.FRASE6.length)];
		
		}
		return rta;
	}
	
	public String mescla(int numRenglones,int numParrafos) {
		String rta="";
		for(int i =0;i<numParrafos;i++) {
			rta+=mesclaDeArreglos(numRenglones);
			rta+="tal cual";
			rta+="\n";
		}
		return rta;
	}
	
	
}
