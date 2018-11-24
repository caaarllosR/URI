package estudos.java.uri.iniciante;

import java.io.IOException;


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1097
 *	RESPOSTA: Accepted
 *	TEMPO: 0.024s
 *	SUBMISSÃO: 02/08/15 11:21:17
 */

public class Uri1097 {
 
    public static void main(String[] args) throws IOException {
 
 		int j = 7, i = 1;
		
		while (i <=9) {	

			System.out.printf("I=%d J=%d\n", i, j);
			j--;
			System.out.printf("I=%d J=%d\n", i, j);
			j--;
			System.out.printf("I=%d J=%d\n", i, j);
			i+=2;
			j+=4;
			
		}
 
    }
 
}
