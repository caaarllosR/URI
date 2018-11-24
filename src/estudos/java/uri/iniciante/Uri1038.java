package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1038
 *	RESPOSTA: Accepted
 *	TEMPO: 0.052s
 *	SUBMISSÃO: 08/07/15 01:48:01
 */

public class Uri1038 {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		double v = 0;
		int c, q;
		c = s.nextInt();
		q = s.nextInt();

		if (c == 1) {
			v = q * 4.00;
		}
		if (c == 2) {
			v = q * 4.50;
		}
		if (c == 3) {
			v = q * 5.00;
		}
		if (c == 4) {
			v = q * 2.00;
		}
		if (c == 5) {
			v = q * 1.50;
		}
		s.close();		
		System.out.printf("Total: R$ %.2f\n", v);
 
    }
 
}