package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner; 


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1037
 *	RESPOSTA: Accepted
 *	TEMPO: 0.056s
 *	SUBMISSÃO: 08/07/15 01:43:18
 */

public class Uri1037 {
 
    public static void main(String[] args) throws IOException {
 
    Locale.setDefault(Locale.US);
		
		Scanner s = new Scanner(System.in);

		Double n = s.nextDouble();

		s.close();

		if (n >= 0 && n <= 25) {
			System.out.print("Intervalo [0,25]\n");
		} else if (n > 25 && n <= 50) {
			System.out.print("Intervalo (25,50]\n");
		} else if (n > 50 && n <= 75) {
			System.out.print("Intervalo (50,75]\n");
		} else if (n > 75 && n <= 100) {
			System.out.print("Intervalo (75,100]\n");		
		} else {
			System.out.print("Fora de intervalo\n");
		}
 
    }
 
}
