package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */

//	URI Online Judge | 1008
//	Sal�rio
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Escreva um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe
//	por hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com 
//	duas casas decimais.
//	
//	Entrada
//	
//	O arquivo de entrada cont�m 2 n�meros inteiros e 1 n�mero com duas casas decimais, representando o n�mero, 
//	quantidade de horas trabalhadas e o valor que o funcion�rio recebe por hora trabalhada, respectivamente.
//	
//	Sa�da
//	
//	Imprima o n�mero e o sal�rio do funcion�rio, conforme exemplo fornecido, com um espa�o em branco antes e 
//	depois da igualdade. No caso do sal�rio, tamb�m deve haver um espa�o em branco ap�s o $.
//	
//	Exemplos de Entrada		Exemplos de Sa�da
//	
//	25						NUMBER = 25
//	100						SALARY = U$ 550.00
//	5.50
//	------------------------------------------
//	1						NUMBER = 1
//	200						SALARY = U$ 4100.00
//	20.50
//	-------------------------------------------	
//	6						NUMBER = 6
//	145						SALARY = U$ 2254.75
//	15.55


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1008
 *	RESPOSTA: Accepted
 *	TEMPO: 0.056s
 *	SUBMISS�O: 30/04/15 00:55:58
 */


public class Uri1008 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);
		int number, hours;
		double salary;

		number = Integer.parseInt(s.nextLine());
		hours = Integer.parseInt(s.nextLine());
		salary = Double.parseDouble(s.nextLine());

		s.close();

		System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", number, salary*hours);
 
    }
 
}
