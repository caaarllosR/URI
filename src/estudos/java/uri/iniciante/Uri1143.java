package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

//	URI Online Judge | 1143
//	Quadrado e ao Cubo
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Escreva um programa que leia um valor inteiro N (1 < N < 1000). Este N é a quantidade de linhas de saída 
//	que serão apresentadas na execução do programa.
//	
//	Entrada
//	
//	O arquivo de entrada contém um número inteiro positivo N.
//	
//	Saída
//	
//	Imprima a saída conforme o exemplo fornecido.
//	
//	Exemplo de Entrada			Exemplo de Saída
//	
//	5							1 1 1
//								2 4 8
//								3 9 27
//								4 16 64
//								5 25 125
//	---------------------------------------
//	
//	
//	- Agradecimentos a Cássio F.

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1143
 *	RESPOSTA: Accepted
 *	TEMPO: 0.156s
 *	SUBMISSÃO: 02/08/15 10:50:51
 */


public class Uri1143 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);

		int i = 0, n = 0, k = 0;

		n = s.nextInt();

		while (i < n) {
			
			k+=1;
			System.out.printf("%d %d %d\n", k,new Double(Math.pow(k, 2)).intValue(), new Double(Math.pow(k, 3)).intValue());
			
			i++;
		}
 
    }
 
}