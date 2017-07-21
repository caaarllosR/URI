package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

//	URI Online Judge | 1064
//	Positivos e Média
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. Na próxima linha, 
//	deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.
//	
//	Entrada
//	
//	A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante. Pelo menos um destes 
//	números será positivo.
//	
//	Saída
//	
//	O primeiro valor de saída é a quantidade de valores positivos. A próxima linha deve mostrar a média dos 
//	valores positivos digitados.
//	
//	Exemplo de Entrada			Exemplo de Saída
//	
//	7							4	valores positivos
//	-5							7.4
//	6
//	-3.4
//	4.6
//	12

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1060
 *	RESPOSTA: Accepted
 *	TEMPO: 0.052s
 *	SUBMISSÃO: 30/07/15 08:49:29
 */

public class Uri1064 {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		int  c = 0;
		double i = 0, media = 0, valor = 0;

		while (i < 6) {
			i++;
			valor = s.nextDouble();
			if (valor > 0) {
				media+=valor;
				c++;
			}

		}
		media/=c;
		
		System.out.printf("%d valores positivos\n", c);
		System.out.printf("%.1f\n", media);

 
    }
 
}
