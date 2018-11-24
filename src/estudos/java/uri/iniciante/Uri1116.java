package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner; 


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1116
 *	RESPOSTA: Accepted
 *	TEMPO: 0.352s
 *	SUBMISSÃO: 06/08/15 13:27:23
 */


public class Uri1116 {
 
    public static void main(String[] args) throws IOException {
 
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		int x = 0, y = 0, i = 0, n = 0;
		double r = 0;

		ArrayList<Integer> valor1 = new ArrayList<>();
		ArrayList<Integer> valor2 = new ArrayList<>();
		ArrayList<String> entreValor = new ArrayList<>();

		n = s.nextInt();

		while (i < n) {

			x = s.nextInt();
			y = s.nextInt();

			valor1.add(x);
			valor2.add(y);

			i++;

		}
		i = 0;

		while (i < valor1.size()) {

			x = valor1.get(i);
			y = valor2.get(i);

			if (y != 0) {
				r = x / (y*1.0);
				entreValor.add(Double.toString(r));
			} else {
				entreValor.add("divisao impossivel");
			}
			i++;
		}

		for (int j = 0; j < entreValor.size(); j++) {

			if (!entreValor.get(j).equals("divisao impossivel")) {
				System.out.printf("%.1f\n", Double.parseDouble(entreValor.get(j)));
			} else {
				System.out.println(entreValor.get(j));
			}
		}
 
    }
 
}
