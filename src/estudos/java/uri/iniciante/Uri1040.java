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

//	URI Online Judge | 1040
//	M�dia 3
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Leia quatro n�meros (N1, N2, N3, N4), cada um deles com uma casa decimal, correspondente �s quatro notas de 
//	um aluno. Calcule a m�dia com pesos 2, 3, 4 e 1, respectivamente, para cada uma destas notas e mostre esta 
//	m�dia acompanhada pela mensagem "Media: ". Se esta m�dia for maior ou igual a 7.0, imprima a mensagem 
//	"Aluno aprovado.". Se a m�dia calculada for inferior a 5.0, imprima a mensagem "Aluno reprovado.". 
//	Se a m�dia calculada for um valor entre 5.0 e 6.9, inclusive estas, o programa deve imprimir a mensagem 
//	"Aluno em exame.".
//	
//	No caso do aluno estar em exame, leia um valor correspondente � nota do exame obtida pelo aluno. Imprima 
//	ent�o a mensagem "Nota do exame: " acompanhada pela nota digitada. Recalcule a m�dia (some a pontua��o do 
//	exame com a m�dia anteriormente calculada e divida por 2). e imprima a mensagem "Aluno aprovado." 
//	(caso a m�dia final seja 5.0 ou mais ) ou "Aluno reprovado.", (caso a m�dia tenha ficado 4.9 ou menos). 
//	Para estes dois casos (aprovado ou reprovado ap�s ter pego exame) apresente na �ltima linha uma mensagem 
//	"Media final: " seguido da m�dia final para esse aluno.
//	
//	Entrada
//	
//	A entrada cont�m quatro n�meros de ponto flutuante correspendentes as notas dos alunos.
//	
//	Sa�da
//	
//	Todas as respostas devem ser apresentadas com uma casa decimal. As mensagens devem ser impressas conforme a 
//	descri��o do problema. N�o esque�a de imprimir o enter ap�s o final de cada linha, caso contr�rio obter� 
//	"Presentation Error".
//	
//	Exemplo de Entrada			Exemplo de Sa�da
//	
//	2.0 4.0 7.5 8.0				Media: 5.4
//	6.4							Aluno em exame.
//								Nota do exame: 6.4
//								Aluno aprovado.
//								Media final: 5.9
//	----------------------------------------------							
//	2.0 6.5 4.0 9.0				Media: 4.8
//								Aluno reprovado.
//	----------------------------------------------
//	9.0 4.0 8.5 9.0				Media: 7.3
//								Aluno aprovado.

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1040
 *	RESPOSTA: Accepted
 *	TEMPO: 0.064s
 *	SUBMISS�O: 08/07/15 15:08:27
 */

public class Uri1040 {
 
    public static void main(String[] args) throws IOException {
 
  Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		float n1, n2, n3, n4, media, ex;

		n1 = s.nextFloat();
		n2 = s.nextFloat();
		n3 = s.nextFloat();
		n4 = s.nextFloat();

		media = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / (2 + 3 + 4 + 1);
		
		System.out.printf("Media: %.1f\n", media);

		if (media >= 7.0) {
			System.out.printf("Aluno aprovado.\n");
		} else if (media < 5.0) {
			System.out.printf("Aluno reprovado.\n");
		} else {
			System.out.printf("Aluno em exame.\n");
			ex = s.nextFloat();
			System.out.printf("Nota do exame: %.1f\n", ex);

			media = (media + ex) / 2;

			if (media >= 5.0) {
				System.out.printf("Aluno aprovado.\n");
			} else {
				System.out.printf("Aluno reprovado.\n");
			}
			System.out.printf("Media final: %.1f\n", media);

		}
 
    }
 
}
