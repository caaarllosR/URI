package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Locale;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

//	URI Online Judge | 1098
//	Sequencia IJ 4
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
//	Imprima a sequencia conforme exemplo abaixo.
//	
//	Exemplo de Entrada			Exemplo de Saída
//	
//								I=0 J=1
//								I=0 J=2
//								I=0 J=3
//								I=0.2 J=1.2
//								I=0.2 J=2.2
//								I=0.2 J=3.2
//								.....
//								I=2 J=?
//								I=2 J=?
//								I=2 J=?

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1098
 *	RESPOSTA: Accepted
 *	TEMPO: 0.044s
 *	SUBMISSÃO: 02/08/15 13:03:18
 */

public class Uri1098 {
 
    public static void main(String[] args) throws IOException {
 
Locale.setDefault(Locale.US);

		double j = 0.0;
		int i = 0, k = 0;

		while (i <= 20) {

			if (i - k == 0) {

				j += 1.0;
				System.out.printf("I=%.0f J=%.0f\n", (i / 10.0), j + (i / 10.0));
				j += 1.0;
				System.out.printf("I=%.0f J=%.0f\n", (i / 10.0), j + (i / 10.0));
				j += 1.0;
				System.out.printf("I=%.0f J=%.0f\n", (i / 10.0), j + (i / 10.0));
				k+=10;
				
			} else {
				j += 1.0;
				System.out.printf("I=%.1f J=%.1f\n", (i / 10.0), j + (i / 10.0));
				j += 1.0;
				System.out.printf("I=%.1f J=%.1f\n", (i / 10.0), j + (i / 10.0));
				j += 1.0;
				System.out.printf("I=%.1f J=%.1f\n", (i / 10.0), j + (i / 10.0));
			}

			i += 2;
			j = 0.0;
		}
 
    }
 
}
