package preencherVetor;

public class PreencherVetor {
    public void preencher() {
        int[] B = new int[10];

        for (int i = 0; i < B.length; i++) {
            if (i % 2 == 0) { //  par
                B[i] = 20;
            } else { //  ímpar
                B[i] = 10;
            }
        }

        System.out.println("O vetor B é: ");
        System.out.println("|-----------------------------|");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
