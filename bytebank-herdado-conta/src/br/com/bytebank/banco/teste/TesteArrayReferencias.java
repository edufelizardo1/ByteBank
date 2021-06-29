package br.com.bytebank.banco.teste;

import java.util.Scanner;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ContaCorrente[] contaCorrente = new ContaCorrente[5];
		
		
		for (int i = 0; i < contaCorrente.length; i++) {
			System.out.println("Digite o numereo da agencia: ");
			int agencia = sc.nextInt();
			System.out.println("Digite o numereo da conta: ");
			int conta = sc.nextInt();
			contaCorrente[i] = new ContaCorrente(agencia, conta);
		}
	}

}
