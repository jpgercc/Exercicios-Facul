import matriz.Matriz;

public class ExeMatriz02 {
    public static void main(String[] args) {
        Matriz matriz = new Matriz();
        matriz.imprimirMatriz();

        int[] vetorC = matriz.contarNegativosPorLinha();
        System.out.print("Vetor C: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(vetorC[i] + " ");
        }
        System.out.println();

        int soma = matriz.calcularSomaElementos();
        System.out.println("Soma dos elementos da matriz: " + soma);
    }
}
