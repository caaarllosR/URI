package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1017
 *	RESPOSTA: Accepted
 *	TEMPO: 0.080s
 *	SUBMISSÃO: 01/05/15 19:04:02
 */

public class Uri1017 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);
        int d, t;
        double kml;
 
        d = Integer.parseInt(s.nextLine());
        t = Integer.parseInt(s.nextLine());
        kml = (d * t)*1.0 / 12;
        s.close();
 
        System.out.printf("%.3f\n", kml);
 
    }
 
}
