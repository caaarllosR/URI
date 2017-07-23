package estudos.java.uri.iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

//	URI Online Judge | 1157
//	Divisores I
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	Ler um número inteiro N e calcular todos os seus divisores.
//	
//	Entrada
//	
//	O arquivo de entrada contém um valor inteiro.
//	
//	Saída
//	
//	Escreva todos os divisores positivos de N, um valor por linha.
//	
//	Exemplo de Entrada			Exemplo de Saída
//	6							1
//								2
//								3
//								6
//	---------------------------------------------
//	
//	
//	- Agradecimentos a Cassio F.

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1157
 *	RESPOSTA: Accepted
 *	TEMPO: 0.044s
 *	SUBMISSÃO: 22/07/17 17:47:16
 */

public class Uri1157 {

	public static void main(String[] args) throws IOException {
		 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = 0, i = 0;

		x = Integer.parseInt(br.readLine());

		while (i < x) {
			i++;
			if (x%i == 0){
				System.out.printf("%d\n", i); 

			}
		}
	 }
	
}
