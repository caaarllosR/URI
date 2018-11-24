package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1060
 *	RESPOSTA: Accepted
 *	TEMPO: 0.048s
 *	SUBMISSÃO: 30/07/15 03:40:51
 */

public class Uri1060 {
 
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		int c = 0;
		double i = 0;

		while (i < 6) {
			i++;

			if (s.nextDouble() > 0) {
				c++;
			}

		}
		System.out.printf("%d valores positivos\n", c);
 
    }
 
}
