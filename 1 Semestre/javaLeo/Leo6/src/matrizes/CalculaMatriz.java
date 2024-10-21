package matrizes;

import java.util.Random;

public class CalculaMatriz {
    public static int[][] gerarMatriz() {
        Random rand = new Random();
        int[][] matriz = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = rand.nextInt(21) - 10; // números entre -10 e 10
            }
        }

        return matriz;
    }

    public static double mediaDiagonalPrincipal(int[][] matriz) {
        double soma = 0;
        int count = 0;

        for (int i = 0; i < 10; i++) {
            soma += matriz[i][i];
            count++;
        }

        return soma / count;
    }
}
