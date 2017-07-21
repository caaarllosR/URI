package estudos.java.uri.iniciante;

import java.io.IOException;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

//	URI Online Judge | 1096
//	Sequencia IJ 2
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.
//	
//	Entrada
//	
//	Não há nenhuma entrada neste problema.
//	
//	Saída
//	
//	Imprima a sequencia conforme exemplo abaixo
//	
//	Exemplo de Entrada			Exemplo de Saída
//	
//								I=1 J=7
//								I=1 J=6
//								I=1 J=5
//								I=3 J=7
//								I=3 J=6
//								I=3 J=5
//								...
//								I=9 J=7
//								I=9 J=6
//								I=9 J=5

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1096
 *	RESPOSTA: Accepted
 *	TEMPO: 0.040s
 *	SUBMISSÃO: 02/08/15 11:19:34
 */

public class Uri1096 {
 
    public static void main(String[] args) throws IOException {
 
		int j = 7, i = 1;
		
		while (i <=9) {	

			System.out.printf("I=%d J=%d\n", i, j);
			j--;
			System.out.printf("I=%d J=%d\n", i, j);
			j--;
			System.out.printf("I=%d J=%d\n", i, j);
			i+=2;
			j=7;
			
		}
 
    }
 
}