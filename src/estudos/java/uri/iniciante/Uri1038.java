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

//	URI Online Judge | 1038
//	Lanche
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. 
//	A seguir, calcule e mostre o valor da conta a pagar.
//	
//	CODIGO		ESPECIFICACAO		PRECO
//	
//	1			Cachorro-Quente		R$ 4,00
//	2			X-Salada			R$ 4,50
//	3			X-Bacon				R$ 5,00
//	4			Torrada Simples		R$ 2,00
//	5			Refrigerante		R$ 1,50
//	
//	Entrada
//	
//	O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme 
//	tabela acima.
//	
//	Saída
//	
//	O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o 
//	ponto decimal.
//	
//	Exemplo de Entrada			Exemplo de Saída
//	
//	3 2							Total: R$ 10.00
//	
//	4 3							Total: R$ 6.00
//	
//	2 3							Total: R$ 13.50

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1038
 *	RESPOSTA: Accepted
 *	TEMPO: 0.052s
 *	SUBMISSÃO: 08/07/15 01:48:01
 */

public class Uri1038 {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		double v = 0;
		int c, q;
		c = s.nextInt();
		q = s.nextInt();

		if (c == 1) {
			v = q * 4.00;
		}
		if (c == 2) {
			v = q * 4.50;
		}
		if (c == 3) {
			v = q * 5.00;
		}
		if (c == 4) {
			v = q * 2.00;
		}
		if (c == 5) {
			v = q * 1.50;
		}
		s.close();		
		System.out.printf("Total: R$ %.2f\n", v);
 
    }
 
}