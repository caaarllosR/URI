package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */

//	URI Online Judge | 1046
//	Tempo de Jogo
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo, sabendo que o mesmo pode 
//	come�ar em um dia e terminar em outro, tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas.
//	
//	Entrada
//	
//	A entrada cont�m dois valores inteiros representando a hora de in�cio e a hora de fim do jogo.
//	
//	Sa�da
//	
//	Apresente a dura��o do jogo conforme exemplo abaixo.
//	
//	Exemplo de Entrada			Exemplo de Sa�da
//	
//	16 2						O JOGO DUROU 10 HORA(S)
//	---------------------------------------------------
//	0 0							O JOGO DUROU 24 HORA(S)
//	---------------------------------------------------
//	2 16						O JOGO DUROU 14 HORA(S)

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1046
 *	RESPOSTA: Accepted
 *	TEMPO: 0.044s
 *	SUBMISS�O: 22/07/15 17:48:04
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
