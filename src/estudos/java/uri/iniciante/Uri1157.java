package estudos.java.uri.iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1157
 *	RESPOSTA: Accepted
 *	TEMPO: 0.044s
 *	SUBMISSÃO: 22/07/17 17:47:16
 */

public class Uri1157 {

	public static void main(String[] args) throws IOException {
		 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = 0, i = 0;

		x = Integer.parseInt(br.readLine());

		while (i < x) {
			i++;
			if (x%i == 0){
				System.out.printf("%d\n", i); 

			}
		}
	 }
	
}
