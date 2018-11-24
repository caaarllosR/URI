package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1014
 *	RESPOSTA: Accepted
 *	TEMPO: 0.056s
 *	SUBMISSÃO: 01/05/15 18:06:13
 */

public class Uri1014 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);
		int d;
		double c;

		d = Integer.parseInt(s.nextLine());
		c = Double.parseDouble(s.nextLine());
		s.close();

		System.out.printf("%.3f km/l\n", d / c);
 
    }
 
}