package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */

//	URI Online Judge | 1073
//	Quadrado de Pares
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Leia um valor inteiro N. Apresente o quadrado de cada um dos valores pares, de 1 at� N, inclusive N, 
//	se for o caso.
//	
//	Entrada
//	
//	A entrada cont�m um valor inteiro N (5 < N < 2000).
//	
//	Sa�da
//	
//	Imprima o quadrado de cada um dos valores pares, de 1 at� N, conforme o exemplo abaixo.
//	
//	Tome cuidado! Algumas linguagens tem por padr�o apresentarem como sa�da 1e+006 ao inv�s de 1000000 
//	o que ocasionar� resposta errada. Neste caso, configure a precis�o adequadamente para que isso n�o ocorra.
//	
//	Exemplo de Entrada				Exemplo de Sa�da
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
 *	SUBMISS�O: 01/08/15 15:30:44
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
