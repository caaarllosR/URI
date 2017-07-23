package estudos.java.uri.iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */

//	URI Online Judge | 1154
//	Idades
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Fa�a um algoritmo para ler um n�mero indeterminado de dados, contendo cada um, a idade de um indiv�duo. 
//	O �ltimo dado, que n�o entrar� nos c�lculos, cont�m o valor de idade negativa. Calcular e imprimir a 
//	idade m�dia deste grupo de indiv�duos.
//	
//	Entrada
//	
//	A entrada cont�m um n�mero indeterminado de inteiros. A entrada ser� encerrada quando um valor negativo 
//	for lido.
//	
//	Sa�da
//	
//	A sa�da cont�m um valor correspondente � m�dia de idade dos indiv�duos.
//	
//	A m�dia deve ser impressa com dois d�gitos ap�s o ponto decimal.
//	
//	Exemplo de Entrada			Exemplo de Sa�da
//	
//	34							39.25
//	56
//	44
//	23
//	-2
//	---------------------------------------------
//	
//	
//	- Agradecimentos a Cassio F.

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1154
 *	RESPOSTA: Accepted
 *	TEMPO: 0.040s
 *	SUBMISS�O: 22/07/17 15:52:45
 */

public class Uri1154 {

	public static void main(String[] args) throws IOException {
		 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = 0, i = 0;
		float count = 0;
		
		x = Integer.parseInt(br.readLine());

		while (x > -1) {
			count+=x;
			i++;
			x = Integer.parseInt(br.readLine());
		}
		
		System.out.printf("%.2f\n", count/i); 
    }
	
}
