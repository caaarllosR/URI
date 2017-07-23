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

//	URI Online Judge | 1159
//	Soma de Pares Consecutivos
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	O programa deve ler um valor inteiro X indefinidas vezes. (O programa ir� parar quando o valor de X for igual a 0). Para cada X lido, imprima a soma dos 5 pares consecutivos a partir de X, inclusive o X , se for par. Se o valor de entrada for 4, por exemplo, a sa�da deve ser 40, que � o resultado da opera��o: 4+6+8+10+12, enquanto que se o valor de entrada for 11, por exempo, a sa�da deve ser 80, que � a soma de 12+14+16+18+20.
//	
//	Entrada
//	
//	O arquivo de entrada cont�m muitos valores inteiros. O �ltimo valor do arquivo � zero.
//	
//	Sa�da
//	
//	Imprima a saida conforme a explica��o acima e o exemplo abaixo.
//	
//	Exemplo de Entrada			Exemplo de Sa�da
//	
//	4							40
//	11							80
//	0


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1159
 *	RESPOSTA: Accepted
 *	TEMPO: 0.052s
 *	SUBMISS�O: 22/07/17 19:03:11
 */


public class Uri1159 {

	public static void main(String[] args) throws IOException {
		 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
		StringBuilder result = new StringBuilder();
		
		int j = 0, x = 0, soma = 0;
		
		x = Integer.parseInt(br.readLine());

		while (x != 0) {
						
			if (!(x%2==0)){
				x++;
			}
			while(j < 5){				
				soma+=x;
				x+=2;
				j++;
			}
			
			result.append(soma).append("\n");
			soma = 0;
			j = 0;
			x = Integer.parseInt(br.readLine());
		}
		
		bw.write(result.toString());
		bw.flush();
	 }
	
}
