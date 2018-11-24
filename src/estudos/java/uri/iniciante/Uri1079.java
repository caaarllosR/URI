package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner; 



/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1079
 *	RESPOSTA: Accepted
 *	TEMPO: 0.128s
 *	SUBMISSÃO: 01/08/15 19:29:42
 */

public class Uri1079 {
 
    public static void main(String[] args) throws IOException {
 
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		int n = 0, i = 0;
		double v1, v2, v3;

		n = s.nextInt();
		s.nextLine();

		while (i < n) {
			
			v1 = s.nextDouble();
			v2 = s.nextDouble();
			v3 = s.nextDouble();

			System.out.printf("%.1f\n",(v1 * 2 + v2 * 3 + v3 * 5) / (2 + 3 + 5));

			i++;
		}
 
    }
 
}