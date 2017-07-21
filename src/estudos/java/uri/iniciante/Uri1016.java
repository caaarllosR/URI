package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */

//	URI Online Judge | 1016
//	Dist�ncia
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Dois carros (X e Y) partem em uma mesma dire��o. O carro X sai com velocidade constante de 60 Km/h e o 
//	carro Y sai com velocidade constante de 90 Km/h.
//	
//	Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quil�metros do carro X, ou seja, consegue se 
//	afastar um quil�metro a cada 2 minutos.
//	
//	Leia a dist�ncia (em Km) e calcule quanto tempo leva (em minutos) para o carro Y tomar essa dist�ncia do 
//	outro carro.
//	
//	Entrada
//	
//	O arquivo de entrada cont�m um n�mero inteiro.
//	
//	Sa�da
//	
//	Imprima o tempo necess�rio seguido da mensagem " minutos".
//	
//	Exemplo de Entrada		Exemplo de Sa�da
//	
//	30						60 minutos
//	----------------------------------------
//	110						220 minutos
//	----------------------------------------
//	7						14 minutos

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1016
 *	RESPOSTA: Accepted
 *	0.052s
 *	SUBMISS�O: 01/05/15 18:47:02
 */

public class Uri1016 {
 
    public static void main(String[] args) throws IOException {
 
		int d;				
		Scanner s = new Scanner(System.in);
		
		d = s.nextInt();
		s.close();
		
		
		System.out.printf("%d minutos\n", d*2 );
 
    }
 
}
