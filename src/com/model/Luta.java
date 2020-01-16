package com.model;

import java.util.Random;

public class Luta {
   //ATRIBUTOS
  	private Lutador desafiado ;
  	private Lutador desafiante;
  	private int rounds;
  	private boolean aprovada;
  	
  	//MÉTODOS ESPECIAIS
	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
  	//MÉTODOS
  	public void marcarLuta(Lutador l1,Lutador l2) {
  		if(l1.getcategoria()==l2.getcategoria() && l1 != l2) {
  			this.aprovada=true;
  			this.desafiado=l1;
  			this.desafiante=l2;
  		}else {
  			this.aprovada=false;
  			this.desafiado=null;
  			this.desafiante=null;
  		}
  		
  	}
  	
  	public void lutar() {
  		if(this.aprovada) {
  			System.out.println("### DESAFIADO ###");
  			this.desafiado.Apresentar();
  			System.out.println("### DESAFIADO ###");
  			this.desafiante.Apresentar();
  			
  			Random aleatorio = new Random();
  			int vencedor = aleatorio.nextInt(3);
  			
  			switch(vencedor) {
  			
  			case 0 :
  				System.out.println("EMPATOU");
  				this.desafiado.EmpatarLuta();
  				this.desafiante.EmpatarLuta();
  				break;
  				
  			case 1 :
  				System.out.println("Vitória do "+this.desafiante.getnome());
  				this.desafiante.GanharLuta();
  				this.desafiado.PerderLuta();
  				break;	
  			
  			case 2 :
  				System.out.println("Vitória do "+this.desafiado.getnome());
  				this.desafiado.GanharLuta();
  				this.desafiante.PerderLuta();
  				break;	
  			}
  			
  		}else {
  			System.out.println("A luta não pode acontecer");
  		}
  	}


}
