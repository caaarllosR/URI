package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1065
 *	RESPOSTA: Accepted
 *	TEMPO: 0.052s
 *	SUBMISSÃO: 30/07/15 08:55:56
 */

public class Uri1065 {
	 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		int  i = 0, c = 0, valor = 0;;

		while (i < 5) {
			i++;
			valor = s.nextInt();
			if ((valor %2)== 0) {
				c++;
			}

		}
		
		System.out.printf("%d valores pares\n", c);

 
    }
 
}
