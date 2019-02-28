package Modelo;

import java.util.Random;

//Representa los datos de persistencia que van a ser utilizados por el mundo y/o controlador
//es opcional: ser puede o no tener datos.

public class Persistencia {
	 String[]FRASE1= {" mami "," bebe "," princes "," mai "};
	 String[]FRASE2= {" yo quiero "," yo puedo "," yo vengo a  "," voy a "};
	 String[]FRASE3= {" encenderte "," amarte "," ligar "," jugar "};
	 String[]FRASE4={" suave "," lento "," rapido "," Fuerte "};
	 String[]FRASE5= {" hasta que salga el sol "," TODA LA NOCHE "," HASTA EL AMANECER "," TODO EL DIA "};
	 String[]FRASE6= {" SIN ANESTESIA XD\n"," SIN COMPROMISO XD\n"," FEIS TO FEIS XD\n "," SIN COMPROMISO XD\n"};
	 
	 private int x,y,z,c,d,e;
	public String[] getFRASE1() {
		return FRASE1;
	}
	public void setFRASE1(String[] fRASE1) {
		FRASE1 = fRASE1;
	}
	public String[] getFRASE2() {
		return FRASE2;
	}
	public void setFRASE2(String[] fRASE2) {
		FRASE2 = fRASE2;
	}
	public String[] getFRASE3() {
		return FRASE3;
	}
	public void setFRASE3(String[] fRASE3) {
		FRASE3 = fRASE3;
	}
	public String[] getFRASE4() {
		return FRASE4;
	}
	public void setFRASE4(String[] fRASE4) {
		FRASE4 = fRASE4;
	}
	public String[] getFRASE5() {
		return FRASE5;
	}
	public void setFRASE5(String[] fRASE5) {
		FRASE5 = fRASE5;
	}
	public String[] getFRASE6() {
		return FRASE6;
	}
	public void setFRASE6(String[] fRASE6) {
		FRASE6 = fRASE6;
	}
	public Persistencia() {
		// TODO Auto-generated constructor stub
		
		// x = rd.nextInt(FRASE1.length);
		 
		 
		 
		
	}
	public String mesclaDeArreglos() {
		Random rd= new Random();
		String rta="";
		for(int i=0;i<4;i++) {
		rta+=FRASE1[rd.nextInt(FRASE1.length)];
		rta+=FRASE2[rd.nextInt(FRASE2.length)];
		rta+=FRASE3[rd.nextInt(FRASE3.length)];
		rta+=FRASE4[rd.nextInt(FRASE4.length)];
		rta+=FRASE5[rd.nextInt(FRASE5.length)];
		rta+=FRASE6[rd.nextInt(FRASE6.length)];
		}
		return rta;
	}
	
	
	
	
	

}
