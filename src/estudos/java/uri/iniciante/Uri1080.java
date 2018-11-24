package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner;


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1080
 *	RESPOSTA: Accepted
 *	TEMPO: 0.052s
 *	SUBMISSÃO: 01/08/15 20:25:03
 */

public class Uri1080 {
 
    public static void main(String[] args) throws IOException {
 
		int j = 0;
		Scanner s = new Scanner(System.in);
		
		int[] valor = new int[100];
			
		for (int i = 0; i < valor.length; i++) {
			
			valor[i] = s.nextInt();
			if (valor[i]>valor[j]){
				j=i;
			}			
		}		
		System.out.println(valor[j]);
		System.out.println(j+1);
 
    }
 
}
