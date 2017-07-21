package estudos.java.uri.iniciante;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */

//	URI Online Judge | 1153
//	Fatorial Simples
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Ler um valor N. Calcular e escrever seu respectivo fatorial. 
//	Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//	
//	Entrada
//	
//	A entrada cont�m um valor inteiro N (0 < N < 13).
//	
//	Sa�da
//	
//	A sa�da cont�m um valor inteiro, correspondente ao fatorial de N.
//	
//	Exemplo de Entrada			Exemplo de Sa�da
//	
//	4							24
//	
//	
//	- Agradecimentos a Cassio F.

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1153
 *	RESPOSTA: Accepted
 *	TEMPO: 0.028s
 *	SUBMISS�O: 21/08/15 03:23:30
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
