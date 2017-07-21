package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */

//	URI Online Judge | 1145
//	Sequ�ncia L�gica 2
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Escreva um programa que leia dois valores X e Y. A seguir, mostre uma sequ�ncia de 1 at� Y, passando para
//	a pr�xima linha a cada X n�meros.
//	
//	Entrada
//	
//	O arquivo de entrada cont�m dois valores inteiros, (1 < X < 20) e (X < Y < 100000).
//	
//	Sa�da
//	
//	Cada sequ�ncia deve ser impressa em uma linha apenas, com 1 espa�o em branco entre cada n�mero, conforme 
//	exemplo abaixo. N�o deve haver espa�o em branco ap�s o �ltimo valor da linha.
//	
//	Exemplo de Entrada			Exemplo de Sa�da
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
//	- Agradecimentos a C�ssio F.

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1145
 *	RESPOSTA: Accepted
 *	TEMPO: 0.620s
 *	SUBMISS�O: 12/08/15 01:01:18
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
