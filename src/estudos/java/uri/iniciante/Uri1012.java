package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner; 


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1012
 *	RESPOSTA: Accepted
 *	TEMPO: 0.060s
 *	SUBMISSÃO: 30/04/15 13:58:02
 */

public class Uri1012 {
 
    public static void main(String[] args) throws IOException {
 
		Locale.setDefault(Locale.US);
		double a, b, c, areaTri, areaC, areaTra, areaQ, areaR, pi = 3.14159;
		Scanner s = new Scanner(System.in);
		
		a = s.nextDouble();
		b = s.nextDouble();
		c = s.nextDouble();
		
		areaTri = a*c/2;
		areaC = pi * c*c;
		areaTra = c*(a+b)/2;
		areaQ = b*b;
		areaR = a*b;
		
		System.out.printf("TRIANGULO: %.3f\n"
						+ "CIRCULO: %.3f\n"
						+ "TRAPEZIO: %.3f\n"
						+ "QUADRADO: %.3f\n"
						+ "RETANGULO: %.3f\n"
						,areaTri,areaC,areaTra,areaQ,areaR);
 
    }
 
}
