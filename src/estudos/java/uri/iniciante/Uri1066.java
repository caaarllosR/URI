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

//	URI Online Judge | 1066
//	Pares, Ímpares, Positivos e Negativos
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram pares, quantos valores digitados 
//	foram ímpares, quantos valores digitados foram positivos e quantos valores digitados foram negativos.
//	
//	Entrada
//	
//	O arquivo de entrada contém 5 valores inteiros quaisquer.
//	
//	Saída
//	
//	Imprima a mensagem conforme o exemplo fornecido, uma mensagem por linha, não esquecendo o final de linha 
//	após cada uma.
//	
//	Exemplo de Entrada			Exemplo de Saída
//	
//	-5							3 valor(es) par(es)
//	0							2 valor(es) impar(es)
//	-3							1 valor(es) positivo(s)
//	-4							3 valor(es) negativo(s)
//	12

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1066
 *	RESPOSTA: Accepted
 *	TEMPO: 0.044s
 *	SUBMISSÃO: 30/07/15 09:07:15
 */

public class Uri1066 {
 
    public static void main(String[] args) throws IOException {
 
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		int k = 0, par = 0, i = 0, n = 0, p = 0, valor = 0;

		while (k < 5) {
			k++;
			valor = s.nextInt();

			if (valor > 0) {
				p++;
			} else if (valor < 0) {
				n++;
			}

			if ((valor % 2) == 0) {
				par++;
			} else {
				i++;
			}

		}

		System.out.printf("%d valor(es) par(es)\n", par);
		System.out.printf("%d valor(es) impar(es)\n", i);
		System.out.printf("%d valor(es) positivo(s)\n", p);
		System.out.printf("%d valor(es) negativo(s)\n", n);
 
    }
 
}