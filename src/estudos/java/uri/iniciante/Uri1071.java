package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

//	URI Online Judge | 1071
//	Soma de Impares Consecutivos I
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.
//	
//	Entrada
//	
//	O arquivo de entrada contém dois valores inteiros.
//	
//	Saída
//	
//	O programa deve imprimir um valor inteiro. Este valor é a soma dos valores ímpares que estão entre os 
//	valores fornecidos na entrada que deverá caber em um inteiro.
//	
//	Exemplo de Entrada			Exemplo de Saída
//	
//	6							5
//	-5
//	--------------------------------------------
//	15							13
//	12
//	--------------------------------------------
//	12							0
//	12

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1071
 *	RESPOSTA: Accepted
 *	TEMPO: 0.080s
 *	SUBMISSÃO: 30/07/15 11:05:23
 */

public class Uri1071 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);

		int k2 = 0, k1 = 0, valor1 = 0, valor2 = 0, r = 0;

		valor1 = s.nextInt();
		valor2 = s.nextInt();

		k1 = valor1;
		k2 = valor2;

		if (valor2 < valor1) {
			k1 = valor2;
			k2 = valor1;
		}
		
		k1 = k1+1;
		
		while (k1 < k2) {

			
			if ((k1 % 2) != 0) {
				r+=k1;
			}
			k1++;
		}
		System.out.printf("%d\n", r);
 
    }
 
}
