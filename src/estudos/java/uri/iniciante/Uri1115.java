package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner; 


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
