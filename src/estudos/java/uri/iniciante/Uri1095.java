package estudos.java.uri.iniciante;

import java.io.IOException;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */

//	URI Online Judge | 1095
//	Sequencia IJ 1
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
//	Imprima a sequencia conforme exemplo abaixo
//	
//	Exemplo de Entrada			Exemplo de Sa�da
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
 *	SUBMISS�O: 02/08/15 11:04:38
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