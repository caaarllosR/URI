package estudos.java.uri.iniciante;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */


//	URI Online Judge | 1001
//	Extremamente B�sico
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	RESPOSTA: Accepted
//	TEMPO: 0.052s
//	SUBMISS�O: 29/04/15 19:59:28
//	
//	
//	Leia 2 valores inteiros e armazene-os nas vari�veis A e B. Efetue a soma de A e B 
//	atribuindo o seu resultado na vari�vel X. Imprima X conforme exemplo apresentado abaixo. 
//	N�o apresente mensagem alguma al�m daquilo que est� sendo especificado e n�o 
//	esque�a de imprimir o fim de linha ap�s o resultado, caso contr�rio, voc� receber� 
//	"Presentation Error".
//	
//	Entrada
//	
//	A entrada cont�m 2 valores inteiros.
//	
//	Sa�da
//	
//	Imprima a vari�vel X conforme exemplo abaixo, com um espa�o em branco antes 
//	e depois da igualdade. Obs: O X est� em mai�sculo e deve ter um espa�o antes 
//	e um espa�o depois do sinal de igualdade.
//	
//	Exemplos de Entrada		Exemplos de Sa�da
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
