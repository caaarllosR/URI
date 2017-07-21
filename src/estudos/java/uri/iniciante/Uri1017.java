package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

//	URI Online Judge | 1017
//	Gasto de Combustível
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	
//	Joaozinho quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem, ao utilizar um 
//	automóvel que faz 12 KM/L. Para isso, ele gostaria que você o auxiliasse através de um simples programa. Para efetuar o cálculo, deve-se fornecer o tempo gasto na viagem (em horas) e a velocidade média durante a mesma (em km/h). Assim, pode-se obter distância percorrida e, em seguida, calcular quantos litros seriam necessários. Mostre o valor com 3 casas decimais após o ponto.
//	
//	Entrada
//	
//	O arquivo de entrada contém dois inteiros. O primeiro é o tempo gasto na viagem (em horas) e o segundo é a 
//	velocidade média durante a mesma (em km/h).
//	
//	Saída
//	
//	Imprima a quantidade de litros necessária para realizar a viagem, com três dígitos após o ponto decimal
//	
//	Exemplo de Entrada		Exemplo de Saída
//	
//	10						70.833
//	85
//	----------------------------------------
//	2						15.333
//	92
//	----------------------------------------
//	22						122.833
//	67

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1017
 *	RESPOSTA: Accepted
 *	TEMPO: 0.080s
 *	SUBMISSÃO: 01/05/15 19:04:02
 */

public class Uri1017 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);
        int d, t;
        double kml;
 
        d = Integer.parseInt(s.nextLine());
        t = Integer.parseInt(s.nextLine());
        kml = (d * t)*1.0 / 12;
        s.close();
 
        System.out.printf("%.3f\n", kml);
 
    }
 
}
