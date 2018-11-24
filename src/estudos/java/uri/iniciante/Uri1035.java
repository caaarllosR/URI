package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1035
 *	RESPOSTA: Accepted
 *	TEMPO: 0.052s
 *	SUBMISSÃO: 06/05/15 22:10:09
 */

public class Uri1035 {
 
    public static void main(String[] args) throws IOException {
 
    	Scanner s = new Scanner(System.in);
		
		int A = s.nextInt();
		int B = s.nextInt();
		int C = s.nextInt();
		int D = s.nextInt();
		
		s.close();
		
		if (B>C){
			if (D>A){
				if((C+D)>(A+B)){
					if (C>0){
						if(D>0){
							System.out.print("Valores aceitos\n");
						} else {
							System.out.print("Valores nao aceitos\n");
						}
					} else {
						System.out.print("Valores nao aceitos\n");
					}
				} else {
					System.out.print("Valores nao aceitos\n");
				}
			} else {
				System.out.print("Valores nao aceitos\n");
			}
		} else {
			System.out.print("Valores nao aceitos\n");
		}
 
    }
 
}
