package br.com.estudos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
	
	public static void main(String[] args) {
		Cursos javaColecoes = new Cursos("Dominandos as coleções do Java", "Eduardo Felizardo");
		
		javaColecoes.adiciona(new Aula("trabalhando com Array", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

		List<Aula> aulasimutaveis = javaColecoes.getAulas();
		System.out.println(aulasimutaveis);
		
		List<Aula> aulas = new ArrayList<>(aulasimutaveis);
		
		Collections.sort(aulas);
		System.out.println(aulas);
		
		System.out.println(javaColecoes.getTempoTotal());

		System.out.println(javaColecoes);
	}

}
