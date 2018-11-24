package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner;


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1008
 *	RESPOSTA: Accepted
 *	TEMPO: 0.056s
 *	SUBMISSÃO: 30/04/15 00:55:58
 */


public class Uri1008 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);
		int number, hours;
		double salary;

		number = Integer.parseInt(s.nextLine());
		hours = Integer.parseInt(s.nextLine());
		salary = Double.parseDouble(s.nextLine());

		s.close();

		System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", number, salary*hours);
 
    }
 
}
