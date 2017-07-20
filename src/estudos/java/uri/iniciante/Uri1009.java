package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */


//	URI Online Judge | 1009
//	Salário com Bônus
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	RESPOSTA: Accepted
//	TEMPO: 0.052s
//	SUBMISSÃO: 30/04/15 01:09:24
//	
//	
//	Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no 
//	mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o 
//	total a receber no final do mês, com duas casas decimais.
//	
//	Entrada
//	
//	O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão (double) com 
//	duas casas decimais, representando o salário fixo do vendedor e montante total das vendas efetuadas por este 
//	vendedor, respectivamente.
//	
//	Saída
//	
//	Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.
//	
//	Exemplos de Entrada			Exemplos de Saída
//	
//	JOAO						TOTAL = R$ 684.54
//	500.00
//	1230.30
//	
//	PEDRO						TOTAL = R$ 700.00
//	700.00
//	0.00
//	
//	MANGOJATA					TOTAL = R$ 1884.58
//	1700.00
//	1230.50



public class Uri1009 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);
		
		String nome;
		double salarioFixo, valorVendas;

		nome = s.nextLine();
		salarioFixo = Double.parseDouble(s.nextLine());
		valorVendas = Double.parseDouble(s.nextLine());
		s.close();

		System.out.printf("TOTAL = R$ %.2f\n", salarioFixo+(valorVendas*15)/100);
 
    }
 
}
