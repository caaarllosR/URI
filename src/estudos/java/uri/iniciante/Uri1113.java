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

//	URI Online Judge | 1113
//	Crescente e Decrescente
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y uma mensagem 
//	que indique se estes valores foram digitados em ordem crescente ou decrescente.
//	
//	Entrada
//	
//	A entrada contém vários casos de teste. Cada caso contém dois valores inteiros X e Y. A leitura deve ser 
//	encerrada ao ser fornecido valores iguais para X e Y.
//	
//	Saída
//	
//	Para cada caso de teste imprima “Crescente”, caso os valores tenham sido digitados na ordem crescente, 
//	caso contrário imprima a mensagem “Decrescente”.
//	
//	Exemplo de Entrada			Exemplo de Saída
//	
//	5 4							Decrescente
//	7 2							Decrescente
//	3 8							Crescente
//	2 2

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1113
 *	RESPOSTA: Accepted
 *	TEMPO: 0.036s
 *	SUBMISSÃO: 04/08/15 18:48:20
 */


public class Uri1113 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);

		int a = 0, b = 0, i = 0;

		ArrayList<Integer> valor1 = new ArrayList<>();
		ArrayList<Integer> valor2 = new ArrayList<>();
		ArrayList<String> entreValor = new ArrayList<>();
		
		a = s.nextInt();
		b = s.nextInt();

		while (b != a) {

			valor1.add(a);
			valor2.add(b);

			a = s.nextInt();
			b = s.nextInt();
			
		}

		while (i < valor1.size()) {

			a = valor1.get(i);
			b = valor2.get(i);

			if (a > b) {

				entreValor.add("Decrescente");

			} else {
				entreValor.add("Crescente");
			}
			i++;
		}

		for (int j = 0; j < entreValor.size(); j++) {

			System.out.println(entreValor.get(j));
		}
 
    }
 
}
