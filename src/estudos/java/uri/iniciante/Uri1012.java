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

//	URI Online Judge | 1012
//	Área
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	RESPOSTA: Accepted
//	TEMPO: 0.060s
//	SUBMISSÃO: 30/04/15 13:58:02
//	
//	
//	Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule 
//	e mostre: 
//		
//	a) a área do triângulo retângulo que tem A por base e C por altura. 
//	b) a área do círculo de raio C. (pi = 3.14159) 
//	c) a área do trapézio que tem A e B por bases e C por altura. 
//	d) a área do quadrado que tem lado B. 
//	e) a área do retângulo que tem lados A e B. 
//	
//	Entrada
//	
//	O arquivo de entrada contém três valores com um dígito após o ponto decimal.
//	
//	Saída
//	
//	O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima, 
//	sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. O valor calculado deve ser 
//	apresentado com 3 dígitos após o ponto decimal.
//	
//	Exemplos de Entrada			Exemplos de Saída
//	
//	3.0 4.0 5.2					TRIANGULO: 7.800
//								CIRCULO: 84.949
//								TRAPEZIO: 18.200
//								QUADRADO: 16.000
//								RETANGULO: 12.000
//	----------------------------------------------
//	12.7 10.4 15.2				TRIANGULO: 96.520
//								CIRCULO: 725.833
//								TRAPEZIO: 175.560
//								QUADRADO: 108.160
//								RETANGULO: 132.080

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1012
 *	RESPOSTA: Accepted
 *	TEMPO: 0.060s
 *	SUBMISSÃO: 30/04/15 13:58:02
 */

public class Uri1012 {
 
    public static void main(String[] args) throws IOException {
 
		Locale.setDefault(Locale.US);
		double a, b, c, areaTri, areaC, areaTra, areaQ, areaR, pi = 3.14159;
		Scanner s = new Scanner(System.in);
		
		a = s.nextDouble();
		b = s.nextDouble();
		c = s.nextDouble();
		
		areaTri = a*c/2;
		areaC = pi * c*c;
		areaTra = c*(a+b)/2;
		areaQ = b*b;
		areaR = a*b;
		
		System.out.printf("TRIANGULO: %.3f\n"
						+ "CIRCULO: %.3f\n"
						+ "TRAPEZIO: %.3f\n"
						+ "QUADRADO: %.3f\n"
						+ "RETANGULO: %.3f\n"
						,areaTri,areaC,areaTra,areaQ,areaR);
 
    }
 
}
