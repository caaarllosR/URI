package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

//	URI Online Judge | 1035
//	Teste de Seleção 1
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//
//	Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, e a soma 
//	de C com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a variável A for par 
//	escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".
//	
//	Entrada
//	
//	Quatro números inteiros A, B, C e D.
//	
//	Saída
//	
//	Mostre a respectiva mensagem após a validação dos valores.
//	
//	Exemplo de Entrada			Exemplo de Saída
//	
//	5 6 7 8             		Valores nao aceitos
//	-----------------------------------------------
//	2 3 2 6             		Valores aceitos


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1035
 *	RESPOSTA: Accepted
 *	TEMPO: 0.052s
 *	SUBMISSÃO: 06/05/15 22:10:09
 */

public class Uri1035 {
 
    public static void main(String[] args) throws IOException {
 
    	Scanner s = new Scanner(System.in);
		
		int A = s.nextInt();
		int B = s.nextInt();
		int C = s.nextInt();
		int D = s.nextInt();
		
		s.close();
		
		if (B>C){
			if (D>A){
				if((C+D)>(A+B)){
					if (C>0){
						if(D>0){
							System.out.print("Valores aceitos\n");
						} else {
							System.out.print("Valores nao aceitos\n");
						}
					} else {
						System.out.print("Valores nao aceitos\n");
					}
				} else {
					System.out.print("Valores nao aceitos\n");
				}
			} else {
				System.out.print("Valores nao aceitos\n");
			}
		} else {
			System.out.print("Valores nao aceitos\n");
		}
 
    }
 
}
