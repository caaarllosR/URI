package estudos.java.uri.iniciante;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1151
 *	RESPOSTA: Accepted
 *	TEMPO: 0.028s
 *	SUBMISSÃO: 21/08/15 03:02:27
 */

public class Uri1151 {
 
    public static void main(String[] args) throws IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder result = new StringBuilder();

		int x = 0, i = 1, a = 1, p = 0, t = 0;

		x = Integer.parseInt(br.readLine());

		if (x > 0) {
			result.append("0");
		}

		while (i < x) {
			result.append(" ").append(a + p);
			t = a;
			a = p;
			p = t + p;
			i++;
		}
		result.append("\n");

		bw.write(result.toString());
		bw.flush();
 
    }
 
}
