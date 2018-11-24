package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1013
 *	RESPOSTA: Accepted
 *	: 0.048s
 *	SUBMISSÃO: 01/05/15 12:34:27
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
