package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner; 


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1045
 *	RESPOSTA: Accepted
 *	TEMPO: 0.056s
 *	SUBMISSÃO: 22/07/15 17:44:24
 */

public class Uri1045 {
 
    public static void main(String[] args) throws IOException {
 
Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		float a, b, c, maiorAB, maiorAC, maiorABC, maiorBC, A, B, C;

		a = s.nextFloat();
		b = s.nextFloat();
		c = s.nextFloat();
		s.close();

		maiorAB = (a + b + Math.abs(a - b)) / 2;
		maiorAC = (a + c + Math.abs(a - c)) / 2;
		maiorBC = (b + c + Math.abs(b - c)) / 2;
		maiorABC = (maiorAB + maiorAC + Math.abs(maiorAB - maiorAC)) / 2;

		if (maiorABC == a) {
			A = a;
			B = b;
			C = c;
		}

		else if (maiorABC == b) {
			A = b;
			B = a;
			C = c;

		} else {
			A = c;
			B = a;
			C = b;
		}

		if (A >= (B + C)) {
			System.out.println("NAO FORMA TRIANGULO");

		} else if (Math.pow(A, 2) == (Math.pow(B, 2) + Math.pow(C, 2))) {
			System.out.println("TRIANGULO RETANGULO");

		} else if (Math.pow(A, 2) > (Math.pow(B, 2) + Math.pow(C, 2))) {
			System.out.println("TRIANGULO OBTUSANGULO");

		} else if (Math.pow(A, 2) < (Math.pow(B, 2) + Math.pow(C, 2))) {
			System.out.println("TRIANGULO ACUTANGULO");

		}

		if (A == B && B == C) {
			System.out.println("TRIANGULO EQUILATERO");

		} else if (A == B || B == C || C == A) {
			System.out.println("TRIANGULO ISOSCELES");
		}
 
    }
 
}
