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

//	URI Online Judge | 1043
//	Triângulo
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. Em caso positivo, calcule o 
//	perímetro do triângulo e apresente a mensagem:
//	
//	
//	Perimetro = XX.X
//	
//	
//	Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem
//	
//	
//	Area = XX.X
//	
//	Entrada
//	
//	A entrada contém três valores reais.
//	
//	Saída
//	
//	O resultado deve ser apresentado com uma casa decimal.
//	
//	Exemplo de Entrada			Exemplo de Saída
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
 *	SUBMISSÃO: 22/07/15 17:42:11
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
