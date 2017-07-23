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

//	URI Online Judge | 1156
//	Sequência S II
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	Escreva um algoritmo para calcular e escrever o valor de S, sendo S dado pela fórmula:
//	S = 1 + 3/2 + 5/4 + 7/8 + ... + 39/?
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
 *  URI Online Judge | 1156
 *	RESPOSTA: Accepted
 *	TEMPO: 0.044s
 *	SUBMISSÃO: 22/07/17 17:35:38
 */

public class Uri1156 {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder result = new StringBuilder();

		int i = 0, j = 0; 
		float valor = 1;

		while (j < 39) {
			i++;		
			j = 1+2*i;
			valor += j/Math.pow(2, i);

		}
		
		System.out.printf("%.2f\n", valor); 
 
    }
	
}

