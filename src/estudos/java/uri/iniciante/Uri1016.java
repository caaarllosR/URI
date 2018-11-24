package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1016
 *	RESPOSTA: Accepted
 *	0.052s
 *	SUBMISSÃO: 01/05/15 18:47:02
 */

public class Uri1016 {
 
    public static void main(String[] args) throws IOException {
 
		int d;				
		Scanner s = new Scanner(System.in);
		
		d = s.nextInt();
		s.close();
		
		
		System.out.printf("%d minutos\n", d*2 );
 
    }
 
}
