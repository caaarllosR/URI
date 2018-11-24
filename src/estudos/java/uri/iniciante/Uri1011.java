package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1011
 *	RESPOSTA: Accepted
 *	0.048s
 *	SUBMISSÃO: 30/04/15 13:27:17
 */

public class Uri1011 {
 
 	public double volume(int r) {
		double pi = 3.14159;
		return (4 / 3.0) * pi * Math.pow(r, 3);
	}
	
    public static void main(String[] args) throws IOException {

		Scanner s = new Scanner(System.in);
		System.out.printf("VOLUME = %.3f\n", new Uri1011().volume(Integer.parseInt(s.nextLine())));
 
    }
 
}