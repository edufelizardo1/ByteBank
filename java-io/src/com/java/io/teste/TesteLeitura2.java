package com.java.io.teste;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(new File("contas.csv"));
		
		
		while (scanner.hasNextLine()) {
			
			String linha = scanner.nextLine();
			System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String tipo = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int conta = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			
			String valorFormatado = String.format(new Locale("pt", "BR") ,"Tipo: %s\nAgencia: %04d\nNúmero da conta: %04d\nTítular: %s\nSaldo: R$ %.2f\n\n",
					tipo, agencia, conta, titular, saldo);
			System.out.println(valorFormatado);
			
//			String[] valores = linha.split(",");
//			System.out.println(Arrays.toString(valores));
			
			linhaScanner.close();
		}
		
		scanner.close();
	}

}
