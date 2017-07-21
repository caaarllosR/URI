package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */

//	URI Online Judge | 1061
//	Tempo de um Evento
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Pedrinho est� organizando um evento em sua Universidade. O evento dever� ser no m�s de Abril, iniciando 
//	e terminando dentro do m�s. O problema � que Pedrinho quer calcular o tempo em segundos que o evento vai 
//	durar, uma vez que ele sabe quando inicia e quando termina o evento..
//	
//	Sabendo que o evento pode durar de poucos segundos a v�rios dias, voc� dever� ajudar Pedrinho a calcular 
//	a dura��o deste evento.
//	
//	Entrada
//	
//	Como entrada, na primeira linha vai haver a descri��o �Dia�, seguido de um espa�o e o dia do m�s no qual 
//	o evento vai come�ar. Na linha seguinte, ser� informado o momento no qual o evento vai iniciar, no 
//	formato hh : mm : ss. Na terceira e quarta linha de entrada haver� outra informa��o no mesmo formato 
//	das duas primeiras linhas, indicando o t�rmino do evento.
//	
//	Sa�da
//	
//	Na sa�da, deve ser apresentada a dura��o do evento, no seguinte formato:
//	
//	W dia(s)
//	X hora(s)
//	Y minuto(s)
//	Z segundo(s)
//	
//	Obs: Considere que o evento do caso de teste para o problema tem dura��o m�nima de 1 minuto.
//	
//	Exemplo de Entrada			Exemplo de Sa�da
//	
//	Dia 5						3 dia(s)
//	08 : 12 : 23				22 hora(s)
//	Dia 9						1 minuto(s)
//	06 : 13 : 23				0 segundo(s)

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1061
 *	RESPOSTA: Accepted
 *	TEMPO: 0.048s
 *	SUBMISS�O: 30/07/15 08:36:31
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
