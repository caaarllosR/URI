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

//	URI Online Judge | 1151
//	Fibonacci Fácil
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série de Fibonacci. Nessa sequência, 
//	cada número, depois dos 2 primeiros, é igual à soma dos 2 anteriores. Escreva um algoritmo que leia um 
//	inteiro N (N < 46) e mostre os N primeiros números dessa série.
//	
//	Entrada
//	
//	O arquivo de entrada contém um valor inteiro N (0 < N < 46).
//	
//	Saída
//	
//	Os valores devem ser mostrados na mesma linha, separados por um espaço em branco. Não deve haver espaço após 
//	o último valor.
//	
//	Exemplo de Entrada			Exemplo de Saída
//	
//	5							0 1 1 2 3
//	---------------------------------------------
//	
//	-Agradecimentos a Cássio F.

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
