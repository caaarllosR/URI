package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */

//	URI Online Judge | 1080
//	Maior e Posi��o
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Leia 100 valores inteiros. Apresente ent�o o maior valor lido e a posi��o dentre os 100 valores lidos.
//	
//	Entrada
//	
//	O arquivo de entrada cont�m 100 n�meros inteiros, positivos e distintos.
//	
//	Sa�da
//	
//	Apresente o maior valor lido e a posi��o de entrada, conforme exemplo abaixo.
//	
//	Exemplo de Entrada			Exemplo de Sa�da
//		
//	2							34565
//	113							4
//	45
//	34565
//	6
//	...
//	8

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1080
 *	RESPOSTA: Accepted
 *	TEMPO: 0.052s
 *	SUBMISS�O: 01/08/15 20:25:03
 */

public class Uri1080 {
 
    public static void main(String[] args) throws IOException {
 
		int j = 0;
		Scanner s = new Scanner(System.in);
		
		int[] valor = new int[100];
			
		for (int i = 0; i < valor.length; i++) {
			
			valor[i] = s.nextInt();
			if (valor[i]>valor[j]){
				j=i;
			}			
		}		
		System.out.println(valor[j]);
		System.out.println(j+1);
 
    }
 
}
