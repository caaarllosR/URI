package estudos.java.uri.iniciante;

import java.io.IOException;
import java.io.IOException;
import java.util.Scanner; 

	
/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1052
 *	RESPOSTA: Accepted
 *	TEMPO: 0.032s
 *	SUBMISSÃO: 30/07/15 03:10:16
 */
	
public class Uri1052 {
 
    public static void main(String[] args) throws IOException {
 
    	Scanner s = new Scanner(System.in);
		int mes;

		mes = s.nextInt();

		switch (mes) {

		case 1:
			System.out.println("January");
			break;

		case 2:
			System.out.println("February");
			break;

		case 3:
			System.out.println("March");
			break;

		case 4:
			System.out.println("April");
			break;

		case 5:
			System.out.println("May");
			break;

		case 6:
			System.out.println("June");
			break;

		case 7:
			System.out.println("July");
			break;

		case 8:
			System.out.println("August");
			break;
			
		case 9:
			System.out.println("September");
			break;

		case 10:
			System.out.println("October");
			break;

		case 11:
			System.out.println("November");
			break;

		case 12:
			System.out.println("December");
			break;
		} 
 
    }
 
}