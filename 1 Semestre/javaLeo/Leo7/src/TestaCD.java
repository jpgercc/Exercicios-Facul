import java.util.Scanner;

public class TestaCD {
    public static void main(String[] args) {
        CD cd = new CD();
        cd.setNumeroMusicasCD(12);
        cd.setFaixaAtual(1);
        cd.setEstado(1);

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("----- Menu de Opções -----");
            System.out.println("1. Play");
            System.out.println("2. Pause");
            System.out.println("3. Stop");
            System.out.println("4. Próxima faixa");
            System.out.println("5. Faixa anterior");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cd.tocaCD();
                    break;
                case 2:
                    cd.interrompeCD();
                    break;
                case 3:
                    cd.paraCD();
                    break;
                case 4:
                    cd.proximaFaixa();
                    break;
                case 5:
                    cd.faixaAnterior();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            System.out.println();
        } while (opcao != 0);

        scanner.close();
    }
}
