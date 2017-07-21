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

//	URI Online Judge | 1094
//	Experiências
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//
//	Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para 
//	organizar os experimentos de um laboratório o qual ela é responsável. Ela quer saber no final do ano, 
//	quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.
//	
//	Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter estas 
//	informações, ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia utilizada 
//	e a quantidade de cobaias utilizadas em cada experimento.
//	
//	Entrada
//	
//	A primeira linha de entrada contém um valor inteiro N que indica os vários casos de teste que vem a 
//	seguir. Cada caso de teste contém um inteiro Quantia (1 ≤ Quantia ≤ 15) que representa a quantidade de 
//	cobaias utilizadas e um caractere Tipo ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho).
//	
//	Saída
//	
//	Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o percentual de 
//	cada uma em relação ao total de cobaias utilizadas, sendo que o percentual deve ser apresentado com dois 
//	dígitos após o ponto.
//	
//	Exemplo de Entrada	Exemplo de Saída
//	
//	10						Total: 92 cobaias
//	10 C					Total de coelhos: 29
//	6 R						Total de ratos: 40
//	15 S					Total de sapos: 23
//	5 C						Percentual de coelhos: 31.52 %
//	14 R					Percentual de ratos: 43.48 %
//	9 C						Percentual de sapos: 25.00 %
//	6 R
//	8 S
//	5 C
//	14 R

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1094
 *	RESPOSTA: Accepted
 *	TEMPO: 0.156s
 *	SUBMISSÃO: 02/08/15 10:50:51
 */

public class Uri1094 {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		int n = 0, i = 0, coelhos = 0, ratos = 0, sapos = 0, quantia = 0, total = 0;
		String tipo;

		n = s.nextInt();
		s.nextLine();
		
		while (i < n) {

			tipo = s.nextLine();
			
			quantia = Integer.parseInt(tipo.split(" ")[0]);
			tipo = tipo.split(" ")[1];
			
			if (tipo.equals("C")) {
				coelhos += quantia;
			}
			if (tipo.equals("R")) {
				ratos += quantia;
			}
			if (tipo.equals("S")) {
				sapos += quantia;
			}
			
			i++;
		}
		total = sapos+coelhos+ratos;
		
		System.out.printf("Total: %d cobaias\n", total);
		System.out.printf("Total de coelhos: %d\n", coelhos);
		System.out.printf("Total de ratos: %d\n", ratos);
		System.out.printf("Total de sapos: %d\n", sapos);
		System.out.printf("Percentual de coelhos: %.2f %%\n",((100*coelhos)/(total*1.0)));
		System.out.printf("Percentual de ratos: %.2f %%\n",((100*ratos)/(total*1.0)));
		System.out.printf("Percentual de sapos: %.2f %%\n",((100*sapos)/(total*1.0)));
    }
 
}