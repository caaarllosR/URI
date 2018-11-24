package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1117
 *	RESPOSTA: Accepted
 *	TEMPO: 0.056s
 *	SUBMISSÃO: 06/08/15 13:43:03
 */

public class Uri1117 {
 
    public static void main(String[] args) throws IOException {
 
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		double nota1 = 0, nota2 = 0;

		nota1 = s.nextDouble();
		while (nota1 < 0.0 || nota1 > 10.0) {
			System.out.printf("nota invalida\n");
			nota1 = s.nextDouble();

		}

		nota2 = s.nextDouble();
		while (nota2 < 0.0 || nota2 > 10.0) {
			System.out.printf("nota invalida\n");
			nota2 = s.nextDouble();

		}

		System.out.printf("media = %.2f\n", (nota1 + nota2) / 2);
 
    }
 
}
