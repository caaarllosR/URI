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

//	URI Online Judge | 1037
//	Intervalo
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes
//	intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em 
//	nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
//	
//	O símbolo ( representa "maior que". Por exemplo:
//	[0,25]  indica valores entre 0 e 25.0000, inclusive eles.
//	(25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000
//	
//	Entrada
//	
//	O arquivo de entrada contém um número com ponto flutuante qualquer.
//	
//	Saída
//	
//	A saída deve ser uma mensagem conforme exemplo abaixo.
//	
//	Exemplo de Entrada			Exemplo de Saída
//	
//	25.01						Intervalo (25,50]
//	----------------------------------------------
//	25.00						Intervalo [0,25]
//	----------------------------------------------
//	100.00						Intervalo (75,100]
//	----------------------------------------------
//	-25.02						Fora de intervalo

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1037
 *	RESPOSTA: Accepted
 *	TEMPO: 0.056s
 *	SUBMISSÃO: 08/07/15 01:43:18
 */

public class Uri1037 {
 
    public static void main(String[] args) throws IOException {
 
    Locale.setDefault(Locale.US);
		
		Scanner s = new Scanner(System.in);

		Double n = s.nextDouble();

		s.close();

		if (n >= 0 && n <= 25) {
			System.out.print("Intervalo [0,25]\n");
		} else if (n > 25 && n <= 50) {
			System.out.print("Intervalo (25,50]\n");
		} else if (n > 50 && n <= 75) {
			System.out.print("Intervalo (50,75]\n");
		} else if (n > 75 && n <= 100) {
			System.out.print("Intervalo (75,100]\n");		
		} else {
			System.out.print("Fora de intervalo\n");
		}
 
    }
 
}
