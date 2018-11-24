package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner;


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
