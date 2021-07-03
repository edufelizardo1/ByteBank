package com.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaFileWrite {

	public static void main(String[] args) throws IOException {
		
		
		// Fluxo de entrada de arquivo
		
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		FileWriter fw = new FileWriter("lorem2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
		bw.write(System.lineSeparator());
		bw.write("digdigdigdi hiudhiuhd oóhwqeud");
		
		fw.close();
	}

}
