package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

//	URI Online Judge | 1099
//	Soma de Ímpares Consecutivos II
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir. Cada caso de teste 
//	consiste de dois inteiros X e Y. Você deve apresentar a soma de todos os ímpares existentes entre X e Y.
//	
//	Entrada
//	
//	A primeira linha de entrada é um inteiro N que é a quantidade de casos de teste que vem a seguir. 
//	Cada caso de teste consiste em uma linha contendo dois inteiros X e Y.
//	
//	Saída
//	
//	Imprima a soma de todos valores ímpares entre X e Y.
//	
//	Exemplo de Entrada		Exemplo de Saída
//	
//	7						0
//	4 5						11
//	13 10					5
//	6 4						0
//	3 3						0
//	3 5						0
//	3 4						12
//	3 8

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1099
 *	RESPOSTA: Accepted
 *	TEMPO: 0.100s
 *	SUBMISSÃO: 03/08/15 17:17:05
 */

public class Uri1099 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);

		int k2 = 0, k1 = 0, valor1 = 0, valor2 = 0, n = 0, i = 0;
		
		n = s.nextInt();
		int[] valores = new int[n];
		
		while (i < n) {

			valor1 = s.nextInt();
            valor2 = s.nextInt();

			k1 = valor1;
			k2 = valor2;

			if (valor2 < valor1) {
				k1 = valor2;
				k2 = valor1;
			}

			k1 = k1 + 1;

			while (k1 < k2) {

				if ((k1 % 2) != 0) {
					valores[i] += k1;
				}
				k1++;
			}
			i++;
		}
		for (int j = 0; j < valores.length; j++) {
			System.out.printf("%d\n",valores[j]);
			
		}
 
    }
 
}