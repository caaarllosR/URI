package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

//	URI Online Judge | 1132
//	Múltiplos de 13
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Escreva um algoritmo que leia 2 valores inteiros X e Y calcule a soma dos números que não são múltiplos 
//	de 13 entre X e Y, incluindo ambos.
//	
//	Entrada
//	
//	O arquivo de entrada contém 2 valores inteiros quaisquer, não necessariamente em ordem crescente.
//	
//	Saída
//	
//	Imprima a soma de todos os valores não divisíveis por 13 entre os dois valores lidos na entrada, 
//	inclusive ambos se for o caso.
//	
//	Sample Input			Sample Output
//	
//	100						13954
//	200
//	-------------------------------------
//	
//	
//	- Agradecimentos a Cássio F.


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1132
 *	RESPOSTA: Accepted
 *	TEMPO: 0.064s
 *	SUBMISSÃO: 09/08/15 11:02:30
 */

public class Uri1132 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);

		int n2 = 0, n1 = 0, x = 0, y = 0, n = 0, i = 0, resp = 0;

		x = s.nextInt();
		y = s.nextInt();

		n1 = x;
		n2 = y;

		if (y < x) {
			n1 = y;
			n2 = x;
		}

		while (n1 <= n2) {

			if ((n1 % 13) != 0) {
				resp += n1;
			}
			n1++;
		}

		System.out.printf("%d\n", resp);
 
    }
 
}
