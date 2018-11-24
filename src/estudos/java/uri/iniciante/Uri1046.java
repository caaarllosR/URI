package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner;


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1046
 *	RESPOSTA: Accepted
 *	TEMPO: 0.044s
 *	SUBMISSÃO: 22/07/15 17:48:04
 */

public class Uri1046 {
 
    public static void main(String[] args) throws IOException {
 
        int horas = 0;

		Scanner s = new Scanner(System.in);
		
		int horainicial = s.nextInt();
		int horafinal = s.nextInt();

		if (horainicial < horafinal) {
			horas = horafinal - horainicial;
		} else if (horainicial > horafinal) {
			horas = (24 - horainicial) + horafinal;
		} else if (horainicial == horafinal) {
			horas = 24;
		}

		System.out.printf("O JOGO DUROU %d HORA(S)\n", horas);
 
    }
 
}
