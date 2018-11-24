package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner; 


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1048
 *	RESPOSTA: Accepted
 *	TEMPO: 0.056s
 *	SUBMISSÃO: 22/07/15 17:52:01
 */

public class Uri1048 {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
		float salario;
		Scanner s = new Scanner(System.in);

		salario = s.nextFloat();

		if (salario <= 400.0 && salario >= 0.0) {
			System.out.printf("Novo salario: %.2f\n", (salario + (salario * 15.0)
					/ 100.0));
			System.out.printf("Reajuste ganho: %.2f\n", (salario * 15.0) / 100.0);
			System.out.printf("Em percentual: %d %%\n", 15);
		} else if (salario <= 800.0 && salario >= 400.01) {
			System.out.printf("Novo salario: %.2f\n", salario + (salario * 12.0)
					/ 100.0);
			System.out.printf("Reajuste ganho: %.2f\n", (salario * 12.0) / 100.0);
			System.out.printf("Em percentual: %d %%\n", 12);
		} else if (salario <= 1200.0 && salario >= 800.01) {
			System.out.printf("Novo salario: %.2f\n", salario + (salario * 10.0)
					/ 100.0);
			System.out.printf("Reajuste ganho: %.2f\n", (salario * 10.0) / 100.0);
			System.out.printf("Em percentual: %d %%\n", 10);
		} else if (salario <= 2000.0 && salario >= 1200.01) {
			System.out.printf("Novo salario: %.2f\n", salario + (salario * 7.0)
					/ 100.0);
			System.out.printf("Reajuste ganho: %.2f\n", (salario * 7.0) / 100.0);
			System.out.printf("Em percentual: %d %%\n", 7);

		} else if (salario > 2000.0) {
			System.out.printf("Novo salario: %.2f\n", salario + (salario * 4.0)
					/ 100.0);
			System.out.printf("Reajuste ganho: %.2f\n", (salario * 4.0) / 100.0);
			System.out.printf("Em percentual: %d %%\n", 4);
		}
 
    }
 
}
