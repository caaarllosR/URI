package estudos.java.uri.iniciante;

import java.io.IOException;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */

//	URI Online Judge | 1097
//	Sequencia IJ 3
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Voc� deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.
//	
//	Entrada
//	
//	N�o h� nenhuma entrada neste problema.
//	
//	Sa�da
//	
//	Imprima a sequencia conforme exemplo abaixo.
//	
//	Exemplo de Entrada			Exemplo de Sa�da
//	
//								I=1 J=7
//								I=1 J=6
//								I=1 J=5
//								I=3 J=9
//								I=3 J=8
//								I=3 J=7
//								...
//								I=9 J=15
//								I=9 J=14
//								I=9 J=13

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1097
 *	RESPOSTA: Accepted
 *	TEMPO: 0.024s
 *	SUBMISS�O: 02/08/15 11:21:17
 */

public class Uri1097 {
 
    public static void main(String[] args) throws IOException {
 
 		int j = 7, i = 1;
		
		while (i <=9) {	

			System.out.printf("I=%d J=%d\n", i, j);
			j--;
			System.out.printf("I=%d J=%d\n", i, j);
			j--;
			System.out.printf("I=%d J=%d\n", i, j);
			i+=2;
			j+=4;
			
		}
 
    }
 
}
