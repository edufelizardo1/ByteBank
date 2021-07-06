package br.com.estudos;

import java.util.Collection;

public class Aula implements Comparable<Aula>{
	
	private String titulo;
	private int tempo;
	
	
	
	public Aula(String titulo, int tempo) {
		super();
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public int getTempo() {
		return tempo;
	}

	@Override
	public String toString() {
		return "Aula: [titulo=" + titulo + ", tempo=" + tempo + "]";
	}

	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
	}
	
	
}
