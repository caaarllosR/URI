package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

//	URI Online Judge | 1145
//	Sequência Lógica 2
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Escreva um programa que leia dois valores X e Y. A seguir, mostre uma sequência de 1 até Y, passando para
//	a próxima linha a cada X números.
//	
//	Entrada
//	
//	O arquivo de entrada contém dois valores inteiros, (1 < X < 20) e (X < Y < 100000).
//	
//	Saída
//	
//	Cada sequência deve ser impressa em uma linha apenas, com 1 espaço em branco entre cada número, conforme 
//	exemplo abaixo. Não deve haver espaço em branco após o último valor da linha.
//	
//	Exemplo de Entrada			Exemplo de Saída
//	
//	3 99						1 2 3
//								4 5 6
//								7 8 9
//								10 11 12
//								...
//								97 98 99
//	--------------------------------------------
//	
//	
//	- Agradecimentos a Cássio F.

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1145
 *	RESPOSTA: Accepted
 *	TEMPO: 0.620s
 *	SUBMISSÃO: 12/08/15 01:01:18
 */


public class Uri1145 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);

		int i = 1, x = 0, y = 0;

		x = s.nextInt();
		y = s.nextInt();

		while (i <= y) {

			System.out.printf("%d", i);
			if (i % x == 0) {
				System.out.printf("\n");
			} else {
				System.out.printf(" ");
			}
			i++;
		}
 
    }
 
}
