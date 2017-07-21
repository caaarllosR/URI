package estudos.java.uri.iniciante;

import java.io.IOException;
import java.io.IOException;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
	
//	URI Online Judge | 1052
//	Mês
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//
//	Leia um valor inteiro entre 1 e 12, inclusive. Correspondente a este valor, deve ser apresentado como 
//	resposta o mês do ano por extenso, em inglês, com a primeira letra maiúscula.
//
//	Entrada
//
//	A entrada contém um único valor inteiro.
//
//	Saída
//
//	Imprima por extenso o nome do mês correspondente ao número existente na entrada, com a primeira letra 
//	em maiúscula.
//
//	Exemplo de Entrada			Exemplo de Saída
//
//	4							April
	
/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1052
 *	RESPOSTA: Accepted
 *	TEMPO: 0.032s
 *	SUBMISSÃO: 30/07/15 03:10:16
 */
	
public class Uri1052 {
 
    public static void main(String[] args) throws IOException {
 
    	Scanner s = new Scanner(System.in);
		int mes;

		mes = s.nextInt();

		switch (mes) {

		case 1:
			System.out.println("January");
			break;

		case 2:
			System.out.println("February");
			break;

		case 3:
			System.out.println("March");
			break;

		case 4:
			System.out.println("April");
			break;

		case 5:
			System.out.println("May");
			break;

		case 6:
			System.out.println("June");
			break;

		case 7:
			System.out.println("July");
			break;

		case 8:
			System.out.println("August");
			break;
			
		case 9:
			System.out.println("September");
			break;

		case 10:
			System.out.println("October");
			break;

		case 11:
			System.out.println("November");
			break;

		case 12:
			System.out.println("December");
			break;
		} 
 
    }
 
}