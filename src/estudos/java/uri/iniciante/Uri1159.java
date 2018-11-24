package estudos.java.uri.iniciante;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1159
 *	RESPOSTA: Accepted
 *	TEMPO: 0.040s
 *	SUBMISSÃO: 22/07/17 21:17:49
 */


public class Uri1159 {

	public static void main(String[] args) throws IOException {
		 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
		StringBuilder result = new StringBuilder();
		
		int j = 0, x = 0, soma = 0;
		
		x = Integer.parseInt(br.readLine());

		while (x != 0) {
						
			if (!(x%2==0)){
				x++;
			}
			while(j < 5){				
				soma+=x;
				x+=2;
				j++;
			}
			
			result.append(soma).append("\n");
			soma = 0;
			j = 0;
			x = Integer.parseInt(br.readLine());
		}
		
		bw.write(result.toString());
		bw.flush();
	 }
	
}
