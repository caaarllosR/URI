package estudos.java.uri.iniciante;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner; 


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1149
 *	RESPOSTA: Accepted
 *	TEMPO: 0.044s
 *	SUBMISSÃO: 15/08/15 15:46:27
 */

public class Uri1149 {
  
    public static void main(String[] args) throws IOException {
  
        Scanner s = new Scanner(System.in);
         
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));     
        StringBuilder valor = new StringBuilder();
         
        int a = 0, n = 2, m = 0, result = 0, i = 1;
        a = s.nextInt();
 
        while ((n = s.nextInt()) <= 0); 
 
        m = a + n;
 
        while (a < m) {
 
            result += a;
            a++;
        }
		bw.write(valor.append(new Integer(result).toString()).append("\n").toString());
        bw.flush();
  
    }
  
}
