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

//	URI Online Judge | 1010
//	Cálculo Simples
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
//	código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor 
//	a ser pago.
//	
//	Entrada
//	
//	O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros
//	e um valor com 2 casas decimais.
//	
//	Saída
//	
//	A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os 
//	dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.
//	
//	Exemplos de Entrada			Exemplos de Saída
//	
//	12 1 5.30					VALOR A PAGAR: R$ 15.50
//	16 2 5.10
//	---------------------------------------------------
//	13 2 15.30					VALOR A PAGAR: R$ 51.40
//	161 4 5.20
//	---------------------------------------------------
//	1 1 15.10					VALOR A PAGAR: R$ 30.20
//	2 1 15.10

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1010
 *	RESPOSTA: Accepted
 *	TEMPO: 0.060s
 *	SUBMISSÃO: 30/04/15 02:59:16
 */

public class Uri1010 {
 
    public static void main(String[] args) throws IOException {
 
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		int codigo1, pecas1, codigo2, pecas2;
		double valor1, valor2;

		codigo1 = s.nextInt();
		pecas1 = s.nextInt();
		valor1 = s.nextDouble();		
		
		codigo2 = s.nextInt();
		pecas2 = s.nextInt();
		valor2 = s.nextDouble();
		s.close();	

		System.out.printf("VALOR A PAGAR: R$ %.2f\n", pecas1*valor1+pecas2*valor2);

    }
 
}