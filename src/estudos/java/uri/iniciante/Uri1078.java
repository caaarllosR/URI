package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1078
 *	RESPOSTA: Accepted
 *	TEMPO: 0.052s
 *	SUBMISSÃO: 30/07/15 03:10:16
 */

public class Uri1078 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);

		int n = 0;

		n = s.nextInt();
	
		System.out.printf("1 x "+n+" = %d\n",n*1);
		System.out.printf("2 x "+n+" = %d\n",n*2);
		System.out.printf("3 x "+n+" = %d\n",n*3);
		System.out.printf("4 x "+n+" = %d\n",n*4);
		System.out.printf("5 x "+n+" = %d\n",n*5);
		System.out.printf("6 x "+n+" = %d\n",n*6);
		System.out.printf("7 x "+n+" = %d\n",n*7);
		System.out.printf("8 x "+n+" = %d\n",n*8);
		System.out.printf("9 x "+n+" = %d\n",n*9);
		System.out.printf("10 x "+n+" = %d\n",n*10);
 
    }
 
}