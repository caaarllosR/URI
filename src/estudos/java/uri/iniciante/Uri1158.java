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

//	URI Online Judge | 1158
//	Soma de �mpares Consecutivos III
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Leia um valor inteiro N que � a quantidade de casos de teste que vem a seguir. Cada caso de teste 
//	consiste de dois inteiros X e Y. Voc� deve apresentar a soma de Y �mpares consecutivos a partir de 
//	X inclusive o pr�prio X se ele for �mpar. Por exemplo:
//		
//	para a entrada 4 5, a sa�da deve ser 45, que � equivalente �: 5 + 7 + 9 + 11 + 13
//	para a entrada 7 4, a sa�da deve ser 40, que � equivalente �: 7 + 9 + 11 + 13
//	
//	Entrada
//	
//	A primeira linha de entrada � um inteiro N que � a quantidade de casos de teste que vem a seguir. Cada 
//	caso de teste consiste em uma linha contendo dois inteiros X e Y.
//	
//	Sa�da
//	
//	Imprima a soma dos consecutivos n�meros �mpares a partir do valor X.
//	
//	Exemplo de Entrada			Exemplo de Sa�da
//	
//	2							21
//	4 3							24
//	11 2


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1158
 *	RESPOSTA: Accepted
 *	TEMPO: 0.052s
 *	SUBMISS�O: 22/07/17 19:03:11
 */

public class Uri1158 {

	public static void main(String[] args) throws IOException {
		 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder result = new StringBuilder();
		
		int i = 0, j = 0;
		long N = 0, x = 0, y = 0, soma = 0;
		String[] xy;
		
		N = Long.parseLong(br.readLine());

		while (i < N) {
			if (x == 0 && y == 0){
				
				xy = br.readLine().split(" ");
				
				x = Long.parseLong(xy[0]);
				y = Long.parseLong(xy[1]);
			}
			else if (x%2 == 0){
				x++; 
			}
			else if (j < y){
				soma += x;
				x+=2;
				j++;
			}
			else {
				result.append(soma).append("\n");
				x = 0;
				y = 0;
				soma = 0;
				i++;
				j = 0;
			}
		}
		
		bw.write(result.toString());
		bw.flush();
	 }
	
}
