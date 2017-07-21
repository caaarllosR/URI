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

//	URI Online Judge | 1067
//	N�meros �mpares
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os �mpares de 1 at� X, um valor por linha, 
//	inclusive o X, se for o caso.
//	
//	Entrada
//	
//	O arquivo de entrada cont�m 1 valor inteiro qualquer.
//	
//	Sa�da
//	
//	Imprima todos os valores �mpares de 1 at� X, inclusive X, se for o caso.
//	
//	Exemplo de Entrada			Exemplo de Sa�da
//	
//	8							1
//								3
//								5
//								7

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1067
 *	RESPOSTA: Accepted
 *	TEMPO: 0.048s
 *	SUBMISS�O: 30/07/15 09:20:48
 */

public class Uri1067 {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		int k = 0, valor = 0;
		valor = s.nextInt();

		while (k < valor) {

			k++;
			if ((k % 2) != 0) {

				System.out.printf("%d\n", k);
			}
		}
 
    }
 
}
