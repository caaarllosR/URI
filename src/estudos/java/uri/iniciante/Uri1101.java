package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner; 


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1101
 *	RESPOSTA: Accepted
 *	TEMPO: 0.048s
 *	SUBMISSÃO: 03/08/15 17:18:04
 */

public class Uri1101 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);

		int a = 0, b = 0, r = 0, n = 0, i = 0, l = 0;

		ArrayList<Integer> valores = new ArrayList<>();
		ArrayList<Integer> valor1 = new ArrayList<>();
		ArrayList<Integer> valor2 = new ArrayList<>();
		ArrayList<Integer> EntreValor = new ArrayList<>();
		ArrayList<Integer> IndiceValores = new ArrayList<>();

		a = s.nextInt();
		b = s.nextInt();

		while (b > 0 && a > 0) {

			valor1.add(a);
			valor2.add(b);

			if (b < a) {
				valor2.set(i, a);
				valor1.set(i, b);
			}

			a = s.nextInt();
			b = s.nextInt();
			i++;
		}

		i = 0;

		while (i < valor1.size()) {

			a = valor1.get(i);
			b = valor2.get(i);

			while (a <= b) {

				EntreValor.add(a);
				n += a;
				a++;
				l++;
			}

			IndiceValores.add(l);
			valores.add(n);
			n = 0;
			l = 0;
			i++;
		}
		l = 0;
		
		for (int j = 0; j < valores.size(); j++) {
			
			for (int k = l; k < l+IndiceValores.get(j); k++) {
				System.out.printf("%d ", EntreValor.get(k));
			}

			System.out.printf("Sum=%d\n", valores.get(j));
			l+=IndiceValores.get(j);
		}
 
    }
 
}
