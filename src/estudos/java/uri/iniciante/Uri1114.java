package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner; 


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1114
 *	RESPOSTA: Accepted
 *	TEMPO: 0.052s
 *	SUBMISSÃO: 04/08/15 18:57:23
 */

public class Uri1114 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);

		int senha = 0;

		while (senha != 2002) {

			senha = s.nextInt();

			if (senha == 2002) {

				System.out.println("Acesso Permitido");
				break;
			} else {
				System.out.println("Senha Invalida");
			}

		}
 
    }
 
}
