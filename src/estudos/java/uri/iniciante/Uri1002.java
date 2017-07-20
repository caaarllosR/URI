package estudos.java.uri.iniciante;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */


//	URI Online Judge | 1002
//	Área do Círculo
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//
//	RESPOSTA: Accepted
//	TEMPO: 0.052s
//	SUBMISSÃO: 29/04/15 21:01:26
//
//
//	A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema
//	que π = 3.14159:
//	
//	- Efetue o cálculo da área, elevando o valor de Raio ao quadrado e multiplicando por π.
//	
//	Entrada
//	
//	A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.
//	
//	Saída
//	
//	Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo, com 4 casas após
//	o ponto decimal. Utilize variáveis de dupla precisão (double). Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
//	
//	Exemplos de Entrada		Exemplos de Saída
//	
//	2.00					A=12.5664
//	-----------------------------------------
//	
//	100.64					A=31819.3103
//	-----------------------------------------
//	
//	150.00					A=70685.7750


	
public class Uri1002 {
 
    public static void main(String[] args) throws IOException {
 
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		
		double area, raio;
		
		raio = Double.parseDouble(in.readLine());
		area = 3.14159 * Math.pow(raio,2);
		
		System.out.printf("A=%.4f\n", area);
 
    }
 
}