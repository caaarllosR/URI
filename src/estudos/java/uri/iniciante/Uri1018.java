package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */

//	URI Online Judge | 1018
//	C�dulas
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//		
//	Leia um valor inteiro. A seguir, calcule o menor n�mero de notas poss�veis (c�dulas) no qual o valor pode 
//	ser decomposto. As notas consideradas s�o de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a rela��o de notas necess�rias.
//	
//	Entrada
//	
//	O arquivo de entrada cont�m um valor inteiro N (0 < N < 1000000).
//	
//	Sa�da
//	
//	Imprima o valor lido e, em seguida, a quantidade m�nima de notas de cada tipo necess�rias, conforme o exemplo
//	fornecido. N�o esque�a de imprimir o fim de linha ap�s cada linha, caso contr�rio seu programa apresentar� a 
//	mensagem: �Presentation Error�.
//	
//	Exemplo de Entrada		Exemplo de Sa�da
//	
//	576						576
//							5 nota(s) de R$ 100,00
//							1 nota(s) de R$ 50,00
//							1 nota(s) de R$ 20,00
//							0 nota(s) de R$ 10,00
//							1 nota(s) de R$ 5,00
//							0 nota(s) de R$ 2,00
//							1 nota(s) de R$ 1,00
//	------------------------------------------------						
//	11257					11257
//							112 nota(s) de R$ 100,00
//							1 nota(s) de R$ 50,00
//							0 nota(s) de R$ 20,00
//							0 nota(s) de R$ 10,00
//							1 nota(s) de R$ 5,00
//							1 nota(s) de R$ 2,00
//							0 nota(s) de R$ 1,00						
//	------------------------------------------------
//	503						503
//							5 nota(s) de R$ 100,00
//							0 nota(s) de R$ 50,00
//							0 nota(s) de R$ 20,00
//							0 nota(s) de R$ 10,00
//							0 nota(s) de R$ 5,00
//							1 nota(s) de R$ 2,00
//							1 nota(s) de R$ 1,00

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1018
 *	RESPOSTA: Accepted
 *	0.052s
 *	SUBMISS�O: 01/05/15 20:20:19
 */

public class Uri1018 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);
        int v, n, n100, n50, n20, n10, n5, n2, n1;
        
	       v = s.nextInt();
	       n = v;
	       
	       n100 =  v/100;
	       v = v - n100*100;
	       n50 = v/50; 
	       v = v - n50*50;
	       n20 = v/20; 
	       v = v - n20*20;
	       n10 = v/10; 
	       v = v - n10*10;
	       n5 = v/5;
	       v = v - n5*5;
	       n2 = v/2;
	       v = v - n2*2;
	       n1 = v/1;
	       v = v - n1*1;
        s.close();
 
        System.out.printf("%d\n"
        				 +"%d nota(s) de R$ 100,00\n"
        				 +"%d nota(s) de R$ 50,00\n"
        				 +"%d nota(s) de R$ 20,00\n"
        				 +"%d nota(s) de R$ 10,00\n"
        				 +"%d nota(s) de R$ 5,00\n"
						 +"%d nota(s) de R$ 2,00\n"
						 +"%d nota(s) de R$ 1,00\n", n, n100, n50, n20, n10, n5, n2, n1);
 
    }
 
}
