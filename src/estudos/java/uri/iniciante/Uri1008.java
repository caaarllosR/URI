package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

//	URI Online Judge | 1008
//	Salário
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe
//	por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com 
//	duas casas decimais.
//	
//	Entrada
//	
//	O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais, representando o número, 
//	quantidade de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada, respectivamente.
//	
//	Saída
//	
//	Imprima o número e o salário do funcionário, conforme exemplo fornecido, com um espaço em branco antes e 
//	depois da igualdade. No caso do salário, também deve haver um espaço em branco após o $.
//	
//	Exemplos de Entrada		Exemplos de Saída
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
 *	SUBMISSÃO: 30/04/15 00:55:58
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
