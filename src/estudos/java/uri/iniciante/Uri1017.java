package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */

//	URI Online Judge | 1017
//	Gasto de Combust�vel
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	
//	Joaozinho quer calcular e mostrar a quantidade de litros de combust�vel gastos em uma viagem, ao utilizar um 
//	autom�vel que faz 12 KM/L. Para isso, ele gostaria que voc� o auxiliasse atrav�s de um simples programa. Para efetuar o c�lculo, deve-se fornecer o tempo gasto na viagem (em horas) e a velocidade m�dia durante a mesma (em km/h). Assim, pode-se obter dist�ncia percorrida e, em seguida, calcular quantos litros seriam necess�rios. Mostre o valor com 3 casas decimais ap�s o ponto.
//	
//	Entrada
//	
//	O arquivo de entrada cont�m dois inteiros. O primeiro � o tempo gasto na viagem (em horas) e o segundo � a 
//	velocidade m�dia durante a mesma (em km/h).
//	
//	Sa�da
//	
//	Imprima a quantidade de litros necess�ria para realizar a viagem, com tr�s d�gitos ap�s o ponto decimal
//	
//	Exemplo de Entrada		Exemplo de Sa�da
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
 *	SUBMISS�O: 01/05/15 19:04:02
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
