package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1144
 *	RESPOSTA: Accepted
 *	TEMPO: 0.168s
 *	SUBMISSÃO: 12/08/15 00:14:34
 */

public class Uri1144 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);

		int i = 1, n = 0;

		n = s.nextInt();

		while (i <= n) {

			System.out.printf("%d %d %d\n", i, new Double(Math.pow(i, 2)).intValue(), new Double(Math.pow(i, 3)).intValue());
			System.out.printf("%d %d %d\n", i, new Double(Math.pow(i, 2)).intValue() + 1, new Double(Math.pow(i, 3)).intValue() + 1);

			i++;
		}
 
    }
 
}
