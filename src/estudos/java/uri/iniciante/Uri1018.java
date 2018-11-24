package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner;


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1018
 *	RESPOSTA: Accepted
 *	0.052s
 *	SUBMISSÃO: 01/05/15 20:20:19
 */

public class Uri1018 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);
        int v, n, n100, n50, n20, n10, n5, n2, n1;
        
	       v = s.nextInt();
	       n = v;
	       
	       n100 =  v/100;
	       v = v - n100*100;
	       n50 = v/50; 
	       v = v - n50*50;
	       n20 = v/20; 
	       v = v - n20*20;
	       n10 = v/10; 
	       v = v - n10*10;
	       n5 = v/5;
	       v = v - n5*5;
	       n2 = v/2;
	       v = v - n2*2;
	       n1 = v/1;
	       v = v - n1*1;
        s.close();
 
        System.out.printf("%d\n"
        				 +"%d nota(s) de R$ 100,00\n"
        				 +"%d nota(s) de R$ 50,00\n"
        				 +"%d nota(s) de R$ 20,00\n"
        				 +"%d nota(s) de R$ 10,00\n"
        				 +"%d nota(s) de R$ 5,00\n"
						 +"%d nota(s) de R$ 2,00\n"
						 +"%d nota(s) de R$ 1,00\n", n, n100, n50, n20, n10, n5, n2, n1);
 
    }
 
}
