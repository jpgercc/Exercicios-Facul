import java.util.Scanner;

public class L1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = 1500; //alterar p 1500 o numero de notas padrao / n não é necessario no código mas "me soa mais clean
        double[] notas = new double[n]; // cria vetor e armazenamento

        for (int i = 0; i < n; i++){ // i = indice
            System.out.printf("Digite a nota %d: ", i+1); // mostra o valor do indice e o usa como um contador
            notas[i] = scan.nextDouble(); // em notas[i] o indice indica em qual 1500 vetores vai ter guardada a nota
        }
        //calcula media:
        double soma = 0;
        for (int i = 0; i < n; i++){
            soma += notas[i]; // soma += notas[i] é equivalente a soma = soma + notas[i]
        }
        double media = soma / n;

        //exibe resultados:
        System.out.printf("Média: %.2f ", media);
        if (media >= 6){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
