package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1073
 *	RESPOSTA: Accepted
 *	TEMPO: 0.096s
 *	SUBMISSÃO: 01/08/15 15:30:44
 */

public class Uri1073 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);

		int n = 0, i = 1;

		n = s.nextInt();

		while (i <= n) {

			if (i % 2 == 0) {

				System.out.printf(i+"^2 = %d\n", ((int) Math.pow(i, 2)));
			}
			i++;
		}
 
    }
 
}
