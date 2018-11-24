package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner; 


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1010
 *	RESPOSTA: Accepted
 *	TEMPO: 0.060s
 *	SUBMISSÃO: 30/04/15 02:59:16
 */

public class Uri1010 {
 
    public static void main(String[] args) throws IOException {
 
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		int codigo1, pecas1, codigo2, pecas2;
		double valor1, valor2;

		codigo1 = s.nextInt();
		pecas1 = s.nextInt();
		valor1 = s.nextDouble();		
		
		codigo2 = s.nextInt();
		pecas2 = s.nextInt();
		valor2 = s.nextDouble();
		s.close();	

		System.out.printf("VALOR A PAGAR: R$ %.2f\n", pecas1*valor1+pecas2*valor2);

    }
 
}