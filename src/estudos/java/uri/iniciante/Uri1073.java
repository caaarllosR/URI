package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

//	URI Online Judge | 1073
//	Quadrado de Pares
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Leia um valor inteiro N. Apresente o quadrado de cada um dos valores pares, de 1 até N, inclusive N, 
//	se for o caso.
//	
//	Entrada
//	
//	A entrada contém um valor inteiro N (5 < N < 2000).
//	
//	Saída
//	
//	Imprima o quadrado de cada um dos valores pares, de 1 até N, conforme o exemplo abaixo.
//	
//	Tome cuidado! Algumas linguagens tem por padrão apresentarem como saída 1e+006 ao invés de 1000000 
//	o que ocasionará resposta errada. Neste caso, configure a precisão adequadamente para que isso não ocorra.
//	
//	Exemplo de Entrada				Exemplo de Saída
//	
//	6								2^2 = 4
//									4^2 = 16
//									6^2 = 36

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1073
 *	RESPOSTA: Accepted
 *	TEMPO: 0.096s
 *	SUBMISSÃO: 01/08/15 15:30:44
 */

public class Uri1073 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);

		int n = 0, i = 1;

		n = s.nextInt();

		while (i <= n) {

			if (i % 2 == 0) {

				System.out.printf(i+"^2 = %d\n", ((int) Math.pow(i, 2)));
			}
			i++;
		}
 
    }
 
}
