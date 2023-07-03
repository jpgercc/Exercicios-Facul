import java.util.*;

public class Lista2 {
    public static void main(String[] args) {
        int [][] matriz = new int[6][8];
        Random rand = new Random();
        int[] vetorC = new int [6];

        //preenche matriz
        for(int i = 0; i < matriz.length;i++){
            for (int j = 0;j < matriz.length;j++){
             matriz[i][j] = rand.nextInt(199) - 99;
            }
        }
        // Conta a quantidade de elementos negativos de cada linha da matriz
        for (int i = 0; i < matriz.length; i++) {
            int negativos = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    negativos++;
                }
            }
            vetorC[i] = negativos;
        }
        // Imprime a matriz M e o vetor C
        for (int[] ints : matriz) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("%7d ", ints[j]);
            }
            System.out.println();
        }
        //imprime vetor c
        System.out.print("\n\nQuantidade de numeros negativos");
        for (int j : vetorC) {
            System.out.printf("%7d ", j);
        }
        System.out.println();
    }
}
/*
Dada uma matriz M[1..6][1..8] criada randomicamente, criar um vetor C
que contenha em cada posição a quantidade de elementos negativos da linha correspondente
de M. Tamanho de C igual ao número de linhas da matriz.
 */