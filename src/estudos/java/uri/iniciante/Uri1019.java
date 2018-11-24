package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 



/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1019
 *	RESPOSTA: Accepted
 *	TEMPO: 0.056s
 *	SUBMISSÃO: 01/05/15 21:09:16
 */

public class Uri1019 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);
        int t, nsh, nsm, nss;
        
	       t = s.nextInt();	     
	       
	       nsh =  t/3600;
	       t = t - nsh*3600;
	       nsm = t/60; 
	       t = t - nsm*60;
	       nss = t; 	       
	       
	       s.close();
	       
	       System.out.printf("%d:%d:%d\n",nsh, nsm, nss);
 
    }
 
}
