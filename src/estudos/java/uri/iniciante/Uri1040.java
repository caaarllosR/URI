package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner; 


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1040
 *	RESPOSTA: Accepted
 *	TEMPO: 0.064s
 *	SUBMISSÃO: 08/07/15 15:08:27
 */

public class Uri1040 {
 
    public static void main(String[] args) throws IOException {
 
  Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		float n1, n2, n3, n4, media, ex;

		n1 = s.nextFloat();
		n2 = s.nextFloat();
		n3 = s.nextFloat();
		n4 = s.nextFloat();

		media = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / (2 + 3 + 4 + 1);
		
		System.out.printf("Media: %.1f\n", media);

		if (media >= 7.0) {
			System.out.printf("Aluno aprovado.\n");
		} else if (media < 5.0) {
			System.out.printf("Aluno reprovado.\n");
		} else {
			System.out.printf("Aluno em exame.\n");
			ex = s.nextFloat();
			System.out.printf("Nota do exame: %.1f\n", ex);

			media = (media + ex) / 2;

			if (media >= 5.0) {
				System.out.printf("Aluno aprovado.\n");
			} else {
				System.out.printf("Aluno reprovado.\n");
			}
			System.out.printf("Media final: %.1f\n", media);

		}
 
    }
 
}
