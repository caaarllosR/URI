package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

//	URI Online Judge | 1133
//	Resto da Divisão
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Escreva um programa que leia 2 valores X e Y e que imprima todos os valores entre eles cujo resto da 
//	divisão dele por 5 for igual a 2 ou igual a 3.
//	
//	Entrada
//	
//	O arquivo de entrada contém 2 valores positivos inteiros quaisquer, não necessariamente em ordem 
//	crescente.
//	
//	Saída
//	
//	Imprima todos os valores conforme exemplo abaixo, sempre em ordem crescente.
//	
//	Sample Input			Sample Output
//	
//	10						12
//	18						13
//							17


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1133
 *	RESPOSTA: Accepted
 *	TEMPO: 0.052s
 *	SUBMISSÃO: 09/08/15 11:28:05
 */

public class Uri1133 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);

		int n2 = 0, n1 = 0, x = 0, y = 0, resp = 0;

		x = s.nextInt();
		y = s.nextInt();

		n1 = x;
		n2 = y;

		if (y < x) {
			n1 = y;
			n2 = x;
		}
		n1++;
		while (n1 < n2) {

			if (((n1 % 5) == 2)||((n1 % 5) == 3)) {
				resp = n1;
				System.out.printf("%d\n", resp);
			}
			n1++;
		}
 
    }
 
}
