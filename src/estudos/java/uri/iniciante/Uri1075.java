package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

//	URI Online Judge | 1075
//	Resto 2
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Leia um valor inteiro N. Apresente todos os números entre 1 e 10000 que divididos por N dão resto igual a 2.
//	
//	Entrada
//	
//	A entrada contém um valor inteiro N (N < 10000).
//	
//	Saída
//	
//	Imprima todos valores que quando divididos por N dão resto = 2, um por linha.
//	
//	Exemplo de Entrada			Exemplo de Saída
//	
//	13							2
//								15
//								28
//								41
//								...

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1075
 *	RESPOSTA: Accepted
 *	TEMPO: 0.044s
 *	SUBMISSÃO: 01/08/15 16:23:04
 */

public class Uri1075 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);

		int n = 0, i = 0;

		n = s.nextInt();

		while (i < 10000) {

			if (i % n == 2) {

				System.out.println(i);
			}
			i++;
		}
 
    }
 
}
