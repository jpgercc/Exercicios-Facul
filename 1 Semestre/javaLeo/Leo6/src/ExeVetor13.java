import xvetores.InterseccaoVetores;
import java.util.Scanner;

public class ExeVetor13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[30];
        int[] vetorB = new int[30];

        //Lendo o vetor A
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = input.nextInt();
        }

        //Lendo o vetor B
        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = input.nextInt();
        }

        //Interseccao dos vetores A e B
        int[] vetorC = InterseccaoVetores.interseccao(vetorA, vetorB);

        //Imprimindo o vetor C
        System.out.println("Vetor C (Interseccao de A e B):");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
    }
}
