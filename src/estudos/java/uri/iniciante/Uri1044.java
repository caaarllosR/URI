package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

	
/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1044
 *	RESPOSTA: Accepted
 *	TEMPO: 0.048s
 *	SUBMISSÃO: 22/07/15 17:42:57
 */

public class Uri1044 {
 
    public static void main(String[] args) throws IOException {
 
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		double a, b;

		a = s.nextInt();
		b = s.nextInt();
		s.close();

		if (a > b) {
			if ((a * 1.0) % (b * 1.0) == 0) {
				System.out.println("Sao Multiplos");
			} else {
				System.out.println("Nao sao Multiplos");
			}
		} else {
			if ((b * 1.0) % (a * 1.0) == 0) {
				System.out.println("Sao Multiplos");
			} else {
				System.out.println("Nao sao Multiplos");
			}
		}
 
    }
 
}
