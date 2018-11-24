package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner;


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1009
 *	RESPOSTA: Accepted
 *	TEMPO: 0.052s
 *	SUBMISSÃO: 30/04/15 01:09:24
 */

public class Uri1009 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);
		
		String nome;
		double salarioFixo, valorVendas;

		nome = s.nextLine();
		salarioFixo = Double.parseDouble(s.nextLine());
		valorVendas = Double.parseDouble(s.nextLine());
		s.close();

		System.out.printf("TOTAL = R$ %.2f\n", salarioFixo+(valorVendas*15)/100);
 
    }
 
}
