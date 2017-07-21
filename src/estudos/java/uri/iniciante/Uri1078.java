package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

//	URI Online Judge | 1078
//	Tabuada
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N:      
//	1 x N = N      2 x N = 2N        ...       10 x N = 10N
//	
//	Entrada
//	
//	A entrada contém um valor inteiro N (2 < N < 1000).
//	
//	Saída
//	
//	Imprima a tabuada de N, conforme o exemplo fornecido.
//	
//	Exemplo de Entrada			Exemplo de Saída
//	
//	140              			1 x 140 = 140
//								2 x 140 = 280
//								3 x 140 = 420
//								4 x 140 = 560
//								5 x 140 = 700
//								6 x 140 = 840
//								7 x 140 = 980
//								8 x 140 = 1120
//								9 x 140 = 1260
//								10 x 140 = 1400

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1078
 *	RESPOSTA: Accepted
 *	TEMPO: 0.052s
 *	SUBMISSÃO: 30/07/15 03:10:16
 */

public class Uri1078 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);

		int n = 0;

		n = s.nextInt();
	
		System.out.printf("1 x "+n+" = %d\n",n*1);
		System.out.printf("2 x "+n+" = %d\n",n*2);
		System.out.printf("3 x "+n+" = %d\n",n*3);
		System.out.printf("4 x "+n+" = %d\n",n*4);
		System.out.printf("5 x "+n+" = %d\n",n*5);
		System.out.printf("6 x "+n+" = %d\n",n*6);
		System.out.printf("7 x "+n+" = %d\n",n*7);
		System.out.printf("8 x "+n+" = %d\n",n*8);
		System.out.printf("9 x "+n+" = %d\n",n*9);
		System.out.printf("10 x "+n+" = %d\n",n*10);
 
    }
 
}