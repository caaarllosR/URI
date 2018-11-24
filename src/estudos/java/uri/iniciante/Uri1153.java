package estudos.java.uri.iniciante;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1153
 *	RESPOSTA: Accepted
 *	TEMPO: 0.028s
 *	SUBMISSÃO: 21/08/15 03:23:30
 */

public class Uri1153 {
 
    public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder result = new StringBuilder();

		int x = 0, i = 0, n = 0; 
		long valor = 1;

		x = Integer.parseInt(br.readLine());
		n = x;
		if (n == 0) {
			result.append(1);
		}
		while (i < x) {
			valor *= (n - i);
			i++;
		}
		result.append(valor).append("\n");

		bw.write(result.toString());
		bw.flush();
 
    }
 
}
