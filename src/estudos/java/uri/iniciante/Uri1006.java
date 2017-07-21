package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */



//	URI Online Judge | 1006
//	Média 2
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	
//	Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. A seguir, calcule a média do 
//	aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere que cada 
//	nota pode ir de 0 até 10.0, sempre com uma casa decimal.
//	
//	Entrada
//	
//	O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).
//	
//	Saída
//	
//	Imprima a variável MEDIA conforme exemplo abaixo, com 1 dígito após o ponto decimal e com um espaço em branco
//	antes e depois da igualdade. Assim como todos os problemas, não esqueça de imprimir o fim de linha após o 
//	resultado, caso contrário, você receberá "Presentation Error".
//	
//	Exemplos de Entrada			Exemplos de Saída
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
 *	SUBMISSÃO: 29/04/15 22:56:35
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
