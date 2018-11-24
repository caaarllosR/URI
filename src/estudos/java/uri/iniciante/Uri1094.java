package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner; 


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