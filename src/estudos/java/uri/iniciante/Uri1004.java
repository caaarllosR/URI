package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1004
 *	RESPOSTA: Accepted
 *	TEMPO: 0.064s
 *	SUBMISSÃO: 29/04/15 21:36:01
 */

public class Uri1004 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);

		int A = Integer.parseInt(s.nextLine());
		int B = Integer.parseInt(s.nextLine());
		int PROD;
		PROD = A * B;
		s.close();

		System.out.printf("PROD = %d\n", PROD);
    }
 
}
