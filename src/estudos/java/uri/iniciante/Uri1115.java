package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

//	URI Online Judge | 1115
//	Quadrante
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema 
//	cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando 
//	pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
//	
//	Entrada
//	
//	A entrada contém vários casos de teste. Cada caso de teste contém 2 valores inteiros.
//	
//	Saída
//	
//	Para cada caso de teste mostre em qual quadrante do sistema cartesiano se encontra a coordenada lida, 
//	conforme o exemplo.
//	
//	Exemplo de Entrada			Exemplo de Saída
//	
//	2 2							primeiro
//	3 -2						quarto
//	-8 -1						terceiro
//	-7 1						segundo
//	0 2
//	
//	
//	- Formatação e inserção no portal por Cássio Favaretto.

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1115
 *	RESPOSTA: Accepted
 *	TEMPO: 0.048s
 *	SUBMISSÃO: 06/08/15 13:04:36
 */


public class Uri1115 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);

		int x = 0, y = 0, i = 0;

		ArrayList<Integer> valor1 = new ArrayList<>();
		ArrayList<Integer> valor2 = new ArrayList<>();
		ArrayList<String> entreValor = new ArrayList<>();
		
		x = s.nextInt();
		y = s.nextInt();

		while (x != 0 && y != 0) {

			valor1.add(x);
			valor2.add(y);

			x = s.nextInt();
			y = s.nextInt();
			
		}

		while (i < valor1.size()) {

			x = valor1.get(i);
			y = valor2.get(i);

			if (x > 0 && y > 0) {
				entreValor.add("primeiro");
	        } else if (x < 0 && y > 0) {
	        	entreValor.add("segundo");
	        } else if (x < 0 && y < 0) {
	        	entreValor.add("terceiro");
	        } else if (x > 0 && y < 0) {
	        	entreValor.add("quarto");
	        } 
			i++;
		}

		for (int j = 0; j < entreValor.size(); j++) {

			System.out.println(entreValor.get(j));
		}
 
    }
 
}
