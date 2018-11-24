package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1074
 *	RESPOSTA: Accepted
 *	TEMPO: 0.096s
 *	SUBMISSÃO: 01/08/15 16:15:31
 */

public class Uri1074 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);

		long x = 0;
		int n = 0, i = 0, in = 0, out = 0;

		n = s.nextInt();

		String[] r = new String[n];
		s.nextLine();

		while (i < n) {

			x = s.nextInt();
			i++;

			if (x == 0) {
				r[i - 1] = "NULL";
				continue;
			}

			if (x % 2 == 0) {
				r[i - 1] = "EVEN ";

			} else {
				r[i - 1] = "ODD ";
			}

			if (x > 0) {
				r[i - 1] += "POSITIVE";

			} else {
				r[i - 1] += "NEGATIVE";
			}

		}
		for (int j = 0; j < r.length; j++) {
			System.out.println(r[j]);
		}
 
    }
 
}