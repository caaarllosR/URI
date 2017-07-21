package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */

//	URI Online Judge | 1013
//	O Maior
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Fa�a um programa que leia tr�s valores e apresente o maior dos tr�s valores lidos seguido da mensagem 
//	�eh o maior�. Utilize a f�rmula:
//	
//	
//	Entrada
//	
//	O arquivo de entrada cont�m tr�s valores inteiros.
//	
//	Sa�da
//	
//	Imprima o maior dos tr�s valores seguido por um espa�o e a mensagem "eh o maior".
//	
//	Exemplos de Entrada			Exemplos de Sa�da
//	
//	7 14 106					106 eh o maior
//	---------------------------------------------
//	217 14 6					217 eh o maior


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1013
 *	RESPOSTA: Accepted
 *	: 0.048s
 *	SUBMISS�O: 01/05/15 12:34:27
 */

public class Uri1013 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);
		int a, b, c, maiorAB, maiorAC, maiorABC;

		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();	
		s.close();	

		maiorAB = (a+b+Math.abs(a-b))/2;
		maiorAC = (a+c+Math.abs(a-c))/2;
		maiorABC = (maiorAB+maiorAC+Math.abs(maiorAB-maiorAC))/2;
		
		System.out.printf("%d eh o maior\n", maiorABC);

 
    }
 
}
