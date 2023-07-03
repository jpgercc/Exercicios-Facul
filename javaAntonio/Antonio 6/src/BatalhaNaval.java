import java.util.Scanner;

public class BatalhaNaval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[21][21];

        System.out.println("Insira a porcentagem de navios (entre 0 e 100): ");
        int porcentagem = sc.nextInt();

        naviosMatriz(matriz, porcentagem / 100.0);


        //naviosMatriz(matriz);
        // naviosMatriz.escolhe(matriz);
        while (true){
            System.out.println("|---------------------------------------------------|");
            System.out.println("          - Digite um numero de 1 até 20 -");
            System.out.println("|---------------------------------------------------|");
            mostraMatriz(matriz);




            System.out.println("Digite a linha (horizontal): ");
            int linha = sc.nextInt();

            System.out.println("Digite a coluna (vertical): ");
            int coluna = sc.nextInt();
            if (linha < 1 || linha > 20){
                System.out.println("!Insira o valor da linha entre 1 até 20!");
                return;
            }
            if (coluna < 1 || coluna > 20){
                System.out.println("!Insira o valor da coluna entre 1 até 20!");
                return;
            }
            if (matriz[linha][coluna] == 1){
                System.out.println("Voce derrubou o navio!");
                System.out.println("|---------------------------------------------------|");
                System.out.println("""
                         ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣄⠈⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⣴⣄⠀⢀⣤⣶⣦⣀⠀⠀⣰⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⢸⣿⣷⣌⠻⢿⣩⡿⢷⣄⠙⢿⠟⠀⠀⠀⠀⠀⠰⣄⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠈⣿⣿⣿⣷⣄⠙⢷⣾⠟⣷⣄⠀⠀⠀⠀⣠⣿⣦⠈⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⢿⣿⣿⣿⣿⣷⣄⠙⢿⣏⣹⣷⣄⠀⢴⣿⣿⠃⠀⠀⠀⠀⢀⡀⠀⠀
                        ⠀⠀⠀⠸⣦⡙⠻⣿⣿⣿⣿⣷⣄⠙⢿⣤⡿⢷⣄⠙⠃⠀⠀⠀⠀⣀⡈⠻⠂⠀
                        ⠀⠀⠀⠀⠈⠻⣦⡈⠻⣿⣿⣿⣿⣷⣄⠙⢷⣾⠛⣷⣄⠀⠀⢀⣴⣿⣿⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠈⠻⣦⡈⠛⠛⠻⣿⣿⣷⣄⠙⠛⠋⢹⣷⣄⠈⠻⠛⠃⠀⠀⠀
                        ⠀⢀⣴⣿⣧⡀⠀⠀⠈⢁⣼⣿⣄⠙⢿⡿⠋⣠⣿⣧⡀⠠⡿⠗⢀⣼⣿⣦⡀⠀
                        ⠀⠟⠛⠉⠙⠻⣶⣤⣶⠟⠋⠉⠛⢷⣦⣴⡾⠛⠉⠙⠻⣶⣤⣶⠟⠋⠉⠛⠻⠀
                        ⠀⣶⣿⣿⣿⣦⣄⣉⣠⣶⣿⣿⣷⣦⣈⣁⣴⣾⣿⣿⣶⣄⣉⣠⣶⣿⣿⣿⣶⠀
                        ⠀⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠀""");
                matriz[linha][coluna] = 0;
            }
            else {
                System.out.println("Voce acertou na agua");
                System.out.println("|---------------------------------------------------|");
                System.out.println("""
                         ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⣶⠾⠿⠿⠯⣷⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⣾⠛⠁⠀⠀⠀⠀⠀⠀⠈⢻⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⠿⠁⠀⠀⠀⢀⣤⣾⣟⣛⣛⣶⣬⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⠟⠃⠀⠀⠀⠀⠀⣾⣿⠟⠉⠉⠉⠉⠛⠿⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⡟⠋⠀⠀⠀⠀⠀⠀⠀⣿⡏⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⣠⡿⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣷⡍⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣤⣤⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⣠⣼⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠷⣤⣤⣠⣤⣤⡤⡶⣶⢿⠟⠹⠿⠄⣿⣿⠏⠀⣀⣤⡦⠀⠀⠀⠀⣀⡄
                        ⢀⣄⣠⣶⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠓⠚⠋⠉⠀⠀⠀⠀⠀⠀⠈⠛⡛⡻⠿⠿⠙⠓⢒⣺⡿⠋⠁
                        ⠉⠉⠉⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠁⠀""");
            }
            if (jogoAcabou(matriz)){
                System.out.println("Parabéns! Você ganhou!");
                System.out.println("|---------------------------------------------------|");
                System.out.println("""
                                                                         \s
                                    ############################         \s
                                    ##########################           \s
                                    ##########################           \s
                                    ##########################  ##       \s
                              ########################################   \s
                            ####    ##########################      ##   \s
                            ####      ########################      ##   \s
                              ##      ########################    ####   \s
                                ####    ####################    ####     \s
                                  ################################       \s
                                      ########################           \s
                                          ##############                 \s
                                            ############                 \s
                                              ########                   \s
                                                                         \s
                                                                         \s
                                          ##############                 \s
                                          ################               \s
                                          ################               \s
                                        ##################      \
                        """);
                break;
            }
        }
        sc.close();
    }
    private static void naviosMatriz(int[][] matriz, double probabilidadeNavio) {
        for (int i = 1; i < 21; i++){
            for (int j = 1; j < 21; j++){
                if (Math.random() < probabilidadeNavio){
                    matriz[i][j] = 1;
                }
            }
        }
    }
    private static boolean jogoAcabou(int[][] matriz) {
        for (int i = 1; i < 21; i++) {
            for (int j = 1; j < 21; j++) {
                if (matriz[i][j] == 1) {
                    return false;
                }
            }
        }
        return true;
    }
    private static void mostraMatriz(int[][] matriz) {
        for (int i = 1; i < 21; i++) {
            for (int j = 1; j < 21; j++){
                if (matriz[i][j] == 1) {
                    System.out.print("\uD83D\uDEA2");
                } else {
                    System.out.print("\uD83C\uDF0A");
                }
            }
            System.out.println();
        }
    }
}

