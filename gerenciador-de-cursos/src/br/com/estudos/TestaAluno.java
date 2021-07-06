package br.com.estudos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAluno {

	public static void main(String[] args) {
		Set<String>alunos =  new HashSet<>();
		
		alunos.add("Eduardo");
		alunos.add("Rodrigo");
		alunos.add("Bruno");
		alunos.add("Tarson");
		alunos.add("Mario");
		alunos.add("Fabio");
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println();
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		System.out.println();
		System.out.println(alunos);
		
		System.out.println();
		System.out.println(alunos.contains("Eduardo"));
		
		List<String> alunosEmLista = new ArrayList<String>(alunos);
		System.out.println(alunosEmLista);
	}
}
