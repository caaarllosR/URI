package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

//	URI Online Judge | 1021
//	Notas e Moedas
//	Por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. 
//	A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. 
//	As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10
//	, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.
//	
//	Entrada
//	
//	O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).
//	
//	Saída
//	
//	Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo 
//	fornecido.
//	
//	Exemplo de Entrada		Exemplo de Saída
//	
//	576.73					NOTAS:
//							5 nota(s) de R$ 100.00
//							1 nota(s) de R$ 50.00
//							1 nota(s) de R$ 20.00
//							0 nota(s) de R$ 10.00
//							1 nota(s) de R$ 5.00
//							0 nota(s) de R$ 2.00
//							MOEDAS:
//							1 moeda(s) de R$ 1.00
//							1 moeda(s) de R$ 0.50
//							0 moeda(s) de R$ 0.25
//							2 moeda(s) de R$ 0.10
//							0 moeda(s) de R$ 0.05
//							3 moeda(s) de R$ 0.01
//	------------------------------------------------					
//	4.00					NOTAS:
//							0 nota(s) de R$ 100.00
//							0 nota(s) de R$ 50.00
//							0 nota(s) de R$ 20.00
//							0 nota(s) de R$ 10.00
//							0 nota(s) de R$ 5.00
//							2 nota(s) de R$ 2.00
//							MOEDAS:
//							0 moeda(s) de R$ 1.00
//							0 moeda(s) de R$ 0.50
//							0 moeda(s) de R$ 0.25
//							0 moeda(s) de R$ 0.10
//							0 moeda(s) de R$ 0.05
//							0 moeda(s) de R$ 0.01
//	-----------------------------------------------
//	91.01					NOTAS:
//							0 nota(s) de R$ 100.00
//							1 nota(s) de R$ 50.00
//							2 nota(s) de R$ 20.00
//							0 nota(s) de R$ 10.00
//							0 nota(s) de R$ 5.00
//							0 nota(s) de R$ 2.00
//							MOEDAS:
//							1 moeda(s) de R$ 1.00
//							0 moeda(s) de R$ 0.50
//							0 moeda(s) de R$ 0.25
//							0 moeda(s) de R$ 0.10
//							0 moeda(s) de R$ 0.05
//							1 moeda(s) de R$ 0.01


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1021
 *	RESPOSTA: Accepted
 *	TEMPO: 0.056s
 *  SUBMISSÃO: 02/05/15 02:30:30
 */

public class Uri1021 {
 
    public static void main(String[] args) throws IOException {
 
 		Scanner s = new Scanner(System.in);
		float v;
		int r, c, n100, n50, n20, n10, n5, n2, m1, m50, m25, m10, m05, m01;

		StringBuilder nm = new StringBuilder();
		v = Float.parseFloat(s.nextLine());

		c = (int) v;
		r = (int) Math.round((v - c)*100) ;

		n100 = c / 100;
		c = c - n100 * 100;
		n50 = c / 50;
		c = c - n50 * 50;
		n20 = c / 20;
		c = c - n20 * 20;
		n10 = c / 10;
		c = c - n10 * 10;
		n5 = c / 5;
		c = c - n5 * 5;
		n2 = c / 2;
		c = c - n2 * 2;	

		m1 = c;
		m50 = r / 50;
		r = r - m50 * 50;
		m25 = r / 25;
		r = r - m25 * 25;
		m10 = r / 10;
		r = r - m10 * 10;
		m05 = r / 5;
		r = r - m05 * 5;
		m01 = r;

		s.close();

		System.out.printf(nm.append("NOTAS:\n")
						.append("%d nota(s) de R$ 100.00\n")
						.append("%d nota(s) de R$ 50.00\n")
						.append("%d nota(s) de R$ 20.00\n")
						.append("%d nota(s) de R$ 10.00\n")
						.append("%d nota(s) de R$ 5.00\n")
						.append("%d nota(s) de R$ 2.00\n")
						.append("MOEDAS:\n")
						.append("%d moeda(s) de R$ 1.00\n")
						.append("%d moeda(s) de R$ 0.50\n")
						.append("%d moeda(s) de R$ 0.25\n")
						.append("%d moeda(s) de R$ 0.10\n")
						.append("%d moeda(s) de R$ 0.05\n")
							  + "%d moeda(s) de R$ 0.01\n", n100, n50, n20, n10, n5, n2, 
							  								m1, m50, m25, m10, m05, m01);
 
    }
 
}
