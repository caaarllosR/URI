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

//	URI Online Judge | 1117
//	Valida��o de Nota
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	Fa�a um programa que leia as notas referentes �s duas avalia��es de um aluno. Calcule e imprima a m�dia semestral. Fa�a com que o algoritmo s� aceite notas v�lidas (uma nota v�lida deve pertencer ao intervalo [0,10]). Cada nota deve ser validada separadamente.
//	
//	Entrada
//	
//	A entrada cont�m v�rios valores reais, positivos ou negativos. O programa deve ser encerrado quando forem lidas duas notas v�lidas.
//	
//	Sa�da
//	
//	Se uma nota inv�lida  for lida, deve ser impressa a mensagem "nota invalida".
//	Quando duas notas v�lidas forem lidas, deve ser impressa a mensagem "media = " seguido do valor do c�lculo. O valor deve ser apresentado com duas casas ap�s o ponto decimal.
//	
//	Exemplo de Entrada			Exemplo de Sa�da
//	
//	-3.5						nota invalida
//	3.5							nota invalida
//	11.0						media = 6.75
//	10.0
//	-------------------------------------------
//	
//	
//	- Agradecimentos a C�ssio F.

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1117
 *	RESPOSTA: Accepted
 *	TEMPO: 0.056s
 *	SUBMISS�O: 06/08/15 13:43:03
 */

public class Uri1117 {
 
    public static void main(String[] args) throws IOException {
 
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		double nota1 = 0, nota2 = 0;

		nota1 = s.nextDouble();
		while (nota1 < 0.0 || nota1 > 10.0) {
			System.out.printf("nota invalida\n");
			nota1 = s.nextDouble();

		}

		nota2 = s.nextDouble();
		while (nota2 < 0.0 || nota2 > 10.0) {
			System.out.printf("nota invalida\n");
			nota2 = s.nextDouble();

		}

		System.out.printf("media = %.2f\n", (nota1 + nota2) / 2);
 
    }
 
}
