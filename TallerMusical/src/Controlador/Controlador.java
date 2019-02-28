package Controlador;

import Modelo.Mundo;
import Vista.Interfaz;

public class Controlador {

	//Atributos que vienen del Modelo (mundo) 
	private Mundo bd;
	
	//Atributos que vienen de Vista
	private Interfaz gui;
	
	public Controlador() {

		//aqui van los constructores tanto de Mundo, como de Vista
		int a,b;
		bd = new Mundo();
		gui = new Interfaz();
		a=Integer.parseInt(gui.pedirDato());
		b=Integer.parseInt(gui.pedirDato());
		//aqui van los m�todos que se invocan de Modelo (Mundo) y de Vista y que ejecutar�n el programa.
		gui.escribirDato(bd.mescla(a,b));
		/*
		bd.setDato(gui.pedirDato());
		bd.procesarDato();
		gui.escribirDato(bd.getDato());
		*/
	}

}
