package estudos.java.uri.iniciante;

import java.io.IOException;


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1096
 *	RESPOSTA: Accepted
 *	TEMPO: 0.040s
 *	SUBMISSÃO: 02/08/15 11:19:34
 */

public class Uri1096 {
 
    public static void main(String[] args) throws IOException {
 
		int j = 7, i = 1;
		
		while (i <=9) {	

			System.out.printf("I=%d J=%d\n", i, j);
			j--;
			System.out.printf("I=%d J=%d\n", i, j);
			j--;
			System.out.printf("I=%d J=%d\n", i, j);
			i+=2;
			j=7;
			
		}
 
    }
 
}