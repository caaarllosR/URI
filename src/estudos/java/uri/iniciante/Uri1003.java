package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */


//	URI Online Judge | 1003
//	Soma Simples
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//
//	RESPOSTA: Accepted
//	TEMPO: 0.060s
//	SUBMISS�O: 29/04/15 21:30:38
//
//
//	Leia dois valores inteiros, no caso para vari�veis A e B. A seguir, calcule a soma entre elas e atribua �
//	vari�vel SOMA. A seguir escrever o valor desta vari�vel.
//	
//	Entrada
//	
//	O arquivo de entrada cont�m 2 valores inteiros.
//	
//	Sa�da
//	
//	Imprima a vari�vel SOMA com todas as letras mai�sculas, com um espa�o em branco antes e depois da igualdade 
//	seguido pelo valor correspondente � soma de A e B. Como todos os problemas, n�o esque�a de imprimir o fim de 
//	linha ap�s o resultado, caso contr�rio, voc� receber� "Presentation Error".
//	
//	Exemplos de Entrada		Exemplos de Sa�da
//	30						SOMA = 40
//	10
//	----------------------------------------

//	-30						SOMA = -20
//	10
//	----------------------------------------

//	0						SOMA = 0
//	0
	
public class Uri1003 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);

		int A = Integer.parseInt(s.nextLine());
		int B = Integer.parseInt(s.nextLine());
		int SOMA;
		SOMA = A + B;
		s.close();

		System.out.printf("SOMA = %d\n", SOMA);
 
    }
 
}
