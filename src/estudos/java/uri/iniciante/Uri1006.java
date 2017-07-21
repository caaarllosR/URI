package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */



//	URI Online Judge | 1006
//	M�dia 2
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	
//	Leia 3 valores, no caso, vari�veis A, B e C, que s�o as tr�s notas de um aluno. A seguir, calcule a m�dia do 
//	aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere que cada 
//	nota pode ir de 0 at� 10.0, sempre com uma casa decimal.
//	
//	Entrada
//	
//	O arquivo de entrada cont�m 3 valores com uma casa decimal, de dupla precis�o (double).
//	
//	Sa�da
//	
//	Imprima a vari�vel MEDIA conforme exemplo abaixo, com 1 d�gito ap�s o ponto decimal e com um espa�o em branco
//	antes e depois da igualdade. Assim como todos os problemas, n�o esque�a de imprimir o fim de linha ap�s o 
//	resultado, caso contr�rio, voc� receber� "Presentation Error".
//	
//	Exemplos de Entrada			Exemplos de Sa�da
//	
//	5.0							MEDIA = 6.3
//	6.0
//	7.0
//	
//	5.0							MEDIA = 9.0
//	10.0
//	10.0
//	
//	10.0						MEDIA = 7.5
//	10.0
//	5.0

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1006
 *	RESPOSTA: Accepted
 *	TEMPO: 0.064s
 *	SUBMISS�O: 29/04/15 22:56:35
 */

public class Uri1006 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);
		double A, B, C, MEDIA;
		
		A = Double.parseDouble(s.nextLine());
		B = Double.parseDouble(s.nextLine());
		C = Double.parseDouble(s.nextLine());
		MEDIA = (A*2+B*3+C*5)/(2+3+5);
		
		s.close();	
		
		System.out.printf("MEDIA = %.1f\n", MEDIA);
 
    }
 
}
