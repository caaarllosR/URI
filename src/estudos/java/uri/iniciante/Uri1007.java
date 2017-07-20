package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */


//	URI Online Judge | 1007
//	Diferen�a
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	RESPOSTA: Accepted
//	TEMPO: 0.056s
//	SUBMISS�O: 30/04/15 00:38:32
//	
//	
//	Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferen�a do produto de A e B pelo 
//	produto de C e D segundo a f�rmula: DIFERENCA = (A * B - C * D).
//	
//	Entrada
//	
//	O arquivo de entrada cont�m 4 valores inteiros.
//	
//	Sa�da
//	
//	Imprima a mensagem DIFERENCA com todas as letras mai�sculas, conforme exemplo abaixo, com um espa�o em branco
//	antes e depois da igualdade.
//	
//	Exemplos de Entrada		Exemplos de Sa�da
//	
//	5						DIFERENCA = -26
//	6
//	7
//	8
//	-----------------------------------------
//	0						DIFERENCA = -56
//	0
//	7
//	8
//	-----------------------------------------
//	5						DIFERENCA = 86
//	6
//	-7
//	8




public class Uri1007 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);
		int DIFERENCA, A, B, C, D;

		A = Integer.parseInt(s.nextLine());
		B = Integer.parseInt(s.nextLine());
		C = Integer.parseInt(s.nextLine());
		D = Integer.parseInt(s.nextLine());
		DIFERENCA = (A * B - C * D);

		s.close();

		System.out.printf("DIFERENCA = %d\n", DIFERENCA);
 
    }
 
}
