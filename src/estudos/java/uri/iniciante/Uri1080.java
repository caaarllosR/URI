package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

//	URI Online Judge | 1080
//	Maior e Posição
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Leia 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.
//	
//	Entrada
//	
//	O arquivo de entrada contém 100 números inteiros, positivos e distintos.
//	
//	Saída
//	
//	Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.
//	
//	Exemplo de Entrada			Exemplo de Saída
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
 *	SUBMISSÃO: 01/08/15 20:25:03
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
