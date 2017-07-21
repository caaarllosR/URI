package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */

//	URI Online Judge | 1079
//	M�dias Ponderadas
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Leia 1 valor inteiro N, que representa o n�mero de casos de teste que vem a seguir. Cada caso de teste 
//	consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente a m�dia ponderada para cada 
//	um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o 
//	terceiro valor tem peso 5.
//	
//	Entrada
//	
//	O arquivo de entrada cont�m um valor inteiro N na primeira linha. Cada N linha a seguir cont�m um caso de 
//	teste com tr�s valores com uma casa decimal cada valor.
//	
//	Sa�da
//	
//	Para cada caso de teste, imprima a m�dia ponderada dos 3 valores, conforme exemplo abaixo.
//	
//	Exemplo de Entrada			Exemplo de Sa�da
//	
//	3							5.7
//	6.5 4.3 6.2					6.3
//	5.1 4.2 8.1					9.3
//	8.0 9.0 10.0


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1079
 *	RESPOSTA: Accepted
 *	TEMPO: 0.128s
 *	SUBMISS�O: 01/08/15 19:29:42
 */

public class Uri1079 {
 
    public static void main(String[] args) throws IOException {
 
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		int n = 0, i = 0;
		double v1, v2, v3;

		n = s.nextInt();
		s.nextLine();

		while (i < n) {
			
			v1 = s.nextDouble();
			v2 = s.nextDouble();
			v3 = s.nextDouble();

			System.out.printf("%.1f\n",(v1 * 2 + v2 * 3 + v3 * 5) / (2 + 3 + 5));

			i++;
		}
 
    }
 
}