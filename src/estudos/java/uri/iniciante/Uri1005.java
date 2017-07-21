package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */



//	URI Online Judge | 1005
//	Média 1
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//
//	Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno. A seguir, 
//	calcule a média do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto
//	é 11). Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
//	
//	Entrada
//	
//	O arquivo de entrada contém 2 valores com uma casa decimal cada um.
//	
//	Saída
//	
//	Calcule e imprima a variável MEDIA conforme exemplo abaixo, com 5 dígitos após o ponto decimal e com um espaço em 
//	branco antes e depois da igualdade. Utilize variáveis de dupla precisão (double) e como todos os problemas, não 
//	esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
//	
//	Exemplos de Entrada	Exemplos de Saída
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
 *	SUBMISSÃO: 29/04/15 22:45:41
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
