package br.com.estudos;

public class Aluno {

	private String nome;
	private int numeromatricula;
	
	
	public Aluno(String nome, int numeromatricula) {
		super();
		this.nome = nome;
		this.numeromatricula = numeromatricula;
	}


	public String getNome() {
		return nome;
	}


	public int getNumeromatricula() {
		return numeromatricula;
	}
	
	
}
