package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1072
 *	RESPOSTA: Accepted
 *	TEMPO: 0.076s
 *	SUBMISSÃO: 01/08/15 15:10:45
 */

public class Uri1072 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);
		long x = 0;
		int n = 0, i = 0, in = 0, out = 0;

		n = s.nextInt();
		s.nextLine();
		
		while (i < n) {

			x = s.nextLong();

			if (x <= 20 && x >= 10) {
				in++;
			} else {
				out++;
			}
			i++;
		}
		
		System.out.printf("%d in\n", in);
		System.out.printf("%d out\n", out);
 
    }
 
}
