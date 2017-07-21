package estudos.java.uri.iniciante;

import java.io.IOException;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */

//	URI Online Judge | 1059
//	N�meros Pares
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Fa�a um programa que mostre os n�meros pares entre 1 e 100, inclusive.
//	
//	Entrada
//	
//	Neste problema extremamente simples de repeti��o n�o h� entrada.
//	
//	Sa�da
//	
//	Imprima todos os n�meros pares entre 1 e 100, inclusive se for o caso, um em cada linha.
//	
//	Exemplo de Entrada			Exemplo de Sa�da
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
 *	SUBMISS�O: 29/04/15 19:59:28
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