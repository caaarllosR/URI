package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */

//	URI Online Judge | 1014
//	Consumo
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	RESPOSTA: Accepted
//	TEMPO: 0.056s
//	SUBMISS�O: 01/05/15 18:06:13
//	
//	
//	Calcule o consumo m�dio de um autom�vel sendo fornecidos a dist�ncia total percorrida (em Km) e o total de 
//	combust�vel gasto (em litros).
//	
//	Entrada
//	
//	O arquivo de entrada cont�m dois valores: um valor inteiro X representando a dist�ncia total percorrida 
//	(em Km), e um valor real Y representando o total de combust�vel gasto, com um d�gito ap�s o ponto decimal.
//	
//	Sa�da
//	
//	Apresente o valor que representa o consumo m�dio do autom�vel com 3 casas ap�s a v�rgula, seguido 
//	da mensagem "km/l".
//	
//	Exemplo de Entrada		Exemplo de Sa�da
//	
//	500						14.286 km/l
//	35.0
//	----------------------------------------
//	2254					18.119 km/l
//	124.4
//	----------------------------------------
//	4554					9.802 km/l
//	464.6

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1014
 *	RESPOSTA: Accepted
 *	TEMPO: 0.056s
 *	SUBMISS�O: 01/05/15 18:06:13
 */

public class Uri1014 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);
		int d;
		double c;

		d = Integer.parseInt(s.nextLine());
		c = Double.parseDouble(s.nextLine());
		s.close();

		System.out.printf("%.3f km/l\n", d / c);
 
    }
 
}