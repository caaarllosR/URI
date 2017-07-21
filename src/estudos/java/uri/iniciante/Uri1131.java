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

//	URI Online Judge | 1131
//	Grenais
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	A Federa��o Ga�cha de Futebol contratou voc� para escrever um programa para fazer uma estat�stica do 
//	resultado de v�rios GRENAIS. Escreva um programa para ler o n�mero de gols marcados pelo Inter e 
//	pelo Gr�mio em um GRENAL. Logo ap�s escrever a mensagem "Novo grenal (1-sim 2-nao)" e solicitar uma 
//	resposta. Se a resposta for 1, o algoritmo deve ser executado novamente solicitando o n�mero de gols 
//	marcados pelos times em uma nova partida, caso contr�rio deve ser encerrado imprimindo:
//	
//	- Quantos GRENAIS fizeram parte da estat�stica.
//	- O n�mero de vit�rias do Inter.
//	- O n�mero de vit�rias do Gr�mio.
//	- O n�mero de Empates.
//	- Uma mensagem indicando qual o time que venceu o maior n�mero de GRENAIS (ou "Nao houve vencedor", 
//	caso termine empatado).
//	
//	Entrada
//	
//	O arquivo de entrada cont�m 2 valores inteiros, correspondentes aos gols marcados pelo Inter e pelo 
//	Gr�mio respectivamente. Em seguida h�ver� um inteiro (1 ou 2), correspondente � repeti��o do programa.
//	
//	Sa�da
//	
//	Ap�s cada leitura dos gols, deve ser impressa a mensagem "Novo grenal (1-sim 2-nao)". Quando o algoritmo 
//	for encerrado devem ser mostradas as estat�sticas conforme a descri��o apresentada acima. Obs: a palavra 
//	"Gremio" deve ser impressa sem acento, conforme o exemplo abaixo.
//	
//	Exemplo de Entrada			Exemplo de Sa�da
//	
//	3 							2Novo grenal (1-sim 2-nao)
//	1							Novo grenal (1-sim 2-nao)
//	2 3							Novo grenal (1-sim 2-nao)
//	13 							grenais
//	3 1							Inter:2
//	2							Gremio:1
//								Empates:0
//								Inter venceu mais
//	-------------------------------------------------------							
//								
//								
//	- Agradecimentos a C�ssio F.

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1131
 *	RESPOSTA: Accepted
 *	TEMPO: 0.052s
 *	SUBMISS�O: 07/08/15 15:21:23
 */

public class Uri1131 {
 
    public static void main(String[] args) throws IOException {
 
Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		int winInter = 0, winGremio = 0, golInter = 0, golGremio = 0, empate = 0, opcao = 0, grenais = 0;

		do {

			golInter = s.nextInt();
			golGremio = s.nextInt();

			if (golInter > golGremio) {

				winInter++;
			} else if (golInter < golGremio) {

				winGremio++;
			} else {

				empate++;
			}
			grenais++;
			System.out.println("Novo grenal (1-sim 2-nao)");
			opcao = s.nextInt();
		} while (opcao == 1);

		System.out.printf("%d grenais\n", grenais);
		System.out.printf("Inter:%d\n", winInter);
		System.out.printf("Gremio:%d\n", winGremio);
		System.out.printf("Empates:%d\n", empate);

		if (winInter > winGremio)

		{
			System.out.println("Inter venceu mais");
		} else if (winInter < winGremio)

		{
			System.out.println("Gremio venceu mais");
		} else

		{
			System.out.println("Nao houve vencedor");
		}

 
    }
 
}