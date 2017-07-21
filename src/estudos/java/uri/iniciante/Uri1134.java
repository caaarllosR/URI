package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

//	URI Online Judge | 1134
//	Tipo de Combustível
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. 
//	Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.
//	Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser 
//	solicitado um novo código (até que seja válido). O programa será encerrado quando o código informado for 
//	o número 4.
//	
//	Entrada
//	
//	A entrada contém apenas valores inteiros e positivos.
//	
//	Saída
//	
//	Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de 
//	combustível, conforme exemplo.
//	
//	Exemplo de Entrada	Exemplo de Saída
//	
//	8					MUITO OBRIGADO
//	1					Alcool: 1
//	7					Gasolina: 2
//	2					Diesel: 0
//	2
//	4
//	============================
//	
//	
//	
//	- Agradecimentos a Cássio F.

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1134
 *	RESPOSTA: Accepted
 *	TEMPO: 0.064s
 *	SUBMISSÃO: 09/08/15 12:18:43
 */

public class Uri1134 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);

		int gasolina = 0, alcool = 0, diesel = 0, n = 0, opcao = 4;

		while (opcao == 4) {

			n = s.nextInt();

			if (n == 1) {
				alcool++;
			} else if (n == 2) {
				gasolina++;
			} else if (n == 3) {
				diesel++;
			} else if (n == 4) {
				break;
			} else {
				opcao = 4;
			}

		}
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d\n", alcool);
		System.out.printf("Gasolina: %d\n", gasolina);
		System.out.printf("Diesel: %d\n", diesel);
 
    }
 
}