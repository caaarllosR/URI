package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

//	URI Online Judge | 1047
//	Tempo de Jogo com Minutos
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.
//	
//	Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.
//	
//	Entrada
//	
//	Quatro números inteiros representando a hora de início e fim do jogo.
//	
//	Saída
//	
//	Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)” .
//	
//	Exemplo de Entrada			Exemplo de Saída
//	
//	7 8 9 10					O JOGO DUROU 2 HORA(S) E 2 MINUTO(S)
//	-----------------------------------------------------------------
//	7 7 7 7						O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)
//	-----------------------------------------------------------------
//	7 10 8 9					O JOGO DUROU 0 HORA(S) E 59 MINUTO(S)

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1047
 *	RESPOSTA: Accepted
 *	TEMPO: 0.048s
 *	SUBMISSÃO: 22/07/15 17:50:18
 */

public class Uri1047 {
 
    public static void main(String[] args) throws IOException {
 
int horas = 0, minutos= 0;
			
			Scanner s = new Scanner(System.in);
			
			int horainicial = s.nextInt();
			int minutoinicial = s.nextInt();
			int horafinal = s.nextInt();
			int minutofinal = s.nextInt();
			 
			 
			if (horainicial<horafinal){
			        horas = horafinal - horainicial;
			}
			    else if (horainicial>horafinal){
			        horas=  (24 - horainicial)+ horafinal;
			    }
			        else if ((horainicial == horafinal)&&(minutoinicial!=minutofinal)){
			            horas = 0;
			        }
			            else if ((horainicial == horafinal)&&(minutofinal == minutoinicial)){
			                horas = 24;
			            }
			 
			if (minutoinicial<=minutofinal){
			 
			    minutos = minutofinal - minutoinicial;
			    }
			    else if (minutoinicial>minutofinal){
			 
			        minutos = (60 - minutoinicial) + minutofinal;
			            if (horas !=0){
			            horas = horas - 1;
			        }
			    }
			 		 
			 
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horas, minutos);
			  
    }
 
}
