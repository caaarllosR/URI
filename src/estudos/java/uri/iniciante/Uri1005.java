package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 


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
