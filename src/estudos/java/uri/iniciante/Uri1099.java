package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1099
 *	RESPOSTA: Accepted
 *	TEMPO: 0.100s
 *	SUBMISSÃO: 03/08/15 17:17:05
 */

public class Uri1099 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);

		int k2 = 0, k1 = 0, valor1 = 0, valor2 = 0, n = 0, i = 0;
		
		n = s.nextInt();
		int[] valores = new int[n];
		
		while (i < n) {

			valor1 = s.nextInt();
            valor2 = s.nextInt();

			k1 = valor1;
			k2 = valor2;

			if (valor2 < valor1) {
				k1 = valor2;
				k2 = valor1;
			}

			k1 = k1 + 1;

			while (k1 < k2) {

				if ((k1 % 2) != 0) {
					valores[i] += k1;
				}
				k1++;
			}
			i++;
		}
		for (int j = 0; j < valores.length; j++) {
			System.out.printf("%d\n",valores[j]);
			
		}
 
    }
 
}