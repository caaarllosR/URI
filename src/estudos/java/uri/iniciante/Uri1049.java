package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */

//	URI Online Judge | 1049
//	Animal
//	Por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Neste problema, voc� dever� ler 3 palavras que definem o tipo de animal poss�vel segundo o esquema abaixo, 
//	da esquerda para a direita.  Em seguida conclua qual dos animais seguintes foi escolhido, atrav�s das tr�s 
//	palavras fornecidas.
//	
//	
//	                  carnivoro -> aguia
//	                 /
//				  ave
//	             /   \
//	            /     onivoro    -> pomba
//	           /
//	vertebrado
//			   \	  onivoro    -> homem
//			    \	 /
//				 mamifero
//				     \
//				      herbivoro  -> vaca
//	
//	
//	                  hematofago -> pulga
//	                 /
//				  inseto
//	             /   \
//	            /     herbivoro  -> lagarta
//	           /
//	invertebrado
//			   \	  hematofago -> sanguessuga
//			    \	 /
//				 anelideo
//				     \
//				      onivoro    -> minhoca
//	
//	
//	Entrada
//	
//	A entrada cont�m 3 palavras, uma em cada linha, necess�rias para identificar o animal segundo a figura acima,
//	com todas as letras min�sculas.
//	
//	Sa�da
//	
//	Imprima o nome do animal correspondente � entrada fornecida.
//	
//	Exemplos de Entrada			Exemplos de Sa�da
//	vertebrado					homem
//	mamifero
//	onivoro
//	---------------------------------------------
//	vertebrado					aguia
//	ave
//	carnivoro
//	---------------------------------------------
//	invertebrado				minhoca
//	anelideo
//	onivoro

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1049
 *	RESPOSTA: Accepted
 *	TEMPO: 0.048s
 *	SUBMISS�O: 22/07/15 18:07:15
 */

public class Uri1049 {
 
    public static void main(String[] args) throws IOException {
 
Scanner s = new Scanner(System.in);
		String a, b, c;

		a = s.nextLine();
		b = s.nextLine();
		c = s.nextLine();

		switch (a) {
		case "vertebrado":

			switch (b) {
			case "ave":
				switch (c) {
				case "carnivoro":
					System.out.println("aguia");
					break;

				case "onivoro":
					System.out.println("pomba");
					break;
				default:
					break;
				}
				break;

			case "mamifero":
				switch (c) {
				case "onivoro":
					System.out.println("homem");
					break;

				case "herbivoro":
					System.out.println("vaca");
					break;

				default:
					break;
				}
				break;

			default:
				break;
			}
			break;

		case "invertebrado":

			switch (b) {
			case "inseto":
				switch (c) {
				case "hematofago":
					System.out.println("pulga");
					break;

				case "herbivoro":
					System.out.println("lagarta");
					break;
				default:
					break;
				}
				break;

			case "anelideo":
				switch (c) {
				case "hematofago":
					System.out.println("sanguessuga");
					break;

				case "onivoro":
					System.out.println("minhoca");
					break;

				default:
					break;
				}
				break;

			default:
				break;
			}
			break;

		default:
			break;
		}
    }
 
}
