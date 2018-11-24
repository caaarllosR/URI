package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner; 


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1118
 *	RESPOSTA: Accepted
 *	TEMPO: 0.172s
 *	SUBMISSÃO: 06/08/15 14:12:17
 */	

public class Uri1118 {
 
    public static void main(String[] args) throws IOException {
 
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		int opcao = 1;
		double nota1 = 0, nota2 = 0;

		while (opcao == 1) {

			nota1 = s.nextDouble();
			while (nota1 < 0.0 || nota1 > 10.0) {
				System.out.println("nota invalida");
				nota1 = s.nextDouble();

			}

			nota2 = s.nextDouble();
			while (nota2 < 0.0 || nota2 > 10.0) {
				System.out.println("nota invalida");
				nota2 = s.nextDouble();

			}

			System.out.printf("media = %.2f\n", (nota1 + nota2) / 2);

			System.out.println("novo calculo (1-sim 2-nao)");
			opcao = s.nextInt();
			while (opcao < 1 || opcao > 2) {
				System.out.println("novo calculo (1-sim 2-nao)");
				opcao = s.nextInt();

			}

		}
 
    }
 
}
