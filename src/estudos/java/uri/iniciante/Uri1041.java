package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner; 


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1041
 *	RESPOSTA: Accepted
 *	TEMPO: 0.052s
 *	SUBMISSÃO: 08/07/15 15:09:56
 */

public class Uri1041 {
 
    public static void main(String[] args) throws IOException {
 
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		double x, y;

		x = s.nextDouble();
		y = s.nextDouble();

		if (x > 0.0 && y > 0.0) {
			System.out.printf("Q1\n");
		} else if (x < 0.0 && y > 0.0) {
			System.out.printf("Q2\n");
		} else if (x < 0.0 && y < 0.0) {
			System.out.printf("Q3\n");
		} else if (x > 0.0 && y < 0.0) {
			System.out.printf("Q4\n");
		} else if (x == 0.0 && y!=0.0) {
			System.out.printf("Eixo Y\n");

		} else if (y == 0.0 && x!=0.0) {
			System.out.printf("Eixo X\n");

		} else if (x == 0.0 && y == 0.0) {
			System.out.printf("Origem\n");
		}
 
    }
 
}
