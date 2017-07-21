package estudos.java.uri.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */

//	URI Online Judge | 1043
//	Tri�ngulo
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Leia 3 valores reais (A, B e C) e verifique se eles formam ou n�o um tri�ngulo. Em caso positivo, calcule o 
//	per�metro do tri�ngulo e apresente a mensagem:
//	
//	
//	Perimetro = XX.X
//	
//	
//	Em caso negativo, calcule a �rea do trap�zio que tem A e B como base e C como altura, mostrando a mensagem
//	
//	
//	Area = XX.X
//	
//	Entrada
//	
//	A entrada cont�m tr�s valores reais.
//	
//	Sa�da
//	
//	O resultado deve ser apresentado com uma casa decimal.
//	
//	Exemplo de Entrada			Exemplo de Sa�da
//	
//	6.0 4.0 2.0 				Area = 10.0
//	--------------------------------------------
//	6.0 4.0 2.1					Perimetro = 12.1

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1043
 *	RESPOSTA: Accepted
 *	TEMPO: 0.056s
 *	SUBMISS�O: 22/07/15 17:42:11
 */

public class Uri1043 {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);
        double a, b, c;
 
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        s.close();
 
        if ((Math.abs(b - c) < a && a < (b + c))
                && (Math.abs(a - c) < b && b < (a + c))
                && (Math.abs(a - b) < c && c < (a + b))) {
 
            System.out.printf("Perimetro = %.1f\n", a + b + c);
 
        } else {
            System.out.printf("Area = %.1f\n", (1.0 / 2.0) * (a + b) * c);
        }
 
    }
 
}
