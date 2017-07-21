package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */

//	URI Online Judge | 1020
//	Idade em Dias
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Leia um valor inteiro correspondente � idade de uma pessoa em dias e informe-a em anos, meses e dias
//	
//	Obs.: apenas para facilitar o c�lculo, considere todo ano com 365 dias e todo m�s com 30 dias. Nos casos de 
//	teste nunca haver� uma situa��o que permite 12 meses e alguns dias, como 360, 363 ou 364. Este � apenas um 
//	exerc�cio com objetivo de testar racioc�nio matem�tico simples.
//	
//	Entrada
//	
//	O arquivo de entrada cont�m um valor inteiro.
//	
//	Sa�da
//	
//	Imprima a sa�da conforme exemplo fornecido.
//	
//	Exemplo de Entrada	Exemplo de Sa�da
//	
//	400					1 ano(s)
//						1 mes(es)
//						5 dia(s)
//	------------------------------------
//	800					2 ano(s)
//						2 mes(es)
//						10 dia(s)
//	------------------------------------
//	30					0 ano(s)
//						1 mes(es)
//						0 dia(s)

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1020
 *	RESPOSTA: Accepted
 *	TEMPO: 0.056s
 *	SUBMISS�O: 01/05/15 21:19:54
 */

public class Uri1020 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);
        int a, m, d, i;
        
	       i = s.nextInt();
	       
	       a =  i/365;
	       i = i - a*365;
	       m = i/30; 
	       i = i - m*30;
	       d = i; 
	       
        s.close();
 
        System.out.printf("%d ano(s)\n"
        				 +"%d mes(es)\n"
        				 +"%d dia(s)\n"
        				 , a, m, d);
 
    }
 
}
