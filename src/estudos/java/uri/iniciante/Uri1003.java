package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 

	
/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1003
 *	RESPOSTA: Accepted
 *	TEMPO: 0.060s
 *	SUBMISSÃO: 29/04/15 21:30:38
 */

public class Uri1003 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);

		int A = Integer.parseInt(s.nextLine());
		int B = Integer.parseInt(s.nextLine());
		int SOMA;
		SOMA = A + B;
		s.close();

		System.out.printf("SOMA = %d\n", SOMA);
 
    }
 
}
