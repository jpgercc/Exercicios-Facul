package bibs;

import java.util.Scanner;

public class Lista22teste {
    public static int[] Lista22Teste() {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            nums[i] = sc.nextInt();
        }
        return nums;
    }
}