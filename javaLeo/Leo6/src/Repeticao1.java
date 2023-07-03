import bibs.Repeticao11;
import java.util.Scanner;
//REFAZER
public class Repeticao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int num = sc.nextInt();

        Repeticao11 numeros = new Repeticao11(num);
        numeros.contar();
        numeros.exibirResultados();

        sc.close();
    }
}
