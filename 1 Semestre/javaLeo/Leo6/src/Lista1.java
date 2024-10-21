import bibs.Lista11;

import java.util.Scanner;

public class Lista1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = sc.nextInt();
        Lista11 calculo = new Lista11();
        int produto = calculo.fucaoo(num1, num2);

        System.out.println("O produto entre " + num1 + " e " + num2 + " é igual a: " + produto);
    }
}
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = sc.nextInt();

        int produto = num1 * num2;

        System.out.println("O produto entre " + num1 + " e " + num2 + " é igual a " + produto);
    }
}

 */