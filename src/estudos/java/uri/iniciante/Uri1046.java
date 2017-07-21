package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

//	URI Online Judge | 1046
//	Tempo de Jogo
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
//	começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
//	
//	Entrada
//	
//	A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.
//	
//	Saída
//	
//	Apresente a duração do jogo conforme exemplo abaixo.
//	
//	Exemplo de Entrada			Exemplo de Saída
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
