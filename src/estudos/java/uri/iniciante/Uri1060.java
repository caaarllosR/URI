package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

//	URI Online Judge | 1060
//	Números Positivos
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Faça um programa que leia 6 valores. Estes valores serão somente negativos ou positivos (desconsidere os 
//	valores nulos). A seguir, mostre a quantidade de valores positivos digitados.
//	
//	Entrada
//	
//	Seis valores, negativos e/ou positivos.
//	
//	Saída
//	
//	Imprima uma mensagem dizendo quantos valores positivos foram lidos.
//	
//	Exemplo de Entrada			Exemplo de Saída
//	
//	7							4 valores positivos
//	-5
//	6
//	-3.4
//	4.6
//	12


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1060
 *	RESPOSTA: Accepted
 *	TEMPO: 0.048s
 *	SUBMISSÃO: 30/07/15 03:40:51
 */

public class Uri1060 {
 
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		int c = 0;
		double i = 0;

		while (i < 6) {
			i++;

			if (s.nextDouble() > 0) {
				c++;
			}

		}
		System.out.printf("%d valores positivos\n", c);
 
    }
 
}
