package estudos.java.uri.iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1154
 *	RESPOSTA: Accepted
 *	TEMPO: 0.040s
 *	SUBMISSÃO: 22/07/17 15:52:45
 */

public class Uri1154 {

	public static void main(String[] args) throws IOException {
		 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = 0, i = 0;
		float count = 0;
		
		x = Integer.parseInt(br.readLine());

		while (x > -1) {
			count+=x;
			i++;
			x = Integer.parseInt(br.readLine());
		}
		
		System.out.printf("%.2f\n", count/i); 
    }
	
}
