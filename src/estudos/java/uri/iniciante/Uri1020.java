package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner;


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1020
 *	RESPOSTA: Accepted
 *	TEMPO: 0.056s
 *	SUBMISSÃO: 01/05/15 21:19:54
 */

public class Uri1020 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);
        int a, m, d, i;
        
	       i = s.nextInt();
	       
	       a =  i/365;
	       i = i - a*365;
	       m = i/30; 
	       i = i - m*30;
	       d = i; 
	       
        s.close();
 
        System.out.printf("%d ano(s)\n"
        				 +"%d mes(es)\n"
        				 +"%d dia(s)\n"
        				 , a, m, d);
 
    }
 
}
