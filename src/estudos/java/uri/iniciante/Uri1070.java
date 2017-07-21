package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */

//	URI Online Judge | 1070
//	Seis N�meros �mpares
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Leia um valor inteiro X. Em seguida apresente os 6 valores �mpares consecutivos a partir de X, um valor 
//	por linha, inclusive o X ser for o caso.
//	
//	Entrada
//	
//	A entrada ser� um valor inteiro positivo.
//	
//	Sa�da
//	
//	A sa�da ser� uma sequ�ncia de seis n�meros �mpares.
//	
//	Exemplo de Entrada			Exemplo de Sa�da
//	
//	8							9
//								11
//								13
//								15
//								17
//								19

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1070
 *	RESPOSTA: Accepted
 *	TEMPO: 0.052s
 *	SUBMISS�O: 30/07/15 09:31:32
 */

public class Uri1070 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);
 		int k = 0, valor = 0;
		valor = s.nextInt();

		if ((valor % 2) != 0) {

		} else {
			valor += 1;
		}

		while (k < 6) {
			System.out.printf("%d\n", (valor + (k * 2)));
			k++;
		}
 
    }
 
}