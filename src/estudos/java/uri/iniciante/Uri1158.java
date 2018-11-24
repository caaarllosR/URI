package estudos.java.uri.iniciante;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1158
 *	RESPOSTA: Accepted
 *	TEMPO: 0.052s
 *	SUBMISSÃO: 22/07/17 19:03:11
 */

public class Uri1158 {

	public static void main(String[] args) throws IOException {
		 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder result = new StringBuilder();
		
		int i = 0, j = 0;
		long N = 0, x = 0, y = 0, soma = 0;
		String[] xy;
		
		N = Long.parseLong(br.readLine());

		while (i < N) {
			if (x == 0 && y == 0){
				
				xy = br.readLine().split(" ");
				
				x = Long.parseLong(xy[0]);
				y = Long.parseLong(xy[1]);
			}
			else if (x%2 == 0){
				x++; 
			}
			else if (j < y){
				soma += x;
				x+=2;
				j++;
			}
			else {
				result.append(soma).append("\n");
				x = 0;
				y = 0;
				soma = 0;
				i++;
				j = 0;
			}
		}
		
		bw.write(result.toString());
		bw.flush();
	 }
	
}
