package br.com.estudos;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Cursos {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	
	
	
	public Cursos(String nome, String instrutor) {
		super();
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}
	
	@Override
	public String toString() {
		return "[Curso = " + nome + ", tempo total = " + this.getTempoTotal() + ", " +  aulas + "]";
	}
}
