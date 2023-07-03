import bibs.Selecao22;
import bibs.Selecao222;

public class Selecao2 {
    public static void main(String[] args) {

        int[] valores = Selecao222.Lista222();
        int valor1 = valores[0];
        int valor2 = valores[1];

        String produto = Selecao22.calculo(valor1, valor2);
        System.out.println(produto);
    }
}
