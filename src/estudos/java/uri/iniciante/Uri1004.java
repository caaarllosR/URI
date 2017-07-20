package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */



//	URI Online Judge | 1004
//	Produto Simples
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//
//	RESPOSTA: Accepted
//	TEMPO: 0.064s
//	SUBMISS�O: 29/04/15 21:36:01
//
//
//	Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta opera��o 
//	� vari�vel PROD. A seguir mostre a vari�vel PROD com mensagem correspondente.   
//	
//	Entrada
//	
//	O arquivo de entrada cont�m 2 valores inteiros.
//	
//	Sa�da
//	
//	Imprima a vari�vel PROD conforme exemplo abaixo, com um espa�o em branco antes e depois da igualdade. N�o
//	esque�a de imprimir o fim de linha ap�s o produto, caso contr�rio seu programa apresentar� a mensagem: 
//	�Presentation Error�.
//	
//	Exemplos de Entrada		Exemplos de Sa�da
//	
//	3						PROD = 27
//	9
//	-----------------------------------------
//	-30						PROD = -300
//	10	
//	-----------------------------------------
//	0						PROD = 0
//	9


public class Uri1004 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);

		int A = Integer.parseInt(s.nextLine());
		int B = Integer.parseInt(s.nextLine());
		int PROD;
		PROD = A * B;
		s.close();

		System.out.printf("PROD = %d\n", PROD);
    }
 
}
