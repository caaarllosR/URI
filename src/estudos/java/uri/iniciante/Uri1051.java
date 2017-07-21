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

//	URI Online Judge | 1051
//	Imposto de Renda
//	Por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Em um pa�s imagin�rio denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem 
//	que nele n�o existem pol�ticos corruptos e os recursos arrecadados s�o utilizados em benef�cio da popula��o, 
//	sem qualquer desvio. A moeda deste pa�s � o Rombus, cujo s�mbolo � o R$.
//	
//	Leia um valor com duas casas decimais, equivalente ao sal�rio de uma pessoa de Lisarb. Em seguida, calcule 
//	e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
//	 
//	Renda							Imposto de Renda
//	
//	de 0.00 a R$ 2000.00			Isento
//	de R$ 2000.01 ate R$ 3000.00	8 %	
//	de R$ 3000.01 ate R$ 4500.00	18 %
//	acima de R$ 4500.00				28 %
//	
//	
//	Lembre que, se o sal�rio for R$ 3002.00, a taxa que incide � de 8% apenas sobre R$ 1000.00, pois a faixa de 
//	sal�rio que fica de R$ 0.00 at� R$ 2000.00 � isenta de Imposto de Renda. No exemplo fornecido (abaixo), 
//	a taxa � de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser 
//	impresso com duas casas decimais.
//	
//	Entrada
//	
//	A entrada cont�m apenas um valor de ponto flutuante, com duas casas decimais.
//	
//	Sa�da
//	
//	Imprima o texto "R$" seguido de um espa�o e do valor total devido de Imposto de Renda, com duas casas ap�s 
//	o ponto. Se o valor de entrada for menor ou igual a 2000, dever� ser impressa a mensagem "Isento".
//	
//	Exemplos de Entrada			Exemplos de Sa�da
//	
//	3002.00						R$ 80.36
//	---------------------------------------------
//	1701.12						Isento
//	---------------------------------------------
//	4520.00						R$ 355.60


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1051
 *	RESPOSTA: Accepted
 *	TEMPO: 0.052s
 *	SUBMISS�O: 30/07/15 03:12:46
 */

public class Uri1051 {
 
    public static void main(String[] args) throws IOException {
 
Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		float a, imposto;

		a = s.nextFloat();

		if (a >= 0.00 && a <= 2000.00) {
			System.out.printf("Isento\n");
			
		} else if ((a >= 2000.01) && (a <= 3000.00)) {
			imposto = ((a-2000) * 8) / 100;
			System.out.printf("R$ %.2f\n", imposto);
			
		} else if ((a >= 3000.01) && (a <= 4500.00)) {
			imposto = (((a - 3000) * 18) / 100) + 80;
			System.out.printf("R$ %.2f\n", imposto);
			
		} else if (a >= 4500.01) {
			 imposto = (((a - 4500) * 28) / 100) + 80 + 270;
			 System.out.printf("R$ %.2f\n", imposto);
		}
 
    }
 
}