package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner; 


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1043
 *	RESPOSTA: Accepted
 *	TEMPO: 0.056s
 *	SUBMISSÃO: 22/07/15 17:42:11
 */

public class Uri1043 {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);
        double a, b, c;
 
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        s.close();
 
        if ((Math.abs(b - c) < a && a < (b + c))
                && (Math.abs(a - c) < b && b < (a + c))
                && (Math.abs(a - b) < c && c < (a + b))) {
 
            System.out.printf("Perimetro = %.1f\n", a + b + c);
 
        } else {
            System.out.printf("Area = %.1f\n", (1.0 / 2.0) * (a + b) * c);
        }
 
    }
 
}
