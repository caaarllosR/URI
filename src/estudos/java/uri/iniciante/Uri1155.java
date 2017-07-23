package estudos.java.uri.iniciante;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

//	URI Online Judge | 1155
//	Sequência S
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	Escreva um algoritmo para calcular e escrever o valor de S, sendo S dado pela fórmula:
//	S = 1 + 1/2 + 1/3 + … + 1/100
//	
//	Entrada
//	
//	Não há nenhuma entrada neste problema.
//	
//	Saída
//	
//	A saída contém um valor correspondente ao valor de S.
//	O valor deve ser impresso com dois dígitos após o ponto decimal.

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1155
 *	RESPOSTA: Accepted
 *	TEMPO: 0.032s
 *	SUBMISSÃO: 22/07/17 17:10:57
 */

public class Uri1155 {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder result = new StringBuilder();

		int i = 0; 
		float valor = 0;

		while (i < 100) {
			i++;			
			valor += 1.0/i;

		}
		
		System.out.printf("%.2f\n", valor); 
 
    }
	
}

