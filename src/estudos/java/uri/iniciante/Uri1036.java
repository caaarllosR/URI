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

//	URI Online Judge | 1036
//	Fórmula de Bhaskara
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	
//	Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível 
//	calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou 
//	raiz de numero negativo.
//	
//	Entrada
//	
//	Leia três valores de ponto flutuante (double) A, B e C.
//	
//	Saída
//	
//	Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". Caso contrário,
//	imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo 
//	abaixo. Imprima sempre o final de linha após cada mensagem.
//	
//	Exemplos de Entrada			Exemplos de Saída
//	
//	10.0 20.1 5.1				R1 = -0.29788
//								R2 = -1.71212
//	-----------------------------------------------
//	0.0 20.0 5.0				Impossivel calcular
//	-----------------------------------------------	
//	10.3 203.0 5.0				R1 = -0.02466
//								R2 = -19.68408
//	-----------------------------------------------
//	10.0 3.0 5.0				Impossivel calcular

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1036
 *	RESPOSTA: Accepted
 *	TEMPO: 0.060s
 *	SUBMISSÃO: 06/05/15 22:50:29
 */

public class Uri1036 {
 
    public static void main(String[] args) throws IOException {
 
    	Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		double a, b, c, d, R1, R2;

		a = s.nextDouble();
		b = s.nextDouble();
		c = s.nextDouble();
		d = b * b - 4 * a * c;
		s.close();

		if (a != 0) {
			if (d >= 0) {
				R1 = ((-b) + Math.sqrt(d)) / (2 * a);
				R2 = ((-b) - Math.sqrt(d)) / (2 * a);
				System.out.printf("R1 = %.5f\nR2 = %.5f\n", R1, R2);
			} else {
				System.out.print("Impossivel calcular\n");
			}
		} else {
			System.out.print("Impossivel calcular\n");
		}
 
    }
 
}
