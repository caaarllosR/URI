package estudos.java.uri.iniciante;

import java.io.IOException;


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1095
 *	RESPOSTA: Accepted
 *	TEMPO: 0.032s
 *	SUBMISSÃO: 02/08/15 11:04:38
 */

public class Uri1095 {
 
    public static void main(String[] args) throws IOException {
 
		int j = 60, i = 1;
		
		while (j >=0) {	

			System.out.printf("I=%d J=%d\n", i, j);

			i+=3;
			j-=5;
		}
 
    }
 
}