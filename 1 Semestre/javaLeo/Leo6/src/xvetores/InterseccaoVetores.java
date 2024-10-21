package xvetores;

public class InterseccaoVetores {
    public static int[] interseccao(int[] vetorA, int[] vetorB) {
        int[] vetorC = new int[30];
        int posicaoC = 0;

        for (int i = 0; i < vetorA.length; i++) {
            for (int j = 0; j < vetorB.length; j++) {
                if (vetorA[i] == vetorB[j]) {
                    vetorC[posicaoC] = vetorA[i];
                    posicaoC++;
                    break;
                }
            }
        }

        int[] vetorInterseccao = new int[posicaoC];
        System.arraycopy(vetorC, 0, vetorInterseccao, 0, posicaoC);

        return vetorInterseccao;
    }
}
