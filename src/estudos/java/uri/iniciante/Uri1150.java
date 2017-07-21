package estudos.java.uri.iniciante;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

//	URI Online Judge | 1150
//	Ultrapassando Z
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Faça um programa que leia dois inteiros: X e Z (devem ser lidos tantos valores para Z quantos necessários, 
//	até que seja digitado um valor maior do que X para ele). Conte quantos números inteiros devem ser 
//	somados em sequência (considerando o X nesta soma) para que a soma ultrapasse a Z o mínimo possível. 
//	Escreva o valor final da contagem. 
//	
//	A entrada pode conter, por exemplo, os valores 21 21 15 30. Neste caso, é então assumido o valor 21 para X 
//	enquanto os valores 21 e 15 devem ser desconsiderados pois são menores ou iguais a X. Como o valor 30 está 
//	dentro da especificação (maior do que X) ele será válido e então deve-se processar os cálculos para apresentar 
//	na saída o valor 2, pois é a quantidade de valores somados para se produzir um valor maior do que 
//	30 (21 + 22).
//	
//	Entrada
//	
//	A entrada contém somente valores inteiros, um por linha, podendo ser positivos ou negativos. O primeiro valor
//	da entrada será o valor de X. A próxima linha da entrada irá conter Z. Se Z não atender a especificação do 
//		problema, ele deverá ser lido novamente, tantas vezes quantas forem necessárias.
//	
//	Saída
//	
//	Imprima uma linha com um número inteiro que representa a quantidade de números inteiros que devem ser somadas,
//	de acordo com a especificação acima.
//	
//	Exemplo de Entrada			Exemplo de Saída
//	
//	3							5
//	1
//	20

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1150
 *	RESPOSTA: Accepted
 *	TEMPO: 0.040s
 *	SUBMISSÃO: 15/08/15 16:32:43
 */

public class Uri1150 {
 
    public static void main(String[] args) throws IOException {
 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder valor = new StringBuilder();

		int x = 0, z = 0, acum, result = 1;

		x = Integer.parseInt(br.readLine());
		acum = x;
		while (x >= (z = Integer.parseInt(br.readLine())));

		while (acum <= z) {
			
			x++;
			acum += x ;
			result++;
		}
		bw.write(valor.append(new Integer(result).toString()).append("\n").toString());
		bw.flush();
 
    }
 
}
