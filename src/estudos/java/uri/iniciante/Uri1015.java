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

//	URI Online Judge | 1015
//	Distância Entre Dois Pontos
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	RESPOSTA: Accepted
//	TEMPO: 0.064s
//	SUBMISSÃO: 01/05/15 18:34:10
//		
//		
//	Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e 
//	p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:
//	
//	Distancia = sqrt((x2-x1)^2+(y2-y1)^2)
//	
//	Entrada
//	
//	O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante: x1 y1 e a segunda linha 
//	contém dois valores de ponto flutuante x2 y2.
//	
//	Saída
//	
//	Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.
//	
//	Exemplo de Entrada			Exemplo de Saída
//	
//	1.0 7.0						4.4721
//	5.0 9.0
//	--------------------------------------------
//	-2.5 0.4					16.1484
//	12.1 7.3
//	--------------------------------------------
//	2.5 -0.4					16.4575
//	-12.2 7.0

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1015
 *	RESPOSTA: Accepted
 *	TEMPO: 0.064s
 *	SUBMISSÃO: 01/05/15 18:34:10
 */

public class Uri1015 {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);
         
        float x1, y1, x2, y2;
 
        x1 = s.nextFloat();     
        y1 = s.nextFloat();
         
        x2 = s.nextFloat();
        y2 = s.nextFloat();
         
        s.close();  
 
        System.out.printf("%.4f/n", Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)));
 
    }
 
}
