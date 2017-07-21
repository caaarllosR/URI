package estudos.java.uri.iniciante;

import java.io.IOException;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

//	URI Online Judge | 1059
//	Números Pares
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Faça um programa que mostre os números pares entre 1 e 100, inclusive.
//	
//	Entrada
//	
//	Neste problema extremamente simples de repetição não há entrada.
//	
//	Saída
//	
//	Imprima todos os números pares entre 1 e 100, inclusive se for o caso, um em cada linha.
//	
//	Exemplo de Entrada			Exemplo de Saída
//								2
//								4
//								6
//								...
//								100

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1059
 *	RESPOSTA: Accepted
 *	TEMPO: 0.052s
 *	SUBMISSÃO: 29/04/15 19:59:28
 */

public class Uri1059 {
 
    public static void main(String[] args) throws IOException {

		int i = 0;
		
		while(i<50) {
			i++;
			System.out.printf("%d\n",i*2);
		}
 
    }
 
}