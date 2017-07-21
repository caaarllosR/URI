package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */

//	URI Online Judge | 1116
//	Dividindo X por Y
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 2
//	
//	Escreva um algoritmo que leia 2 n�meros e imprima o resultado da divis�o do primeiro pelo segundo. Caso n�o for poss�vel mostre a 
//	mensagem �divisao impossivel� para os valores em quest�o.
//	
//	Entrada
//	
//	A entrada cont�m um n�mero inteiro N. Este N ser� a quantidade de pares de valores inteiros (X e Y) que ser�o lidos em seguida.
//	
//	Sa�da
//	
//	Para cada caso mostre o resultado da divis�o com um d�gito ap�s o ponto decimal, ou �divisao impossivel� caso n�o seja poss�vel 
//	efetuar o c�lculo.
//	
//	Obs.: Cuide que a divis�o entre dois inteiros em algumas linguagens como o C e C++ gera outro inteiro. Utilize cast :)
//	
//	Exemplo de Entrada			Exemplo de Sa�da
//	
//	3							-1.5
//	3 -2						divisao impossivel
//	-8 0						0.0
//	0 8
//	----------------------------------------------
//	
//	
//	- Formatado por C�ssio Favaretto.

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1116
 *	RESPOSTA: Accepted
 *	TEMPO: 0.352s
 *	SUBMISS�O: 06/08/15 13:27:23
 */


public class Uri1116 {
 
    public static void main(String[] args) throws IOException {
 
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		int x = 0, y = 0, i = 0, n = 0;
		double r = 0;

		ArrayList<Integer> valor1 = new ArrayList<>();
		ArrayList<Integer> valor2 = new ArrayList<>();
		ArrayList<String> entreValor = new ArrayList<>();

		n = s.nextInt();

		while (i < n) {

			x = s.nextInt();
			y = s.nextInt();

			valor1.add(x);
			valor2.add(y);

			i++;

		}
		i = 0;

		while (i < valor1.size()) {

			x = valor1.get(i);
			y = valor2.get(i);

			if (y != 0) {
				r = x / (y*1.0);
				entreValor.add(Double.toString(r));
			} else {
				entreValor.add("divisao impossivel");
			}
			i++;
		}

		for (int j = 0; j < entreValor.size(); j++) {

			if (!entreValor.get(j).equals("divisao impossivel")) {
				System.out.printf("%.1f\n", Double.parseDouble(entreValor.get(j)));
			} else {
				System.out.println(entreValor.get(j));
			}
		}
 
    }
 
}
