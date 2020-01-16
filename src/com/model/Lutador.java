package com.model;

import com.interfaces.Procedimentos;

public class Lutador implements Procedimentos {

    private String nome;
    private String nacionalidade;
    private int idade;
    private Double altura;
    private Double peso;
    private String categoria;
    private int vitoria;
    private int derrota;
    private int empate;
    
    public Lutador(String nome,String nacionalidade,int idade,Double altura,Double peso,int vitoria,int derrota,int empate) {
    	this.nome=nome;
    	this.nacionalidade=nacionalidade;
    	this.idade=idade;
    	this.altura=altura;
    	setpeso(peso);
    	this.vitoria=vitoria;
    	this.derrota=derrota;
    	this.empate=empate;
    }

	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {

		this.nome = nome;
	}
	public String getnacionalidade() {
		return nacionalidade;
	}
	public void setnacionalidade(String nacionalidade) {
		this.nacionalidade=nacionalidade;
	}
	public int getidade() {
		return idade;
	}
	public void setidade(int idade) {
		this.idade=idade;
	}
	public Double getaltura() {
		return altura;
	}
	public void setaltura(Double altura) {
		this.altura=altura;
	}
	public Double getpeso() {
		return peso;
	}
	public void setpeso(Double peso) {
		this.peso=peso;		
        this.setcategoria();
	}
	public String getcategoria () {
		return categoria;
	}
	private void setcategoria() {		
		if(peso <= 52.2) {
			categoria = "Inválido";
		}else {
			if(peso <= 70.3) {
				categoria="Leve";
			}else {
				if(peso<=83.9) {
					categoria="Médio";
				}else {
					if(peso<=120.2) {
						categoria="Pesado";
					}else {
						categoria="Inválido";
					}
				}
			}
		}
		
	}
	public int getvitoria() {
		return vitoria;
	}
	public void setvitoria(int vitoria) {
		this.vitoria=vitoria;
	}
	public int getderrota() {
		return derrota;
	}
	public void setderrota(int derrota) {
		this.derrota=derrota;
	}
	public int getempate() {
		return empate;
	}
	public void setempate(int empate) {
		this.empate=empate;
	}

	@Override
	public void Apresentar() {
		System.out.println("Lutador : "+getnome());
		System.out.println("De Origem : "+getnacionalidade());
		System.out.println(getidade()+" anos");
		System.out.println(getaltura()+" m de altura");
		System.out.println("Pesando "+getpeso()+" Kg");
		System.out.println("Ganhou : "+getvitoria());
		System.out.println("Perdeu : "+getderrota());
		System.out.println("Empatou : "+getempate());	
	}

	@Override
	public void Status() {
		System.out.println(getnome());
		System.out.println("É um Peso "+getcategoria());
		System.out.println(getvitoria()+" Vitórias");
		System.out.println(getderrota()+" Derrotas");
		System.out.println(getempate()+" Empates");
		
		
	}

	@Override
	public void GanharLuta() {
		
		setvitoria(getvitoria()+1);
	}

	@Override
	public void PerderLuta() {
		setderrota(getderrota()+1);
		
	}

	@Override
	public void EmpatarLuta() {
		setempate(getempate()+1);
		
	}
	
}
