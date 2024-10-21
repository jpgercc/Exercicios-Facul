package xvetores;
import java.util.Scanner;

public class TransformaVetores {
    public static void transformaVetores(int[] vetorX, int[] vetorY) {
        Scanner input = new Scanner(System.in);

       //x
        System.out.println("Digite os elementos do vetor X:");
        for (int i = 0; i < vetorX.length; i++) {
            vetorX[i] = input.nextInt();
        }

        //y
        for (int i = 0; i < vetorX.length; i++) {
            if (vetorX[i] % 2 == 0) { //se for par
                vetorY[i] = vetorX[i] * 2;
            } else { //se for ímpar
                vetorY[i] = vetorX[i] * 3;
            }
        }

    }
}
