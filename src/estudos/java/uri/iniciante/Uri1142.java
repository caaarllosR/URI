package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

//	URI Online Judge | 1142
//	PUM
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1

//	Escreva um programa que leia um valor inteiro N. Este N é a quantidade de linhas de saída que serão 
//	apresentadas na execução do programa.
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
//	7							1 2 3 PUM
//								5 6 7 PUM
//								9 10 11 PUM
//								13 14 15 PUM
//								17 18 19 PUM
//								21 22 23 PUM
//								25 26 27 PUM



/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1142
 *	RESPOSTA: Accepted
 *	TEMPO: 0.412s
 *	SUBMISSÃO: 09/08/15 12:35:15
 */

public class Uri1142 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);

		int i = 0, n = 0, k = 0;

		n = s.nextInt();

		while (i < n) {
			
			System.out.printf("%d %d %d PUM\n", 1+k,2+k,3+k);
			k+=4;
			i++;
		}
 
    }
 
}
