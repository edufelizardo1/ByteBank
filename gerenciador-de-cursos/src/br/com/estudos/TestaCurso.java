package br.com.estudos;

import java.util.List;

public class TestaCurso {
	
	public static void main(String[] args) {
		Cursos javaColecoes = new Cursos("Dominandos as coleções do Java", "Eduardo Felizardo");
		
		List<Aula> aulas = javaColecoes.getAulas();
//		System.out.println(aulas);
		
//		javaColecoes.getAulas().add(new Aula("trabalhando com Array", 21));
//		System.out.println(aulas);
//		
		
		javaColecoes.adiciona(new Aula("trabalhando com Array", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		System.out.println(javaColecoes.getAulas());
//		System.out.println(aulas == javaColecoes.getAulas());
	}

}
