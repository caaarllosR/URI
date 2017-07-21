package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */

//	URI Online Judge | 1101
//	Sequ�ncia de N�meros e Soma
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Leia um conjunto n�o determinado de pares de valores M e N (parar quando algum dos valores for menor ou 
//	igual a zero). Para cada par lido, mostre a sequ�ncia do menor at� o maior e a soma dos inteiros 
//	consecutivos entre eles (incluindo o N e M).
//	
//	Entrada
//	
//	O arquivo de entrada cont�m um n�mero n�o determinado de valores M e N. A �ltima linha de entrada vai 
//	conter um n�mero nulo ou negativo.
//	
//	Sa�da
//	
//	Para cada dupla de valores, imprima a sequ�ncia do menor at� o maior e a soma deles, conforme exemplo 
//	abaixo.
//	
//	Exemplo de Entrada		Exemplo de Sa�da
//	
//	5 2						2 3 4 5 Sum=14
//	6 3						3 4 5 6 Sum=18
//	5 0

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1101
 *	RESPOSTA: Accepted
 *	TEMPO: 0.048s
 *	SUBMISS�O: 03/08/15 17:18:04
 */

public class Uri1101 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);

		int a = 0, b = 0, r = 0, n = 0, i = 0, l = 0;

		ArrayList<Integer> valores = new ArrayList<>();
		ArrayList<Integer> valor1 = new ArrayList<>();
		ArrayList<Integer> valor2 = new ArrayList<>();
		ArrayList<Integer> EntreValor = new ArrayList<>();
		ArrayList<Integer> IndiceValores = new ArrayList<>();

		a = s.nextInt();
		b = s.nextInt();

		while (b > 0 && a > 0) {

			valor1.add(a);
			valor2.add(b);

			if (b < a) {
				valor2.set(i, a);
				valor1.set(i, b);
			}

			a = s.nextInt();
			b = s.nextInt();
			i++;
		}

		i = 0;

		while (i < valor1.size()) {

			a = valor1.get(i);
			b = valor2.get(i);

			while (a <= b) {

				EntreValor.add(a);
				n += a;
				a++;
				l++;
			}

			IndiceValores.add(l);
			valores.add(n);
			n = 0;
			l = 0;
			i++;
		}
		l = 0;
		
		for (int j = 0; j < valores.size(); j++) {
			
			for (int k = l; k < l+IndiceValores.get(j); k++) {
				System.out.printf("%d ", EntreValor.get(k));
			}

			System.out.printf("Sum=%d\n", valores.get(j));
			l+=IndiceValores.get(j);
		}
 
    }
 
}
