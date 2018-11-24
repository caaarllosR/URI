package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1060
 *	RESPOSTA: Accepted
 *	TEMPO: 0.052s
 *	SUBMISSÃO: 30/07/15 08:49:29
 */

public class Uri1064 {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		int  c = 0;
		double i = 0, media = 0, valor = 0;

		while (i < 6) {
			i++;
			valor = s.nextDouble();
			if (valor > 0) {
				media+=valor;
				c++;
			}

		}
		media/=c;
		
		System.out.printf("%d valores positivos\n", c);
		System.out.printf("%.1f\n", media);

 
    }
 
}
