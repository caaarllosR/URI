package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner;


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1142
 *	RESPOSTA: Accepted
 *	TEMPO: 0.412s
 *	SUBMISSÃO: 09/08/15 12:35:15
 */

public class Uri1142 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);

		int i = 0, n = 0, k = 0;

		n = s.nextInt();

		while (i < n) {
			
			System.out.printf("%d %d %d PUM\n", 1+k,2+k,3+k);
			k+=4;
			i++;
		}
 
    }
 
}
