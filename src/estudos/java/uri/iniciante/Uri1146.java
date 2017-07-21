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

//	URI Online Judge | 1146
//	Sequ�ncias Crescentes
//	Problema adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 2
//	
//	Este programa deve ler uma vari�vel inteira X in�meras vezes (deve parar quando o valor no arquivo de entrada
//	for igual a zero). Para cada valor lido imprima a sequ�ncia de 1 at� X, com um espa�o entre cada n�mero e 
//	seu sucessor.
//	
//	Obs: cuide para n�o deixar espa�o em branco ap�s o �ltimo valor apresentado na linha ou voc� receber� 
//	Presentation Error.
//	
//	Entrada
//	
//	O arquivo de entrada cont�m v�rios n�meros inteiros. O �ltimo n�mero no arquivo de entrada � 0.
//	
//	Sa�da
//	
//	Para cada n�mero N do arquivo de entrada deve ser impressa uma linha de 1 at� N, conforme o exemplo abaixo. 
//	N�o deve haver espa�o em branco ap�s o �ltimo valor da linha.
//	
//	Exemplo de Entrada			Exemplo de Sa�da
//	
//	5							1 2 3 4 5
//	10							1 2 3 4 5 6 7 8 9 10
//	3							1 2 3
//	0

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1146
 *	RESPOSTA: Accepted
 *	TEMPO: 0.120s
 *	SUBMISS�O: 12/08/15 13:25:19
 */

	public class Uri1146 {
	 
	    public static void main(String[] args) throws IOException {
	 
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			StringBuilder result = new StringBuilder();
	
			int x = 0, i = 2;
	
			while ((x = Integer.parseInt(br.readLine())) != 0) {
				
				result.append(1);
				while (i <= x) {
					result.append(" ").append(i);
					i++;
				}
				i=2;
				result.append("\n");
	
			}
			bw.write(result.toString());
			bw.flush();
	
	 
	    }
	 
	}