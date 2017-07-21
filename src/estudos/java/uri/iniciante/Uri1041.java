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

//	URI Online Judge | 1041
//	Coordenadas de um Ponto
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. 
//	A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou 
//	na origem (x = y = 0).
//	
//		   :y
//		   :
//		Q2 : Q1  
//		   :	 x
//	 -------------
//		   :
//		Q3 : Q4
//		   :
//			   
//	Se o ponto estiver na origem, escreva a mensagem “Origem”.
//	
//	Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.
//	
//	Entrada
//	
//	A entrada contem as coordenadas de um ponto.
//	
//	Saída
//	
//	A saída deve apresentar o quadrante em que o ponto se encontra.
//	
//	Exemplo de Entrada			Exemplo de Saída
//	
//	4.5 -2.2					Q4
//	--------------------------------------------
//	0.1 0.1						Q1
//	--------------------------------------------
//	0.0 0.0						Origem

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1041
 *	RESPOSTA: Accepted
 *	TEMPO: 0.052s
 *	SUBMISSÃO: 08/07/15 15:09:56
 */

public class Uri1041 {
 
    public static void main(String[] args) throws IOException {
 
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		double x, y;

		x = s.nextDouble();
		y = s.nextDouble();

		if (x > 0.0 && y > 0.0) {
			System.out.printf("Q1\n");
		} else if (x < 0.0 && y > 0.0) {
			System.out.printf("Q2\n");
		} else if (x < 0.0 && y < 0.0) {
			System.out.printf("Q3\n");
		} else if (x > 0.0 && y < 0.0) {
			System.out.printf("Q4\n");
		} else if (x == 0.0 && y!=0.0) {
			System.out.printf("Eixo Y\n");

		} else if (y == 0.0 && x!=0.0) {
			System.out.printf("Eixo X\n");

		} else if (x == 0.0 && y == 0.0) {
			System.out.printf("Origem\n");
		}
 
    }
 
}
