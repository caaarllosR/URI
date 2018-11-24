package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1071
 *	RESPOSTA: Accepted
 *	TEMPO: 0.080s
 *	SUBMISSÃO: 30/07/15 11:05:23
 */

public class Uri1071 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);

		int k2 = 0, k1 = 0, valor1 = 0, valor2 = 0, r = 0;

		valor1 = s.nextInt();
		valor2 = s.nextInt();

		k1 = valor1;
		k2 = valor2;

		if (valor2 < valor1) {
			k1 = valor2;
			k2 = valor1;
		}
		
		k1 = k1+1;
		
		while (k1 < k2) {

			
			if ((k1 % 2) != 0) {
				r+=k1;
			}
			k1++;
		}
		System.out.printf("%d\n", r);
 
    }
 
}
