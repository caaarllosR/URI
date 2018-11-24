package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner; 


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
