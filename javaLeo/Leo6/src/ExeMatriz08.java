import matrizes.CalculaMatriz;

public class ExeMatriz08 {
    public static void main(String[] args) {
        int[][] matriz = CalculaMatriz.gerarMatriz();
        double media = CalculaMatriz.mediaDiagonalPrincipal(matriz);

        System.out.println("Matriz gerada randomicamente:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" | "+matriz[i][j] + " | ");
            }
            System.out.println();
        }

        System.out.println("Resultado da média dos elementos da diagonal principal: " + media);
    }
}
