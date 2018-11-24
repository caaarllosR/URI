package estudos.java.uri.iniciante;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1001
 *	RESPOSTA: Accepted
 *	TEMPO: 0.052s
 *	SUBMISSÃO: 29/04/15 19:59:28
 */

public class Uri1001 {
 	
 	public PrintStream somaAB() {
		
		int A;
		int B;
		int X;
		Scanner s = new Scanner(System.in);
		A = s.nextInt();
		B = s.nextInt();
		X = A + B;
		s.close();
		return System.out.printf("X = %d\n", X );
	}
	
    public static void main(String[] args) throws IOException {
 
    new Uri1001().somaAB();
 
    }
 
}
