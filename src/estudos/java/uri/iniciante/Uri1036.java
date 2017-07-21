package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */

//	URI Online Judge | 1036
//	F�rmula de Bhaskara
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	
//	Leia 3 valores de ponto flutuante e efetue o c�lculo das ra�zes da equa��o de Bhaskara. Se n�o for poss�vel 
//	calcular as ra�zes, mostre a mensagem correspondente �Impossivel calcular�, caso haja uma divis�o por 0 ou 
//	raiz de numero negativo.
//	
//	Entrada
//	
//	Leia tr�s valores de ponto flutuante (double) A, B e C.
//	
//	Sa�da
//	
//	Se n�o houver possibilidade de calcular as ra�zes, apresente a mensagem "Impossivel calcular". Caso contr�rio,
//	imprima o resultado das ra�zes com 5 d�gitos ap�s o ponto, com uma mensagem correspondente conforme exemplo 
//	abaixo. Imprima sempre o final de linha ap�s cada mensagem.
//	
//	Exemplos de Entrada			Exemplos de Sa�da
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
 *	SUBMISS�O: 06/05/15 22:50:29
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
