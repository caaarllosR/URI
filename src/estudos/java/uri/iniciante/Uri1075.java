package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1075
 *	RESPOSTA: Accepted
 *	TEMPO: 0.044s
 *	SUBMISSÃO: 01/08/15 16:23:04
 */

public class Uri1075 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);

		int n = 0, i = 0;

		n = s.nextInt();

		while (i < 10000) {

			if (i % n == 2) {

				System.out.println(i);
			}
			i++;
		}
 
    }
 
}
