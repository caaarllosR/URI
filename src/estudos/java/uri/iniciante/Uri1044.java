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

//	URI Online Judge | 1044
//	Múltiplos
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou 
//	"Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.
//	
//	Entrada
//	
//	A entrada contém valores inteiros.
//	
//	Saída
//	
//	A saída deve conter uma das mensagens conforme descrito acima.
//	
//	Exemplo de Entrada			Exemplo de Saída
//	
//	6 24						Sao Multiplos
//	---------------------------------------------
//	6 25						Nao sao Multiplos
	
/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1044
 *	RESPOSTA: Accepted
 *	TEMPO: 0.048s
 *	SUBMISSÃO: 22/07/15 17:42:57
 */

public class Uri1044 {
 
    public static void main(String[] args) throws IOException {
 
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		double a, b;

		a = s.nextInt();
		b = s.nextInt();
		s.close();

		if (a > b) {
			if ((a * 1.0) % (b * 1.0) == 0) {
				System.out.println("Sao Multiplos");
			} else {
				System.out.println("Nao sao Multiplos");
			}
		} else {
			if ((b * 1.0) % (a * 1.0) == 0) {
				System.out.println("Sao Multiplos");
			} else {
				System.out.println("Nao sao Multiplos");
			}
		}
 
    }
 
}
