package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

//	URI Online Judge | 1042
//	Sort Simples
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente, uma
//	linha em branco e em seguida, os valores na sequência como foram lidos.
//	
//	Entrada
//	
//	A entrada contem três números inteiros.
//	
//	Saída
//	
//	Imprima a saída conforme foi especificado.
//	
//	Exemplo de Entrada			Exemplo de Saída
//	7 21 -14					-14
//								7
//								21
//	
//								7
//								21
//								-14
//	--------------------------------------------							
//	-14 21 7					-14
//								7
//								21
//	
//								-14
//								21
//								7

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1042
 *	RESPOSTA: Accepted
 *	TEMPO: 0.044s
 *	SUBMISSÃO: 22/07/15 17:37:14
 */

public class Uri1042 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);
		int a, b, c, maiorAB, maiorAC, maiorBC, maiorABC, x =0, y=0, z=0;

		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();

		maiorAB = (a + b + Math.abs(a - b)) / 2;
		maiorAC = (a + c + Math.abs(a - c)) / 2;
		maiorBC = (b + c + Math.abs(b - c)) / 2;
		maiorABC = (maiorAB + maiorAC + Math.abs(maiorAB - maiorAC)) / 2;

		if (maiorABC == a) {
			x = a;
			if (maiorBC == b) {
				y = b;
				z = c;
			} else {
				y = c;
				z = b;
			}

		} else if (maiorABC == b) {
			x = b;
			if (maiorAC == a) {
				y = a;
				z = c;
			} else {
				y = c;
				z = a;
			}

		} else if (maiorABC == c){
			x = c;
			if (maiorAB == a) {
				y = a;
				z = b;
			} else {
				y = b;
				z = a;
			}
		}

		System.out.println(z);
		System.out.println(y);
		System.out.println(x);
		
		System.out.println();

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
 
    }
 
}