package estudos.java.uri.iniciante;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1155
 *	RESPOSTA: Accepted
 *	TEMPO: 0.032s
 *	SUBMISSÃO: 22/07/17 17:10:57
 */

public class Uri1155 {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder result = new StringBuilder();

		int i = 0; 
		float valor = 0;

		while (i < 100) {
			i++;			
			valor += 1.0/i;

		}
		
		System.out.printf("%.2f\n", valor); 
 
    }
	
}

