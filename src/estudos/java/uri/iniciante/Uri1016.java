package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

//	URI Online Judge | 1016
//	Distância
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Dois carros (X e Y) partem em uma mesma direção. O carro X sai com velocidade constante de 60 Km/h e o 
//	carro Y sai com velocidade constante de 90 Km/h.
//	
//	Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros do carro X, ou seja, consegue se 
//	afastar um quilômetro a cada 2 minutos.
//	
//	Leia a distância (em Km) e calcule quanto tempo leva (em minutos) para o carro Y tomar essa distância do 
//	outro carro.
//	
//	Entrada
//	
//	O arquivo de entrada contém um número inteiro.
//	
//	Saída
//	
//	Imprima o tempo necessário seguido da mensagem " minutos".
//	
//	Exemplo de Entrada		Exemplo de Saída
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
 *	SUBMISSÃO: 01/05/15 18:47:02
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
