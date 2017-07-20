package estudos.java.uri.iniciante;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

public class Uri1146 {
 
    public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder result = new StringBuilder();

		int x = 0, i = 2;

		while ((x = Integer.parseInt(br.readLine())) != 0) {
			
			result.append(1);
			while (i <= x) {
				result.append(" ").append(i);
				i++;
			}
			i=2;
			result.append("\n");

		}
		bw.write(result.toString());
		bw.flush(); 
    }
 
}