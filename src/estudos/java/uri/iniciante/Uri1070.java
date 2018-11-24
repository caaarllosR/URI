package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner;


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1070
 *	RESPOSTA: Accepted
 *	TEMPO: 0.052s
 *	SUBMISSÃO: 30/07/15 09:31:32
 */

public class Uri1070 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);
 		int k = 0, valor = 0;
		valor = s.nextInt();

		if ((valor % 2) != 0) {

		} else {
			valor += 1;
		}

		while (k < 6) {
			System.out.printf("%d\n", (valor + (k * 2)));
			k++;
		}
 
    }
 
}