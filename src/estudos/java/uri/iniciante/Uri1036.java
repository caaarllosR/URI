package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner; 


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1036
 *	RESPOSTA: Accepted
 *	TEMPO: 0.060s
 *	SUBMISSÃO: 06/05/15 22:50:29
 */

public class Uri1036 {
 
    public static void main(String[] args) throws IOException {
 
    	Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		double a, b, c, d, R1, R2;

		a = s.nextDouble();
		b = s.nextDouble();
		c = s.nextDouble();
		d = b * b - 4 * a * c;
		s.close();

		if (a != 0) {
			if (d >= 0) {
				R1 = ((-b) + Math.sqrt(d)) / (2 * a);
				R2 = ((-b) - Math.sqrt(d)) / (2 * a);
				System.out.printf("R1 = %.5f\nR2 = %.5f\n", R1, R2);
			} else {
				System.out.print("Impossivel calcular\n");
			}
		} else {
			System.out.print("Impossivel calcular\n");
		}
 
    }
 
}
