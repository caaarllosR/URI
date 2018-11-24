package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1132
 *	RESPOSTA: Accepted
 *	TEMPO: 0.064s
 *	SUBMISSÃO: 09/08/15 11:02:30
 */

public class Uri1132 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);

		int n2 = 0, n1 = 0, x = 0, y = 0, n = 0, i = 0, resp = 0;

		x = s.nextInt();
		y = s.nextInt();

		n1 = x;
		n2 = y;

		if (y < x) {
			n1 = y;
			n2 = x;
		}

		while (n1 <= n2) {

			if ((n1 % 13) != 0) {
				resp += n1;
			}
			n1++;
		}

		System.out.printf("%d\n", resp);
 
    }
 
}
