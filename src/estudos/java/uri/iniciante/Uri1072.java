package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

//	URI Online Judge | 1072
//	Intervalo 2
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//	Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações.
//	
//	Entrada
//	
//	A primeira linha da entrada contém um valor inteiro N (N < 10000), que indica o número de casos de teste.
//	Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).
//	 
//	
//	Saída
//	
//	Para cada caso, imprima quantos números estão dentro (in) e quantos valores estão fora (out) do intervalo.
//	
//	Exemplo de Entrada			Exemplo de Saída
//	
//	4							2 in
//	14							2 out
//	123
//	10
//	-25

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1072
 *	RESPOSTA: Accepted
 *	TEMPO: 0.076s
 *	SUBMISSÃO: 01/08/15 15:10:45
 */

public class Uri1072 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);
		long x = 0;
		int n = 0, i = 0, in = 0, out = 0;

		n = s.nextInt();
		s.nextLine();
		
		while (i < n) {

			x = s.nextLong();

			if (x <= 20 && x >= 10) {
				in++;
			} else {
				out++;
			}
			i++;
		}
		
		System.out.printf("%d in\n", in);
		System.out.printf("%d out\n", out);
 
    }
 
}
