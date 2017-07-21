package estudos.java.uri.iniciante;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */

//	URI Online Judge | 1150
//	Ultrapassando Z
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Fa�a um programa que leia dois inteiros: X e Z (devem ser lidos tantos valores para Z quantos necess�rios, 
//	at� que seja digitado um valor maior do que X para ele). Conte quantos n�meros inteiros devem ser 
//	somados em sequ�ncia (considerando o X nesta soma) para que a soma ultrapasse a Z o m�nimo poss�vel. 
//	Escreva o valor final da contagem. 
//	
//	A entrada pode conter, por exemplo, os valores 21 21 15 30. Neste caso, � ent�o assumido o valor 21 para X 
//	enquanto os valores 21 e 15 devem ser desconsiderados pois s�o menores ou iguais a X. Como o valor 30 est� 
//	dentro da especifica��o (maior do que X) ele ser� v�lido e ent�o deve-se processar os c�lculos para apresentar 
//	na sa�da o valor 2, pois � a quantidade de valores somados para se produzir um valor maior do que 
//	30 (21 + 22).
//	
//	Entrada
//	
//	A entrada cont�m somente valores inteiros, um por linha, podendo ser positivos ou negativos. O primeiro valor
//	da entrada ser� o valor de X. A pr�xima linha da entrada ir� conter Z. Se Z n�o atender a especifica��o do 
//		problema, ele dever� ser lido novamente, tantas vezes quantas forem necess�rias.
//	
//	Sa�da
//	
//	Imprima uma linha com um n�mero inteiro que representa a quantidade de n�meros inteiros que devem ser somadas,
//	de acordo com a especifica��o acima.
//	
//	Exemplo de Entrada			Exemplo de Sa�da
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
 *	SUBMISS�O: 15/08/15 16:32:43
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
