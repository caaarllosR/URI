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

//	URI Online Judge | 1114
//	Senha Fixa
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de 
//	senha incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente 
//	deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o 
//	valor 2002. 
//	
//	Entrada
//	
//	A entrada é composta por vários casos de testes contendo valores inteiros.
//	
//	Saída
//	
//	Para cada valor lido mostre a mensagem correspondente à descrição do problema.
//	
//	Exemplo de Entrada			Exemplo de Saída
//	
//	2200						Senha Invalida
//	1020						Senha Invalida
//	2022						Senha Invalida
//	2002						Acesso Permitido
//
//
//
//	- Formatação e inserção no portal por Cássio Favaretto.

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1114
 *	RESPOSTA: Accepted
 *	TEMPO: 0.052s
 *	SUBMISSÃO: 04/08/15 18:57:23
 */

public class Uri1114 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);

		int senha = 0;

		while (senha != 2002) {

			senha = s.nextInt();

			if (senha == 2002) {

				System.out.println("Acesso Permitido");
				break;
			} else {
				System.out.println("Senha Invalida");
			}

		}
 
    }
 
}
