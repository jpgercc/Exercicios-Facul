package bibs;

import java.util.Scanner;

public class Selecao222 {
    public static int[] Lista222() {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[2];
        for (int i = 0; i < 2; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            valores[i] = sc.nextInt();
        }
        System.out.println("|----------------------------------|");
        return valores;
    }
}
