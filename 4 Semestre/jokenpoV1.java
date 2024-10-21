// Importar classes Random e Scanner
import java.util.Random;
import java.util.Scanner;

// Criar Main
public class Main {
	public static void main(String[] args) {

		// Criar objetos Scanner e Random
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		// Definir um array de strings que armazena as opC'C5es do jogo
		String[] opcoes = {"Pedra", "Papel", "Tesoura"};

		// Exibir uma mensagem de boas-vindas ao jogador
		System.out.println("\nPOV: Um suposto Dom chamado Quixote de la Mancha te desafia para um duelo e te jura liberdade caso vocC* ganhe dele no seu jogo favorito, Jokenpo (voce nao esta preso, na verdade ele esta delirando e voce sabe que com louco nao se discorda)");
		System.out.println("\n-Dom Quixote: Ok cavalheiro, voce sabe como o jogo funciona, escolha sua arma! \n");

		// Declarar uma variC!vel para controlar a repetiC'C#o do jogo
		boolean continuarJogando = true;

		// Iniciar loop principal para permitir a repetiC'C#o do jogo enquanto o jogador desejar
		while (continuarJogando) {
			// Exibir opC'C5es: 1. Pedra, 2. Papel, 3. Tesoura
			// Solicitar escolha do jogador
			System.out.println("1. Pedra");
			System.out.println("2. Papel");
			System.out.println("3. Tesoura");

			// Receber a escolha do jogador usando o Scanner
			if (!scanner.hasNextInt()) {
				System.out.println("Entrada invC!lida. Insira um nC:mero inteiro de 1 a 3.");
				scanner.next(); // Limpar a entrada invC!lida
				continue;
			}

			int escolhaJogador = scanner.nextInt();

			// Verificar se a escolha do jogador C) vC!lida
			if (escolhaJogador < 1 || escolhaJogador > 3) {
				System.out.println("Escolha invC!lida. Por favor, escolha um nC:mero entre 1 e 3.");
				continue;
			}

			// Gerar uma escolha aleatC3ria para o computador (um nC:mero entre 0 e 2 correspondendo C s opC'C5es no array)
			int escolhaComputador = random.nextInt(3);

			System.out.println("\nVoce escolheu: " + opcoes[escolhaJogador - 1]);
			System.out.println("Dom Quixote de la Mancha escolheu: " + opcoes[escolhaComputador] + "\n");

			// Determinar o resultado do jogo
			if (escolhaJogador - 1 == escolhaComputador) {
				System.out.println("Resultado: Empate!\n");
			} else if ((escolhaJogador - 1 == 0 && escolhaComputador == 2) ||
			           (escolhaJogador - 1 == 1 && escolhaComputador == 0) ||
			           (escolhaJogador - 1 == 2 && escolhaComputador == 1)) {
				System.out.println("Resultado: VocC* venceu Dom Quixote de la Mancha!\n");
			} else {
				System.out.println("Resultado: Dom Quixote de la Mancha venceu!\n");
			}

			// Perguntar ao jogador se deseja jogar novamente
			System.out.println("Deseja jogar novamente? Digite 'S' para Sim ou qualquer outra tecla para sair.");
			String jogarNovamente = scanner.next();

			if (!jogarNovamente.equalsIgnoreCase("S")) {
				continuarJogando = false;
				System.out.println("\nObrigado por jogar! \n\n" + "Desenvolvido por: \n Diego(Estrutura/logica), JoC#o Pedro(1a parte) e Vinicius(2a parte)");
			}
		}

		scanner.close();
	}
}