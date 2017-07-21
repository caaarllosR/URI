package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */

//	URI Online Judge | 1065
//	Pares entre Cinco N�meros
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Fa�a um programa que leia 5 valores inteiros. Conte quantos destes valores digitados s�o pares e mostre 
//	esta informa��o.
//	
//	Entrada
//	
//	O arquivo de entrada cont�m 5 valores inteiros quaisquer.
//	
//	Sa�da
//	
//	Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores pares lidos.
//	
//	Exemplo de Entrada			Exemplo de Sa�da
//	
//	7							3 valores pares
//	-5
//	6
//	-4
//	12

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1065
 *	RESPOSTA: Accepted
 *	TEMPO: 0.052s
 *	SUBMISS�O: 30/07/15 08:55:56
 */

public class Uri1065 {
	 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		int  i = 0, c = 0, valor = 0;;

		while (i < 5) {
			i++;
			valor = s.nextInt();
			if ((valor %2)== 0) {
				c++;
			}

		}
		
		System.out.printf("%d valores pares\n", c);

 
    }
 
}
