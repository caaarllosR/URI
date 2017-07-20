package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */


//	URI Online Judge | 1003
//	Soma Simples
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//
//	RESPOSTA: Accepted
//	TEMPO: 0.060s
//	SUBMISSÃO: 29/04/15 21:30:38
//
//
//	Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas e atribua à
//	variável SOMA. A seguir escrever o valor desta variável.
//	
//	Entrada
//	
//	O arquivo de entrada contém 2 valores inteiros.
//	
//	Saída
//	
//	Imprima a variável SOMA com todas as letras maiúsculas, com um espaço em branco antes e depois da igualdade 
//	seguido pelo valor correspondente à soma de A e B. Como todos os problemas, não esqueça de imprimir o fim de 
//	linha após o resultado, caso contrário, você receberá "Presentation Error".
//	
//	Exemplos de Entrada		Exemplos de Saída
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
