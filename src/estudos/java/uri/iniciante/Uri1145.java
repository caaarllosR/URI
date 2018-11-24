package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1145
 *	RESPOSTA: Accepted
 *	TEMPO: 0.620s
 *	SUBMISSÃO: 12/08/15 01:01:18
 */


public class Uri1145 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);

		int i = 1, x = 0, y = 0;

		x = s.nextInt();
		y = s.nextInt();

		while (i <= y) {

			System.out.printf("%d", i);
			if (i % x == 0) {
				System.out.printf("\n");
			} else {
				System.out.printf(" ");
			}
			i++;
		}
 
    }
 
}
