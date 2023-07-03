import bibs.Selecao11;
import java.util.Scanner;

//cria classe
public class Selecao1 {
    //cria main para rodar o codigo
    public static void main(String[] args) {
        //cria o scanner
        Scanner input = new Scanner(System.in);

        // le numero
        System.out.print("Digite um numero inteiro: ");
        int num = input.nextInt();

        //chama pacote e cria valor do objeto final
        String produto = Selecao11.calculo(num);

        //imprime
        System.out.println("O numero " + num + " é " + produto);
    }
}
//ExeSelecao02