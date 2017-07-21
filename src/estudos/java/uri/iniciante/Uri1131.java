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

//	URI Online Judge | 1131
//	Grenais
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	A Federação Gaúcha de Futebol contratou você para escrever um programa para fazer uma estatística do 
//	resultado de vários GRENAIS. Escreva um programa para ler o número de gols marcados pelo Inter e 
//	pelo Grêmio em um GRENAL. Logo após escrever a mensagem "Novo grenal (1-sim 2-nao)" e solicitar uma 
//	resposta. Se a resposta for 1, o algoritmo deve ser executado novamente solicitando o número de gols 
//	marcados pelos times em uma nova partida, caso contrário deve ser encerrado imprimindo:
//	
//	- Quantos GRENAIS fizeram parte da estatística.
//	- O número de vitórias do Inter.
//	- O número de vitórias do Grêmio.
//	- O número de Empates.
//	- Uma mensagem indicando qual o time que venceu o maior número de GRENAIS (ou "Nao houve vencedor", 
//	caso termine empatado).
//	
//	Entrada
//	
//	O arquivo de entrada contém 2 valores inteiros, correspondentes aos gols marcados pelo Inter e pelo 
//	Grêmio respectivamente. Em seguida háverá um inteiro (1 ou 2), correspondente à repetição do programa.
//	
//	Saída
//	
//	Após cada leitura dos gols, deve ser impressa a mensagem "Novo grenal (1-sim 2-nao)". Quando o algoritmo 
//	for encerrado devem ser mostradas as estatísticas conforme a descrição apresentada acima. Obs: a palavra 
//	"Gremio" deve ser impressa sem acento, conforme o exemplo abaixo.
//	
//	Exemplo de Entrada			Exemplo de Saída
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
//	- Agradecimentos a Cássio F.

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1131
 *	RESPOSTA: Accepted
 *	TEMPO: 0.052s
 *	SUBMISSÃO: 07/08/15 15:21:23
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