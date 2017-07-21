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

//	URI Online Judge | 1146
//	Sequências Crescentes
//	Problema adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 2
//	
//	Este programa deve ler uma variável inteira X inúmeras vezes (deve parar quando o valor no arquivo de entrada
//	for igual a zero). Para cada valor lido imprima a sequência de 1 até X, com um espaço entre cada número e 
//	seu sucessor.
//	
//	Obs: cuide para não deixar espaço em branco após o último valor apresentado na linha ou você receberá 
//	Presentation Error.
//	
//	Entrada
//	
//	O arquivo de entrada contém vários números inteiros. O último número no arquivo de entrada é 0.
//	
//	Saída
//	
//	Para cada número N do arquivo de entrada deve ser impressa uma linha de 1 até N, conforme o exemplo abaixo. 
//	Não deve haver espaço em branco após o último valor da linha.
//	
//	Exemplo de Entrada			Exemplo de Saída
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
 *	SUBMISSÃO: 12/08/15 13:25:19
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