package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1067
 *	RESPOSTA: Accepted
 *	TEMPO: 0.048s
 *	SUBMISSÃO: 30/07/15 09:20:48
 */

public class Uri1067 {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		int k = 0, valor = 0;
		valor = s.nextInt();

		while (k < valor) {

			k++;
			if ((k % 2) != 0) {

				System.out.printf("%d\n", k);
			}
		}
 
    }
 
}
