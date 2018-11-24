package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Locale;


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1098
 *	RESPOSTA: Accepted
 *	TEMPO: 0.044s
 *	SUBMISSÃO: 02/08/15 13:03:18
 */

public class Uri1098 {
 
    public static void main(String[] args) throws IOException {
 
Locale.setDefault(Locale.US);

		double j = 0.0;
		int i = 0, k = 0;

		while (i <= 20) {

			if (i - k == 0) {

				j += 1.0;
				System.out.printf("I=%.0f J=%.0f\n", (i / 10.0), j + (i / 10.0));
				j += 1.0;
				System.out.printf("I=%.0f J=%.0f\n", (i / 10.0), j + (i / 10.0));
				j += 1.0;
				System.out.printf("I=%.0f J=%.0f\n", (i / 10.0), j + (i / 10.0));
				k+=10;
				
			} else {
				j += 1.0;
				System.out.printf("I=%.1f J=%.1f\n", (i / 10.0), j + (i / 10.0));
				j += 1.0;
				System.out.printf("I=%.1f J=%.1f\n", (i / 10.0), j + (i / 10.0));
				j += 1.0;
				System.out.printf("I=%.1f J=%.1f\n", (i / 10.0), j + (i / 10.0));
			}

			i += 2;
			j = 0.0;
		}
 
    }
 
}
