package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner;


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1049
 *	RESPOSTA: Accepted
 *	TEMPO: 0.048s
 *	SUBMISSÃO: 22/07/15 18:07:15
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
