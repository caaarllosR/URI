package estudos.java.uri.iniciante;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1002
 *	RESPOSTA: Accepted
 *	TEMPO: 0.052s
 *	SUBMISSÃO: 29/04/15 21:01:26
 */
	
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