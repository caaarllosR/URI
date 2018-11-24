package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1131
 *	RESPOSTA: Accepted
 *	TEMPO: 0.052s
 *	SUBMISSÃO: 07/08/15 15:21:23
 */

public class Uri1131 {
 
    public static void main(String[] args) throws IOException {
 
Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		int winInter = 0, winGremio = 0, golInter = 0, golGremio = 0, empate = 0, opcao = 0, grenais = 0;

		do {

			golInter = s.nextInt();
			golGremio = s.nextInt();

			if (golInter > golGremio) {

				winInter++;
			} else if (golInter < golGremio) {

				winGremio++;
			} else {

				empate++;
			}
			grenais++;
			System.out.println("Novo grenal (1-sim 2-nao)");
			opcao = s.nextInt();
		} while (opcao == 1);

		System.out.printf("%d grenais\n", grenais);
		System.out.printf("Inter:%d\n", winInter);
		System.out.printf("Gremio:%d\n", winGremio);
		System.out.printf("Empates:%d\n", empate);

		if (winInter > winGremio)

		{
			System.out.println("Inter venceu mais");
		} else if (winInter < winGremio)

		{
			System.out.println("Gremio venceu mais");
		} else

		{
			System.out.println("Nao houve vencedor");
		}

 
    }
 
}