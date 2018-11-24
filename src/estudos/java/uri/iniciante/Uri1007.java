package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1007
 *	RESPOSTA: Accepted
 *	TEMPO: 0.056s
 *	SUBMISSÃO: 30/04/15 00:38:32
 */


public class Uri1007 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);
		int DIFERENCA, A, B, C, D;

		A = Integer.parseInt(s.nextLine());
		B = Integer.parseInt(s.nextLine());
		C = Integer.parseInt(s.nextLine());
		D = Integer.parseInt(s.nextLine());
		DIFERENCA = (A * B - C * D);

		s.close();

		System.out.printf("DIFERENCA = %d\n", DIFERENCA);
 
    }
 
}
