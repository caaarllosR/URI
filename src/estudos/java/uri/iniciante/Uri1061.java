package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1061
 *	RESPOSTA: Accepted
 *	TEMPO: 0.048s
 *	SUBMISSÃO: 30/07/15 08:36:31
 */


public class Uri1061 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);

		int diaTotal = 0, horaTotal = 0, minutoTotal = 0, segundoTotal = 0;
		boolean validador = true;

		String diaI = s.nextLine();
		String horaMinSegI = s.nextLine();
		String diaF = s.nextLine();
		String horaMinSegF = s.nextLine();

		String[] dia1 = diaI.split(" ");
		int diaInicial = Integer.parseInt(dia1[1]);
		String[] horaMinSeg1 = horaMinSegI.split(" ");
		int horaInicial = Integer.parseInt(horaMinSeg1[0]);
		int minutoInicial = Integer.parseInt(horaMinSeg1[2]);
		int segundoInicial = Integer.parseInt(horaMinSeg1[4]);

		String[] dia2 = diaF.split(" ");
		int diaFinal = Integer.parseInt(dia2[1]);
		String[] horaMinSeg2 = horaMinSegF.split(" ");
		int horaFinal = Integer.parseInt(horaMinSeg2[0]);
		int minutoFinal = Integer.parseInt(horaMinSeg2[2]);
		int segundoFinal = Integer.parseInt(horaMinSeg2[4]);

		if (diaInicial > diaFinal) {

			diaTotal = 0;
			horaTotal = 0;
			minutoTotal = 1;
			segundoTotal = 0;
			validador = false;

		} else if ((diaInicial == diaFinal)) {

			if ((horaInicial > horaFinal) || (minutoInicial > minutoFinal)
					|| (segundoInicial > segundoFinal)) {

				diaTotal = 0;
				horaTotal = 0;
				minutoTotal = 1;
				segundoTotal = 0;
				validador = false;
			}

		}

		if (validador) {

			if (segundoInicial <= segundoFinal) {

				segundoTotal = segundoFinal - segundoInicial;

			} else if (segundoInicial > segundoFinal) {

				minutoFinal--;
				segundoTotal = (60 - segundoInicial) + segundoFinal;
				if (segundoTotal == 60) {
					segundoTotal = 0;
				}
			}

			if (minutoInicial <= minutoFinal) {

				minutoTotal = minutoFinal - minutoInicial;

			} else if (minutoInicial > minutoFinal) {

				horaFinal--;
				minutoTotal = (60 - minutoInicial) + minutoFinal;
				if (minutoTotal == 60) {
					minutoTotal = 0;
				}
			}

			if (horaInicial <= horaFinal) {

				horaTotal = horaFinal - horaInicial;

			} else if (horaInicial > horaFinal) {

				diaFinal--;
				horaTotal = (24 - horaInicial) + horaFinal;
				if (horaTotal == 24) {
					horaTotal = 0;
				}
			}

			diaTotal = diaFinal - diaInicial;

		}

		System.out.printf("%d dia(s)\n", diaTotal);
		System.out.printf("%d hora(s)\n", horaTotal);
		System.out.printf("%d minuto(s)\n", minutoTotal);
		System.out.printf("%d segundo(s)\n", segundoTotal);
 
    }
 
}
