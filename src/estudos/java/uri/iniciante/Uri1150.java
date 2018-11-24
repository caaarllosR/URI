package estudos.java.uri.iniciante;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter; 

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1150
 *	RESPOSTA: Accepted
 *	TEMPO: 0.040s
 *	SUBMISSÃO: 15/08/15 16:32:43
 */

public class Uri1150 {
 
    public static void main(String[] args) throws IOException {
 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder valor = new StringBuilder();

		int x = 0, z = 0, acum, result = 1;

		x = Integer.parseInt(br.readLine());
		acum = x;
		while (x >= (z = Integer.parseInt(br.readLine())));

		while (acum <= z) {
			
			x++;
			acum += x ;
			result++;
		}
		bw.write(valor.append(new Integer(result).toString()).append("\n").toString());
		bw.flush();
 
    }
 
}
