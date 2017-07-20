package estudos.java.uri.iniciante;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */


//	URI Online Judge | 1001
//	Extremamente Básico
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	RESPOSTA: Accepted
//	TEMPO: 0.052s
//	SUBMISSÃO: 29/04/15 19:59:28
//	
//	
//	Leia 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma de A e B 
//	atribuindo o seu resultado na variável X. Imprima X conforme exemplo apresentado abaixo. 
//	Não apresente mensagem alguma além daquilo que está sendo especificado e não 
//	esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá 
//	"Presentation Error".
//	
//	Entrada
//	
//	A entrada contém 2 valores inteiros.
//	
//	Saída
//	
//	Imprima a variável X conforme exemplo abaixo, com um espaço em branco antes 
//	e depois da igualdade. Obs: O X está em maiúsculo e deve ter um espaço antes 
//	e um espaço depois do sinal de igualdade.
//	
//	Exemplos de Entrada		Exemplos de Saída
//	
//  10						X = 19
//	9
//	-----------------------------------------
//	-10						X = -6
//	4
//	-----------------------------------------
//	15						X = 8
//	-7



public class Uri1001 {
 	
 	public PrintStream somaAB() {
		
		int A;
		int B;
		int X;
		Scanner s = new Scanner(System.in);
		A = s.nextInt();
		B = s.nextInt();
		X = A + B;
		s.close();
		return System.out.printf("X = %d\n", X );
	}
	
    public static void main(String[] args) throws IOException {
 
    new Uri1001().somaAB();
 
    }
 
}
