package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

//	URI Online Judge | 1074
//	Par ou Ímpar
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida. Para cada 
//	valor lido, mostre uma mensagem em inglês dizendo se este valor lido é par (EVEN), ímpar (ODD), positivo 
//	(POSITIVE) ou negativo (NEGATIVE). No caso do valor ser igual a zero (0), embora a descrição correta seja 
//	(EVEN NULL), pois por definição zero é par, seu programa deverá imprimir apenas NULL.
//	
//	Entrada
//	
//	A primeira linha da entrada contém um valor inteiro N(N < 10000) que indica o número de casos de teste. 
//	Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).
//	
//	Saída
//	
//	Para cada caso, imprima uma mensagem correspondente, de acordo com o exemplo abaixo. Todas as letras 
//	deverão ser maiúsculas e sempre deverá haver um espaço entre duas palavras impressas na mesma linha.
//	
//	Exemplo de Entrada			Exemplo de Saída
//	
//	4							ODD NEGATIVE	
//	-5							NULL
//	0							ODD POSITIVE
//	3							EVEN NEGATIVE
//	-4

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1074
 *	RESPOSTA: Accepted
 *	TEMPO: 0.096s
 *	SUBMISSÃO: 01/08/15 16:15:31
 */

public class Uri1074 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);

		long x = 0;
		int n = 0, i = 0, in = 0, out = 0;

		n = s.nextInt();

		String[] r = new String[n];
		s.nextLine();

		while (i < n) {

			x = s.nextInt();
			i++;

			if (x == 0) {
				r[i - 1] = "NULL";
				continue;
			}

			if (x % 2 == 0) {
				r[i - 1] = "EVEN ";

			} else {
				r[i - 1] = "ODD ";
			}

			if (x > 0) {
				r[i - 1] += "POSITIVE";

			} else {
				r[i - 1] += "NEGATIVE";
			}

		}
		for (int j = 0; j < r.length; j++) {
			System.out.println(r[j]);
		}
 
    }
 
}