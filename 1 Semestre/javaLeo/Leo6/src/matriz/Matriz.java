package matriz;

import java.util.Random;

public class Matriz {
    private int[][] matriz;

    public Matriz() {
        matriz = new int[6][8];
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                matriz[i][j] = random.nextInt(21) - 10; // números aleatorios entre -10 e 10
            }
        }
    }

    public void imprimirMatriz() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(matriz[i][j] + "\t \t \t");
            }
            System.out.println();
        }
    }

    public int[] contarNegativosPorLinha() {
        int[] vetorC = new int[6];
        for (int i = 0; i < 6; i++) {
            int contador = 0;
            for (int j = 0; j < 8; j++) {
                if (matriz[i][j] < 0) {
                    contador++;
                }
            }
            vetorC[i] = contador;
        }
        return vetorC;
    }

    public int calcularSomaElementos() {
        int soma = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                soma += matriz[i][j];
            }
        }
        return soma;
    }
}
