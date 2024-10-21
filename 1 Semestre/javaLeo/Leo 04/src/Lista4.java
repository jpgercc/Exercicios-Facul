public class Lista4 {
    public static void main(String[] args) {
        int[] vetorB = new int[20];
        int conta = 0;

        //for e if para calcular numero primo e somar i nos vetores
        for (int i = 0; i < vetorB.length; i++){
            if (i % 2 == 0){ //valores pares //
                vetorB[i] = 20;
                conta++;
            } else {
                vetorB[i] = 10;
            }
        }
        System.out.println("Existem "+ conta +" numeros pares inteiros neste vetor.");
    }
}
/*
4. (ExeVetor04)
Escreva um programa que leia e mostre um vetor de 20 elementos inteiros
(inicializado em tempo de compilação).
 A seguir, conte e diga quantos valores pares existem no vetor.
 */