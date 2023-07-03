import java.util.Scanner;

public class Lista6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //fiz um extra

        int [] vetor = new int[30];
        int conta = 0;

        for (int i = 0; i <= 5; i++){
            System.out.println("Escolhar o valor do vetor "+ i);
            vetor[i] = scan.nextInt();
            if (vetor[i] > 0){
                conta++;
                System.out.println("A posicao do vetor é: "+vetor[i] +" e ele é o "+ conta + " vetor positivo");
            }
        }
    }
}
/*

6. (ExeVetor06) Escreva um programa que leia um vetor de 30 posições de números inteiros
(inicializado em tempo de compilação) e mostre somente os positivos com suas
respectivas posições.

 */