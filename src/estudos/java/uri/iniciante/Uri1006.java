package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 


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
