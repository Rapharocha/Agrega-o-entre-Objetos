package com.main;

import com.model.Luta;
import com.model.Lutador;

public class Main {

	public static void main(String[] args) {
		
		
		Lutador l[] = new Lutador[6];
		
		l[0]= new Lutador("Pretty Boy","Fran�a",31,1.75,68.9,11,2,1);
		l[0].Status();
		System.out.println("--------------------------------------------");
		l[1]= new Lutador("Putscrip","Brasil",29,1.68,57.8,14,2,3);
		l[1].Status();
		System.out.println("--------------------------------------------");
		l[2]=new Lutador("Snapshadow","EUA",35,1.65,80.9,12,2,1);
		l[2].Status();
		System.out.println("--------------------------------------------");
		l[3]=new Lutador("Dead Code","Australia",28,1.93,81.6,13,0,2);
		l[3].Status();
		System.out.println("--------------------------------------------");
		l[4]=new Lutador("UF0Cobolt","Brasil",37,1.70,119.3,5,4,3);
		l[4].Status();
		System.out.println("--------------------------------------------");
		l[5]=new Lutador("Nerdaart", "EUA", 30, 1.81, 105.7, 12,2,4);
		l[5].Status();
		System.out.println("--------------------------------------------");
		
	    Luta UFC = new Luta();
	    UFC.marcarLuta(l[0], l[1]);
	    UFC.lutar();
	    System.out.println("--------------------------------------------");
	    l[0].Status();
	    System.out.println("--------------------------------------------");
	    l[1].Status();
	    
	    
	    
		
	}

}
