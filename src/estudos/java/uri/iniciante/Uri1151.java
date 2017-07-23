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

//	URI Online Judge | 1151
//	Fibonacci F�cil
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	A seguinte sequ�ncia de n�meros 0 1 1 2 3 5 8 13 21... � conhecida como s�rie de Fibonacci. Nessa sequ�ncia, 
//	cada n�mero, depois dos 2 primeiros, � igual � soma dos 2 anteriores. Escreva um algoritmo que leia um 
//	inteiro N (N < 46) e mostre os N primeiros n�meros dessa s�rie.
//	
//	Entrada
//	
//	O arquivo de entrada cont�m um valor inteiro N (0 < N < 46).
//	
//	Sa�da
//	
//	Os valores devem ser mostrados na mesma linha, separados por um espa�o em branco. N�o deve haver espa�o ap�s 
//	o �ltimo valor.
//	
//	Exemplo de Entrada			Exemplo de Sa�da
//	
//	5							0 1 1 2 3
//	---------------------------------------------
//	
//	-Agradecimentos a C�ssio F.

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1151
 *	RESPOSTA: Accepted
 *	TEMPO: 0.028s
 *	SUBMISS�O: 21/08/15 03:02:27
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
