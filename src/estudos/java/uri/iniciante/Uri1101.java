package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

//	URI Online Judge | 1101
//	Sequência de Números e Soma
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Leia um conjunto não determinado de pares de valores M e N (parar quando algum dos valores for menor ou 
//	igual a zero). Para cada par lido, mostre a sequência do menor até o maior e a soma dos inteiros 
//	consecutivos entre eles (incluindo o N e M).
//	
//	Entrada
//	
//	O arquivo de entrada contém um número não determinado de valores M e N. A última linha de entrada vai 
//	conter um número nulo ou negativo.
//	
//	Saída
//	
//	Para cada dupla de valores, imprima a sequência do menor até o maior e a soma deles, conforme exemplo 
//	abaixo.
//	
//	Exemplo de Entrada		Exemplo de Saída
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
 *	SUBMISSÃO: 03/08/15 17:18:04
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
