package j11.teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class TestaJavaIO {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new FileInputStream("leitura.txt"));
		PrintStream ps = new PrintStream("saida.txt");
		
		
		while(sc.hasNextLine()){
			String linha = sc.nextLine();
			ps.println(linha);
		}
		ps.close();
		sc.close();
	}
	

}
