package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */

//	URI Online Judge | 1019
//	Convers�o de Tempo
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Leia um valor inteiro, que � o tempo de dura��o em segundos de um determinado evento em uma f�brica, e 
//	informe-o expresso no formato horas:minutos:segundos.
//	
//	Entrada
//	
//	O arquivo de entrada cont�m um valor inteiro N.
//	
//	Sa�da
//	
//	Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme 
//	exemplo fornecido.
//	
//	Exemplo de Entrada			Exemplo de Sa�da
//	
//	556							0:9:16
//	--------------------------------------------
//	1							0:0:1
//	--------------------------------------------
//	140153						38:55:53


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1019
 *	RESPOSTA: Accepted
 *	TEMPO: 0.056s
 *	SUBMISS�O: 01/05/15 21:09:16
 */

public class Uri1019 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);
        int t, nsh, nsm, nss;
        
	       t = s.nextInt();	     
	       
	       nsh =  t/3600;
	       t = t - nsh*3600;
	       nsm = t/60; 
	       t = t - nsm*60;
	       nss = t; 	       
	       
	       s.close();
	       
	       System.out.printf("%d:%d:%d\n",nsh, nsm, nss);
 
    }
 
}
