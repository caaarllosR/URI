package estudos.java.uri.iniciante;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */

//	URI Online Judge | 1149
//	Somando Inteiros Consecutivos
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1

//	Fa�a um algoritmo para ler um valor A e um valor N. Imprimir a soma dos N n�meros a partir de 
//  A(inclusive). Enquanto N for negativo ou ZERO, um novo N(apenas N) deve ser lido.
//	
//	Entrada
//	
//	A entrada cont�m somente valores inteiros, podendo ser positivos ou negativos. Todos os valores est�o 
//  na mesma linha.
//	
//	Sa�da
//	
//	A sa�da cont�m apenas um valor inteiro.
//	
//	Exemplo de Entrada			Exemplo de Sa�da
//
//	3 2							7
//	--------------------------------------------
//	
//	- Agradecimentos a C�ssio F.

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1149
 *	RESPOSTA: Accepted
 *	TEMPO: 0.044s
 *	SUBMISS�O: 15/08/15 15:46:27
 */

public class Uri1149 {
  
    public static void main(String[] args) throws IOException {
  
        Scanner s = new Scanner(System.in);
         
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));     
        StringBuilder valor = new StringBuilder();
         
        int a = 0, n = 2, m = 0, result = 0, i = 1;
        a = s.nextInt();
 
        while ((n = s.nextInt()) <= 0); 
 
        m = a + n;
 
        while (a < m) {
 
            result += a;
            a++;
        }
		bw.write(valor.append(new Integer(result).toString()).append("\n").toString());
        bw.flush();
  
    }
  
}
