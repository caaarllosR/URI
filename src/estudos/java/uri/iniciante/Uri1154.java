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

//	URI Online Judge | 1154
//	Idades
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo. 
//	O último dado, que não entrará nos cálculos, contém o valor de idade negativa. Calcular e imprimir a 
//	idade média deste grupo de indivíduos.
//	
//	Entrada
//	
//	A entrada contém um número indeterminado de inteiros. A entrada será encerrada quando um valor negativo 
//	for lido.
//	
//	Saída
//	
//	A saída contém um valor correspondente à média de idade dos indivíduos.
//	
//	A média deve ser impressa com dois dígitos após o ponto decimal.
//	
//	Exemplo de Entrada			Exemplo de Saída
//	
//	34							39.25
//	56
//	44
//	23
//	-2
//	---------------------------------------------
//	
//	
//	- Agradecimentos a Cassio F.

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1154
 *	RESPOSTA: Accepted
 *	TEMPO: 0.040s
 *	SUBMISSÃO: 22/07/17 15:52:45
 */

public class Uri1154 {

	public static void main(String[] args) throws IOException {
		 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = 0, i = 0;
		float count = 0;
		
		x = Integer.parseInt(br.readLine());

		while (x > -1) {
			count+=x;
			i++;
			x = Integer.parseInt(br.readLine());
		}
		
		System.out.printf("%.2f\n", count/i); 
    }
	
}
