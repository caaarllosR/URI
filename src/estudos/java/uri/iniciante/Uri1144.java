package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */

//	URI Online Judge | 1144
//	Sequ�ncia L�gica
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Escreva um programa que leia um valor inteiro N. N * 2 linhas de sa�da ser�o apresentadas na execu��o 
//	do programa, seguindo a l�gica do exemplo abaixo. Para valores com mais de 6 d�gitos, todos os d�gitos 
//	devem ser apresentados.
//	
//	Entrada
//	
//	O arquivo de entrada cont�m um n�mero inteiro positivo N (1 < N < 1000).
//	
//	Sa�da
//	
//	Imprima a sa�da conforme o exemplo fornecido.
//	
//	Exemplo de Entrada			Exemplo de Sa�da
//	
//	5							1 1 1
//								1 2 2
//								2 4 8
//								2 5 9
//								3 9 27
//								3 10 28
//								4 16 64
//								4 17 65
//								5 25 125
//								5 26 126
//	--------------------------------------------							
//	
//
//	- Agradecimentos a C�ssio F.

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1144
 *	RESPOSTA: Accepted
 *	TEMPO: 0.168s
 *	SUBMISS�O: 12/08/15 00:14:34
 */

public class Uri1144 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);

		int i = 1, n = 0;

		n = s.nextInt();

		while (i <= n) {

			System.out.printf("%d %d %d\n", i, new Double(Math.pow(i, 2)).intValue(), new Double(Math.pow(i, 3)).intValue());
			System.out.printf("%d %d %d\n", i, new Double(Math.pow(i, 2)).intValue() + 1, new Double(Math.pow(i, 3)).intValue() + 1);

			i++;
		}
 
    }
 
}
