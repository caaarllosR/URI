package estudos.java.uri.iniciante;

import java.io.IOException;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

//	URI Online Judge | 1095
//	Sequencia IJ 1
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
//								I=1 J=60
//								I=4 J=55
//								I=7 J=50
//								...
//								I=? J=0

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1095
 *	RESPOSTA: Accepted
 *	TEMPO: 0.032s
 *	SUBMISSÃO: 02/08/15 11:04:38
 */

public class Uri1095 {
 
    public static void main(String[] args) throws IOException {
 
		int j = 60, i = 1;
		
		while (j >=0) {	

			System.out.printf("I=%d J=%d\n", i, j);

			i+=3;
			j-=5;
		}
 
    }
 
}