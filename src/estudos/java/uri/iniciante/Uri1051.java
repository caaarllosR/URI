package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner; 


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1051
 *	RESPOSTA: Accepted
 *	TEMPO: 0.052s
 *	SUBMISSÃO: 30/07/15 03:12:46
 */

public class Uri1051 {
 
    public static void main(String[] args) throws IOException {
 
Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		float a, imposto;

		a = s.nextFloat();

		if (a >= 0.00 && a <= 2000.00) {
			System.out.printf("Isento\n");
			
		} else if ((a >= 2000.01) && (a <= 3000.00)) {
			imposto = ((a-2000) * 8) / 100;
			System.out.printf("R$ %.2f\n", imposto);
			
		} else if ((a >= 3000.01) && (a <= 4500.00)) {
			imposto = (((a - 3000) * 18) / 100) + 80;
			System.out.printf("R$ %.2f\n", imposto);
			
		} else if (a >= 4500.01) {
			 imposto = (((a - 4500) * 28) / 100) + 80 + 270;
			 System.out.printf("R$ %.2f\n", imposto);
		}
 
    }
 
}