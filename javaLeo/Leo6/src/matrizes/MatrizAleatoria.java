package matrizes;

import java.util.Random;

public class MatrizAleatoria {
    public static void geraMatrizAleatoria(int[][] matriz) {
        Random random = new Random();
        System.out.println("|----------------|");
        // Preenchendo a matriz aleatoriamente e calculando a soma dos elementos
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = random.nextInt(10);
                soma += matriz[i][j];
            }
        }

        // Imprimindo a matriz e a soma dos elementos
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("|----------------|");
        System.out.println("|------------------------------------------|");
        System.out.println("A soma dos numeros da matriz é igual a: " + soma);
        System.out.println("|------------------------------------------|");
    }
}
