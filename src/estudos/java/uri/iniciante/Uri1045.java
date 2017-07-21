package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

//	URI Online Judge | 1045
//	Tipos de Triângulos
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa
//	o maior dos 3 lados. A seguir, determine o tipo de triângulo que estes três lados formam, com base nos 
//	seguintes casos, sempre escrevendo uma mensagem adequada:
//		
//	se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
//	se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
//	se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
//	se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
//	se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
//	se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
//	Entrada
//	
//	A entrada contem três valores de ponto flutuante de dupla precisão A (0 < A) , B (0 < B) e C (0 < C).
//	
//	Saída
//	
//	Imprima todas as classificações do triângulo especificado na entrada.
//	
//	Exemplos de Entrada			Exemplos de Saída
//	
//	7.0 5.0 7.0					TRIANGULO ACUTANGULO
//								TRIANGULO ISOSCELES
//	-------------------------------------------------
//	6.0 6.0 10.0				TRIANGULO OBTUSANGULO
//								TRIANGULO ISOSCELES
//	-------------------------------------------------
//	6.0 6.0 6.0					TRIANGULO ACUTANGULO
//								TRIANGULO EQUILATERO
//	-------------------------------------------------
//	5.0 7.0 2.0					NAO FORMA TRIANGULO
//	-------------------------------------------------
//	6.0 8.0 10.0				TRIANGULO RETANGULO

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1045
 *	RESPOSTA: Accepted
 *	TEMPO: 0.056s
 *	SUBMISSÃO: 22/07/15 17:44:24
 */

public class Uri1045 {
 
    public static void main(String[] args) throws IOException {
 
Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		float a, b, c, maiorAB, maiorAC, maiorABC, maiorBC, A, B, C;

		a = s.nextFloat();
		b = s.nextFloat();
		c = s.nextFloat();
		s.close();

		maiorAB = (a + b + Math.abs(a - b)) / 2;
		maiorAC = (a + c + Math.abs(a - c)) / 2;
		maiorBC = (b + c + Math.abs(b - c)) / 2;
		maiorABC = (maiorAB + maiorAC + Math.abs(maiorAB - maiorAC)) / 2;

		if (maiorABC == a) {
			A = a;
			B = b;
			C = c;
		}

		else if (maiorABC == b) {
			A = b;
			B = a;
			C = c;

		} else {
			A = c;
			B = a;
			C = b;
		}

		if (A >= (B + C)) {
			System.out.println("NAO FORMA TRIANGULO");

		} else if (Math.pow(A, 2) == (Math.pow(B, 2) + Math.pow(C, 2))) {
			System.out.println("TRIANGULO RETANGULO");

		} else if (Math.pow(A, 2) > (Math.pow(B, 2) + Math.pow(C, 2))) {
			System.out.println("TRIANGULO OBTUSANGULO");

		} else if (Math.pow(A, 2) < (Math.pow(B, 2) + Math.pow(C, 2))) {
			System.out.println("TRIANGULO ACUTANGULO");

		}

		if (A == B && B == C) {
			System.out.println("TRIANGULO EQUILATERO");

		} else if (A == B || B == C || C == A) {
			System.out.println("TRIANGULO ISOSCELES");
		}
 
    }
 
}
