import java.util.*;

public class Lista1 {
    public static void main(String[] args) {
        //declara
        int [][] matriz = new int[7][9];
        Random rand = new Random();
        int soma = 0;

        // Preenche a matriz com números aleatórios de 0 a 99
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rand.nextInt(100);
                soma += matriz[i][j];
            }
        }

        // Imprime a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%7d ", matriz[i][j]);
            }
            System.out.println();
        }
        // Imprime a soma dos elementos
        System.out.println("A soma dos elementos da matriz é: "+ soma);
    }
}

/*
 Faça um algoritmo que gere aleatoriamente uma matriz de inteiros 7 x 9,
imprima a matriz e calcule e imprima a soma dos seus elementos.
 */
