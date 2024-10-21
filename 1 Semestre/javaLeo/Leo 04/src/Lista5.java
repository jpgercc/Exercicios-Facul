import java.util.Arrays;

public class Lista5 {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6,7,8,9,10};
        int[] B = {1,2,3,4,5,6,7,8,9,10};
        int[] C = new int[10];
        int i = 0;


        while (i < C.length) {
            C[i] = A[i] * B[i];
            i++;
        }
       System.out.println(Arrays.toString(C));
    }
}
/*
(ExeVetor05) Escreva um programa que leia dois vetores (A e B)
 de 10 posições e faça a multiplicação dos elementos
 de mesmo índice em ambos os vetores colocando o resultado
em um terceiro vetor (C). Mostre o vetor resultante
 */