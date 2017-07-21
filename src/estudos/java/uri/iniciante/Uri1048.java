package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

//	URI Online Judge | 1048
//	Aumento de Salário
//	Por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:
//	
//	
//	SALARIO					PERCENTUAL DE REAJUSTE
//	
//	0 - 400.00				15%
//	400.01 - 800.00			12%
//	800.01 - 1200.00		10%
//	1200.01 - 2000.00		7%
//	Acima de 2.000			4%
//	
//	
//	Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste ganho e o 
//	índice reajustado, em percentual.
//	
//	Entrada
//	
//	A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.
//	
//	Saída
//	
//	Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste e o percentual de reajuste ganho, 
//	conforme exemplo abaixo.
//	
//	Exemplo de Entrada			Exemplo de Saída
//	
//	400.00						Novo salario: 460.00
//								Reajuste ganho: 60.00
//								Em percentual: 15 %
//	-------------------------------------------------
//	800.01						Novo salario: 880.01
//								Reajuste ganho: 80.00
//								Em percentual: 10 %
//	-------------------------------------------------
//	2000.00						Novo salario: 2140.00
//								Reajuste ganho: 140.00
//								Em percentual: 7 %

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
