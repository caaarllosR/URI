package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner; 


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1066
 *	RESPOSTA: Accepted
 *	TEMPO: 0.044s
 *	SUBMISSÃO: 30/07/15 09:07:15
 */

public class Uri1066 {
 
    public static void main(String[] args) throws IOException {
 
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		int k = 0, par = 0, i = 0, n = 0, p = 0, valor = 0;

		while (k < 5) {
			k++;
			valor = s.nextInt();

			if (valor > 0) {
				p++;
			} else if (valor < 0) {
				n++;
			}

			if ((valor % 2) == 0) {
				par++;
			} else {
				i++;
			}

		}

		System.out.printf("%d valor(es) par(es)\n", par);
		System.out.printf("%d valor(es) impar(es)\n", i);
		System.out.printf("%d valor(es) positivo(s)\n", p);
		System.out.printf("%d valor(es) negativo(s)\n", n);
 
    }
 
}