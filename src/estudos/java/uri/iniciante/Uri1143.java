package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner;
 

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1143
 *	RESPOSTA: Accepted
 *	TEMPO: 0.156s
 *	SUBMISSÃO: 02/08/15 10:50:51
 */


public class Uri1143 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);

		int i = 0, n = 0, k = 0;

		n = s.nextInt();

		while (i < n) {
			
			k+=1;
			System.out.printf("%d %d %d\n", k,new Double(Math.pow(k, 2)).intValue(), new Double(Math.pow(k, 3)).intValue());
			
			i++;
		}
 
    }
 
}