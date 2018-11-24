package estudos.java.uri.iniciante;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1156
 *	RESPOSTA: Accepted
 *	TEMPO: 0.044s
 *	SUBMISSÃO: 22/07/17 17:35:38
 */

public class Uri1156 {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder result = new StringBuilder();

		int i = 0, j = 0; 
		float valor = 1;

		while (j < 39) {
			i++;		
			j = 1+2*i;
			valor += j/Math.pow(2, i);

		}
		
		System.out.printf("%.2f\n", valor); 
 
    }
	
}

