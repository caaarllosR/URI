package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */



//	URI Online Judge | 1005
//	M�dia 1
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//
//	Leia 2 valores de ponto flutuante de dupla precis�o A e B, que correspondem a 2 notas de um aluno. A seguir, 
//	calcule a m�dia do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto
//	� 11). Assuma que cada nota pode ir de 0 at� 10.0, sempre com uma casa decimal.
//	
//	Entrada
//	
//	O arquivo de entrada cont�m 2 valores com uma casa decimal cada um.
//	
//	Sa�da
//	
//	Calcule e imprima a vari�vel MEDIA conforme exemplo abaixo, com 5 d�gitos ap�s o ponto decimal e com um espa�o em 
//	branco antes e depois da igualdade. Utilize vari�veis de dupla precis�o (double) e como todos os problemas, n�o 
//	esque�a de imprimir o fim de linha ap�s o resultado, caso contr�rio, voc� receber� "Presentation Error".
//	
//	Exemplos de Entrada	Exemplos de Sa�da
//	5.0					MEDIA = 6.43182
//	7.1
//	-------------------------------------
//	0.0					MEDIA = 4.84091
//	7.1
//	-------------------------------------
//	10.0				MEDIA = 10.00000
//	10.0


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1005
 *	RESPOSTA: Accepted
 *	TEMPO: 0.052s
 *	SUBMISS�O: 29/04/15 22:45:41
 */

public class Uri1005 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);
		double A, B, MEDIA;
		
		A = Double.parseDouble(s.nextLine());
		B = Double.parseDouble(s.nextLine());
		MEDIA = (A*3.5+B*7.5)/(3.5+7.5);
		
		s.close();	
		
		System.out.printf("MEDIA = %.5f\n", MEDIA);
 
    }
 
}
