package xvetores;

import java.util.Scanner;

public class Xvetores {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        System.out.println("Digite os 10 elementos do vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = input.nextInt();
        }

        System.out.println("Digite os 10 elementos do vetor B:");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = input.nextInt();
        }

        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] * vetorB[i];
        }
        System.out.println("|------------------------------------------|");
        System.out.println("Vetor C:");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(+vetorC[i] + ", ");
        }
        System.out.print("\n|------------------------------------------|");
    }
}
