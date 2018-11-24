package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner;
 

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1133
 *	RESPOSTA: Accepted
 *	TEMPO: 0.052s
 *	SUBMISSÃO: 09/08/15 11:28:05
 */

public class Uri1133 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);

		int n2 = 0, n1 = 0, x = 0, y = 0, resp = 0;

		x = s.nextInt();
		y = s.nextInt();

		n1 = x;
		n2 = y;

		if (y < x) {
			n1 = y;
			n2 = x;
		}
		n1++;
		while (n1 < n2) {

			if (((n1 % 5) == 2)||((n1 % 5) == 3)) {
				resp = n1;
				System.out.printf("%d\n", resp);
			}
			n1++;
		}
 
    }
 
}
