package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1134
 *	RESPOSTA: Accepted
 *	TEMPO: 0.064s
 *	SUBMISSÃO: 09/08/15 12:18:43
 */

public class Uri1134 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);

		int gasolina = 0, alcool = 0, diesel = 0, n = 0, opcao = 4;

		while (opcao == 4) {

			n = s.nextInt();

			if (n == 1) {
				alcool++;
			} else if (n == 2) {
				gasolina++;
			} else if (n == 3) {
				diesel++;
			} else if (n == 4) {
				break;
			} else {
				opcao = 4;
			}

		}
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d\n", alcool);
		System.out.printf("Gasolina: %d\n", gasolina);
		System.out.printf("Diesel: %d\n", diesel);
 
    }
 
}