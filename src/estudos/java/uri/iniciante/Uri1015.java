package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner; 


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1015
 *	RESPOSTA: Accepted
 *	TEMPO: 0.064s
 *	SUBMISSÃO: 01/05/15 18:34:10
 */

public class Uri1015 {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);
         
        float x1, y1, x2, y2;
 
        x1 = s.nextFloat();     
        y1 = s.nextFloat();
         
        x2 = s.nextFloat();
        y2 = s.nextFloat();
         
        s.close();  
 
        System.out.printf("%.4f/n", Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)));
 
    }
 
}
