import xvetores.TransformaVetores;

public class ExeVetor07 {
    public static void main(String[] args) {
        int[] vetorX = new int[10];
        int[] vetorY = new int[10];

        TransformaVetores.transformaVetores(vetorX, vetorY);

        //Imprimindo o vetor Y
        System.out.println("Vetor Y:");
        for (int j : vetorY) {
            System.out.print(j + " ");
        }
    }
}
